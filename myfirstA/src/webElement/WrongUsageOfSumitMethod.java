package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfSumitMethod {
	
		//java.lang.UnsupportedOperationException
		//run ---- unchecked
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
		 WebElement registeroption = driver.findElement(By.xpath("//button[text() = 'Register']"));
	    registeroption.submit();
	    
	}	


}
