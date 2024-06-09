package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.get("https://www.facebook.com/signup");
		   WebElement monthDropDown = driver.findElement(By.id("month"));
		   Select monthSelect = new Select(monthDropDown);
		   String defaultMonth = monthSelect.getFirstSelectedOption().getText();
		   System.out.println("defaultMonth = " +defaultMonth);
		   Thread.sleep(3000);
		   driver.manage().window().minimize();
		   driver.quit();
		   
	}

}
