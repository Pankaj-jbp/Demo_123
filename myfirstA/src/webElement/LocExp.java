package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocExp {
	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?r=101");
		WebElement firstnameTextField = driver.findElement(By.name("firstname"));
		int firstnameXAXIS = firstnameTextField.getLocation().getX();
		int firstnameYAXIS = firstnameTextField.getLocation().getY();
		WebElement lastnameTextField = driver.findElement(By.name("lastname"));
		int lastnameXAXIS = lastnameTextField.getLocation().getX();
		int lastnameYAXIS = lastnameTextField.getLocation().getY();
		if(firstnameYAXIS == lastnameYAXIS) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		WebElement emailTextField = driver.findElement(By.name("reg_email__"));
		       int emailXAXIZ = emailTextField.getLocation().getX();
		       int emailYAXIS = emailTextField.getLocation().getY();
		       
		       if(firstnameXAXIS==emailXAXIZ) {
		    	   
		       
		       System.out.println("Passed");
	}
		       else {
		   		System.out.println("Failed");
		   	}
		       driver.manage().window().minimize();
		       driver.quit();
	}
	

}
