package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheYaxisOfEmailAndPassword {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		WebElement emailTextField = driver.findElement(By.xpath("//input[@placeholder='Email or phone']"));
		int emailStartY = emailTextField.getLocation().getY();
		System.out.println("emailStartY =" +emailStartY);
		WebElement passTextField = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
		int passStartY = passTextField.getLocation().getY();
		System.out.println("passStartY =" +passStartY);
        
		if(emailStartY==passStartY){
			System.out.println("Pass: email and pass verified y field and found incorrect");
		}
		else {
			System.out.println("Failed: email and pass verified y field and found incorrect");
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
