package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffSet {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
//		WebElement rightClickEle = driver.findElement(By.xpath("//span[text() = 'right click me']"));
//		Actions actions = new Actions(driver);
//		actions.contextClick(rightClickEle).perform();
		WebElement doubleClickEle = driver.findElement(By.xpath("//button[text() = 'Double-Click Me To See Alert']"));
		Actions actions = new Actions(driver);
		actions.doubleClick(doubleClickEle).perform();
		
		
	}

}
