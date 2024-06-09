package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StateOfDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://www.facebook.com/signup");
	    Thread.sleep(2000);
	    WebElement dayDropDown = driver.findElement(By.id("day"));
	    Select daySelect = new Select(dayDropDown);
	    if(daySelect.isMultiple()) {
	    	System.out.println("The drop is multi select");
	    }
	    else {
	    	System.out.println("The drop down is single select");
	    	daySelect.selectByIndex(25);
	    }
	    Thread.sleep(3000);
	    driver.manage().window().minimize();
	    driver.quit();
	    
	
	
	}

}
