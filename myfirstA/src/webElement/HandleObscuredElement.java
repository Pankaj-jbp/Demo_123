package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleObscuredElement {
	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.com/");
       Thread.sleep(2000);
      WebElement dismissOption = driver.findElement(By.xpath
    		  ("//input[@data-action-type = 'DISMISS']/..//input[@type = 'submit']"));
      
       dismissOption.click();
       Thread.sleep(2000);
      WebElement customerServiceLink = driver.findElement(By.xpath("//a[text() = 'Customer Service']"));
       customerServiceLink.click();
//       
	}

}
