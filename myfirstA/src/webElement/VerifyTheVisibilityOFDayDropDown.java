package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheVisibilityOFDayDropDown {
	public static void main(String[] args) {
		//element is also present and source code is also presend
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		if(dayDropDown.isDisplayed()) {
			System.out.println("according to method ---- True");
			System.out.println("according to client -- True");
			
		}
		else {
			System.out.println("According to method -- False");
			System.out.println("According to client -- False");
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
