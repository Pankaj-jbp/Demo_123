package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YearOpts {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://www.facebook.com/signup");
	    WebElement yearDropDown = driver.findElement(By.id("year"));
	    Select yearSelect = new Select(yearDropDown);
	    List<WebElement> allYearOpts = yearSelect.getOptions();
	    System.out.println(allYearOpts.size());
	    for (WebElement yearopt : allYearOpts) {
			String optText = yearopt.getText();
			System.out.println(optText);
			yearSelect.selectByVisibleText(optText);
			
			if(yearopt.isSelected()) {
				System.out.println("The opt is selected");
			}
			else {
				System.out.println("The opt is not selected");
			}
			
			
		}
	    
	    
	}

}
