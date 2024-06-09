package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToEle {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.demo.co-vin.in/");
//		WebElement searchOtp = driver.findElement(By.xpath("//button[text() = 'Search']"));
//	    Actions actions = new Actions(driver);
//	    actions.scrollToElement(searchOtp).perform();
		
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Contact uploading and non-users']"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(ele).perform();
		
		
	}

}
