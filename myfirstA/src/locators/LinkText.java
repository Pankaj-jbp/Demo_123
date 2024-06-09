package locators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        WebElement forgottenPWDLink = driver.findElement(By.linkText("Forgotten password?"));
		forgottenPWDLink.click();
		
		
	}

}
