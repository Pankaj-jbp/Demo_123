package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckTheDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		WebElement dobDropDown = driver.findElement(By.id("day"));
		String dateTag = dobDropDown.getTagName();
		WebElement monthDrop = driver.findElement(By.id("month"));
		String monthTag = monthDrop.getTagName();
		WebElement yeardrop = driver.findElement(By.id("year"));
		String yearTag = yeardrop.getTagName();
		if(dateTag.equals("select")&& monthTag.equals("select")&& yearTag.equals("select")) {
			System.out.println("Pass: date, month,year tags are verified and found correct");
		}
		else {
			System.out.println("Fail: date,month,year tags are verified and found incorrect");
		}
		
		
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
