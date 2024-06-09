package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aa {
	// not need to write this one script
	//wrong querry
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement signupFrame = driver.findElement(By.xpath("//iframe[1]"));
        		driver.switchTo().frame(signupFrame);
        		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
        		driver.findElement(By.id("password")).sendKeys("password");
        		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
        		driver.switchTo().defaultContent();
        		WebElement loginFrame = driver.findElement(By.xpath("//iframe[2]"));
        		driver.switchTo().frame(loginFrame);
        		driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
        		driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
        		
		
	}

}
