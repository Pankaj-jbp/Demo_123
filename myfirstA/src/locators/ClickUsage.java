package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUsage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	WebElement loginButton = driver.findElement(By.id("login"));
	     loginButton.click();
	     Thread.sleep(2000);
	     driver.manage().window().minimize();
	     driver.quit();
	     
	     
	}

}
