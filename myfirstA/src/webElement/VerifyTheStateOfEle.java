package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheStateOfEle {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/home/cowin_signup_form");
		Thread.sleep(2000);
		WebElement submitOpt = driver.findElement(By.name("submit"));
		if(submitOpt.isEnabled()) {
			System.out.println("The submitOpt is enabled ---Method(True)");
			System.out.println("But according to client it is false");
			submitOpt.clear();
		}
		else {
			System.out.println("The submitOpt is enabled -- Method(False)");
			System.out.println("But according to client it is True");
			WebElement acceptTermsOfServiceOpt = driver.findElement(By.xpath("//button[text()= 'Accept Terms of Service']"));
			Thread.sleep(2000);
			WebElement acceptTermsOfServiceCheckBox = driver.findElement(By.id("confbtn"));
			acceptTermsOfServiceCheckBox.clear();
			Thread.sleep(2000);
			WebElement closeOpt = driver.findElement(By.xpath("//button[text() ='close']"));
			closeOpt.click();
			Thread.sleep(2000);
			submitOpt.clear();
			Thread.sleep(2000);
		}
	driver.manage().window().minimize();
	driver.quit();
	
		
	}
	

}
