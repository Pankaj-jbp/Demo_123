package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodDefaultCapacity {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.facebook.com/");
	    WebElement contactuploadingandnonUsersLink = driver.findElement
	    		(By.linkText("Contact uploading and non-users"));
		  contactuploadingandnonUsersLink.click();
		  Thread.sleep(2000);
		  driver.manage().window().minimize();
		  driver.quit();
}
}