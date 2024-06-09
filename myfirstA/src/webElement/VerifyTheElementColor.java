package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyTheElementColor {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();   // rbga (24,119,242,1) // #18777f2
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	 	WebElement loginButton = driver.findElement(By.name("login"));
	 	String backgroundColourOfLogin = loginButton.getCssValue("background-color");
	 	System.out.println("backgroundColourOfLogin = " +backgroundColourOfLogin);
	 	//color is sel class
	 	//fromString()--static method --- color class
	 	//asHex()--- non static method ---- from color class --- return type is String 
	 	String hexadecimalValue = Color.fromString(backgroundColourOfLogin).asHex();
	 	System.out.println("hexadecimalValue  =" +hexadecimalValue);
	 	Thread.sleep(2000);
	 	driver.manage().window().minimize();
	 	driver.quit();
	 	

		
	}

}
