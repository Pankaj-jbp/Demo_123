package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class UsageOfURL {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		//capture the url
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/";
		System.out.println(actualURL);
		System.out.println(expectedURL);
		if (actualURL.equals(expectedURL)) {
			System.out.println("Pass: The actual URL of facebook is verified and found correct");
		}
		else {
			System.out.println("Failed: The actual URL of facebook is verified and found incorrect");
		}
		
	}

}
