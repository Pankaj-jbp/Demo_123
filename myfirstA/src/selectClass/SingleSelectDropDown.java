package selectClass;

import java.time.Duration;

import org.bouncycastle.jcajce.provider.symmetric.IDEA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {
	// 11/12/2000
	// day by using index 
	// month by using value
	// year by using visible
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://www.facebook.com/signup");
	    Thread.sleep(1000);     //SELECTBYINDEX--------------/---------------------
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select dayselect = new Select(dayDropDown);
		dayselect.selectByIndex(10);                                     // value, visible text
		Thread.sleep(1000);
	    //---------------------SELECTBYVALUE--------------------/
//	    WebElement dayDropDown = driver.findElement(By.id("day"));
//	    Select dayselect = new Select(dayDropDown);
//	    dayselect.selectByValue("11");
//	    Thread.sleep(1000);
	    // -------------------SELECTBY VISIBLE TEXT---------------------//
//	    WebElement dayDropDown = driver.findElement(By.id("day"));
//	    Select dayselect = new Select(dayDropDown);
//	    dayselect.selectByVisibleText("11");
	    
	   //----------------------------------------------------------------------------//
		//---------------selectbyvalue--------------------------------
//		WebElement monthdropdown = driver.findElement(By.id("month"));     // index, visible text
//		Select monthselect = new Select(monthdropdown);
//		monthselect.selectByValue("12");
	    //----------------------------------selectbyindex-------------------
	    
//	    WebElement mothdropdown = driver.findElement(By.id("month"));
//	    Select monthSelect = new Select(mothdropdown);
//	    monthSelect.selectByIndex(11);
	    //-----------------------selectby visible text ----------------------------
	    WebElement monthdropdown = driver.findElement(By.id("month"));
	    Select monthSelect = new Select(monthdropdown);
	    monthSelect.selectByVisibleText("Dec");
	    
//	    -----------------------SElectbyvisible text-----------------------
//		Thread.sleep(1000);                                            
//		WebElement yeardropdown = driver.findElement(By.id("year"));
//		Select yearselect = new Select(yeardropdown);
//		yearselect.selectByVisibleText("2000");  	// index, value
	    
	    //----------------------select by index---------------
//	    WebElement yeardropdown = driver.findElement(By.id("year"));
//	    Select yearSelect = new Select(yeardropdown);
//	    yearSelect.selectByIndex(24);
	    
	    // ------------------------select by value--------------
       WebElement yeardropdown = driver.findElement(By.id("year"));
       Select yearSelect = new Select(yeardropdown);
       yearSelect.selectByValue("2020");
	    
		
	    
		
		
		// index, value
		Thread.sleep(1000);
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		
		
		
	}
	

}
