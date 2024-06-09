package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheSizeOfFBSignUppage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?r=101");
		WebElement firstnameTextField = driver.findElement(By.name("firstname"));
		int firstnameHeight = firstnameTextField.getSize().getHeight();
		int firstnameWidth = firstnameTextField.getSize().getWidth();
		WebElement lastnameTextField = driver.findElement(By.name("lastname"));
		int lastnameHeight = lastnameTextField.getSize().getHeight();
		int lastnamewidth = lastnameTextField.getSize().getWidth();
		if(firstnameHeight==lastnameHeight) {
			System.out.println("passed");
		}
		else {
			System.out.println("Failed");
		}
		WebElement mobileTextField = driver.findElement(By.name("reg_email__"));
		int mobFieldHeight = mobileTextField.getSize().getHeight();
		int mobFieldWidth = mobileTextField.getSize().getWidth();
		if(firstnameHeight==mobFieldHeight) {
			System.out.println("passed");
		}
		else {
		   System.out.println("Failed");
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
