package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		String emailTagName = emailTextField.getTagName();
		if(emailTagName.equals("input")) {
			
			emailTextField.sendKeys("pankaj@123");
		}
		else {
			System.out.println("The text Field is not created with input tag so we will not be able to append the data");
		}
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
