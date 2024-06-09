package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AKeyUpandKeyDown {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Actions action = new Actions(driver);
		WebElement usernameText= driver.findElement(By.id("username"));
		action.keyDown(usernameText,Keys.CONTROL).sendKeys(usernameText,"a")
		.keyUp(usernameText,Keys.CONTROL).sendKeys(usernameText,Keys.DELETE).sendKeys(usernameText,"admin").perform();
		
		WebElement passwordText= driver.findElement(By.id("password"));
		action.keyDown(passwordText,Keys.CONTROL).sendKeys(passwordText,"a")
		.keyUp(passwordText,Keys.CONTROL).sendKeys(passwordText,Keys.DELETE).sendKeys(passwordText,"admin123@").perform();
		
		
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
