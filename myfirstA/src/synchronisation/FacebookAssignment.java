package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//step1 trigger the url
		driver.get("https://www.facebook.com");
		//step2 forgotten password link
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//step3 enter email 
		driver.findElement(By.xpath("//input[@placeholder = 'Email or phone']")).sendKeys("xyz@gmail.com");
		
		//step4 enter password 
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("123456");
		
		//step 5 click on login
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label = 'Accessible login button']")).click();
		
		driver.manage().window().minimize();
		driver.quit();
		
		
		
	}

}
