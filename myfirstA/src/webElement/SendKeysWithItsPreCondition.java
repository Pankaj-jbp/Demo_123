package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithItsPreCondition {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		Thread.sleep(2000);
		usernameTextField.sendKeys("admin");
		Thread.sleep(2000);
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		Thread.sleep(2000);
		passwordTextField.sendKeys("admin");
		Thread.sleep(2000);
		WebElement signInButton = driver.findElement(By.xpath("//button[text() = 'Sign-in]"));
		signInButton.submit();
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
