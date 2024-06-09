package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFacebookText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement facebookText = driver.findElement(By.xpath("//h2[text() = 'Facebook helps you connect and share with the people in your life.']"));
		String facebookData = facebookText.getText();
		if(facebookData.equals("Facebook helps you connect and share with the people in your life.")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
