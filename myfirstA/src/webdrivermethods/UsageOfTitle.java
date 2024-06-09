package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfTitle {
       public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		//capture the title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		System.out.println("actualTitle is = " +actualTitle);
		System.out.println("expectedTitle is = " +expectedTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: The actual titile of facebook is verified and found correct");
		}
		else {
			System.out.println("Failed: the actual titile of facebook is verified and found incorrect ");
		}
		
	}
}
