package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfID {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
//		 WebElement emailTextField = driver.findElement(By.id("email")); 
//		 emailTextField.sendKeys("pankaj@gmail.com");
//		 if address is wrong 
//		  org.openqa.selenium.NoSuchElementException 
//		  sel----run ----unchecked
		WebElement passwordTextField=driver.findElement(By.id("pass"));
		 passwordTextField.sendKeys("abc@gmail.com");
		 Thread.sleep(2000);
		 driver.manage().window().minimize();
		 driver.quit();
		 
	}

}
