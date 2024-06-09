package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetRect {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//email
		WebElement emailTextField = driver.findElement(By.id("email"));
		int emailStartX = emailTextField.getRect().getX();
		System.out.println("emailStartX" + emailStartX);
		int emailWidth = emailTextField.getRect().getWidth();
		System.out.println("emailWidth ="+emailWidth);
		int emailEndPoint = emailStartX + emailWidth;
		System.out.println("emailEndPoint = " +emailEndPoint);
		//password
		WebElement passwordTextField = driver.findElement(By.id("passContainer"));
		int passStartX = passwordTextField.getRect().getX();
		System.out.println("passStartX =" +passStartX);
		int passWidth = passwordTextField.getRect().getWidth();
		System.out.println("passWidth =" +passWidth);
		int passEndPoint = passStartX + passWidth;
		System.out.println("passEndPoint =" +passEndPoint);
		if(emailEndPoint== passEndPoint) {
			System.out.println("Pass :The email and password point is verified and found correct");
		}
		else {
			System.out.println("Failed : The email and password point is verified and found incorrect");
		}
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		
	}

}
