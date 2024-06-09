package synchronisation;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOutExp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		try {
			driver.get("https://www.flipkart.com/");
			
		} catch (TimeoutException e) {
			System.out.println("The flipkart appln is not having the capacity to load page within specified time");
		}
		
	}

}
