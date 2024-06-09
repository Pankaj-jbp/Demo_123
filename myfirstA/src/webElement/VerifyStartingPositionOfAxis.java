package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyStartingPositionOfAxis {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//email x -axis
		WebElement emailTextField = driver.findElement(By.id("email"));
		int emailStartX = emailTextField.getLocation().getX();
		System.out.println("emailStartX =" +emailStartX);
		//password x - axis
		WebElement passTextField = driver.findElement(By.id("passContainer"));
		int passStrtX = passTextField.getLocation().getX();
		System.out.println("passStrtX = " +passStrtX);
		if (emailStartX== passStrtX) {
			System.out.println("Pass: The starting location of email and pass is verified and found correct ");
		}
		else {
			System.out.println("Failed: The starting location of email and pass is verified and found incorrect ");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
