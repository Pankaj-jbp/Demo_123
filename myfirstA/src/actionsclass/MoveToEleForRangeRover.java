package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToEleForRangeRover {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.landrover.com/range-rover/range-rover/index.html");
		WebElement vehicleOpt = driver.findElement(By.xpath("//a[@aria-label = 'EXPLORE VEHICLES']"));
		Actions actions = new Actions(driver);
			
		
		
				
	}

}
