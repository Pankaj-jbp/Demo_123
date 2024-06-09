package webElement;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookOperation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String username = "pankaj";
        String password = "sharma@123";
		WebElement emailTextField = driver.findElement(By.id("email"));
			
		WebElement passTextField = driver.findElement(By.id("pass"));
		
		// facebook login sign up without using sendkeys 
		
		
			
			

		
		
		
		
	}

}
