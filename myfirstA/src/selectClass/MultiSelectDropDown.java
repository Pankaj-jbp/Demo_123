package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://demo.mobiscroll.com/jquery/select/multiple-select#");
	    WebElement multiDropDown = driver.findElement(By.xpath("//span[@class = 'mbsc-select-icon mbsc-select-icon-outline mbsc-ltr mbsc-ios mbsc-select-icon-stacked mbsc-icon mbsc-ios']"));
	    Select multiSelect = new Select(multiDropDown);
	    if(multiSelect.isMultiple()) {
	    	System.out.println("The drop down is multi select");
	    	multiSelect.selectByVisibleText("Books");
	    	
	    }
	    else {
	    	System.out.println("The drop down is single select");
	    }
	
	
	
	}

}
