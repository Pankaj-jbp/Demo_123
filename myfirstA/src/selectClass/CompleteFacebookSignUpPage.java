
package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompleteFacebookSignUpPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//step1 trigger the url
		driver.get("https://www.facebook.com/signup");
		//step2 first name
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("pankaj");
		//step 3 surname
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("sharma");
		//step 4 mobile no 
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("pnkj09877@gmail.com");
		
		//step 5 reenter emailaddress
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pnkj09877@gmail.com");
		
		//step 6 password
		Thread.sleep(1000);
		driver.findElement(By.id("password_step_input")).sendKeys("xyz@123");
		
		//step 7 dob drop down day, month, year
		Thread.sleep(1000);
		WebElement daydropdown = driver.findElement(By.id("day"));
		Select daySelect = new Select(daydropdown);    // dob 10/ dec / 2001
		daySelect.selectByIndex(9);
		Thread.sleep(1000);
		WebElement monthdropdonw = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthdropdonw);
		monthSelect.selectByValue("12");
		Thread.sleep(1000);
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yeardropdown);
		yearSelect.selectByVisibleText("2001");
		
		//step 8 gender 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value = '2']")).click();	
		
		//step 9 signup
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
	}
	

}
