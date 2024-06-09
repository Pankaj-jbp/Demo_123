package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forgottenpwdLink = driver.findElement(By.xpath("//a[contains(@href, 'https://www.facebook.com/recover/initiate/?privacy')]"));
	    String linkText = forgottenpwdLink.getText();
	    if(linkText.equals("Forgotten password?")) {
	    	forgottenpwdLink.click();
	    	
	    }
	    else {
	    	System.out.println("Fail");
	    }
	    driver.manage().window().minimize();
	    driver.quit();
	    
	}

}
