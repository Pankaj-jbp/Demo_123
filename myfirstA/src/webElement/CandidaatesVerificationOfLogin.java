package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CandidaatesVerificationOfLogin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement loginButton = driver.findElement(By.name("login"));
		if (loginButton.isEnabled()) {
			loginButton.submit();
			System.out.println("a/c to client ----True");
		}
		else {
			System.out.println("The button is disabled -- (without --false)");
			System.out.println("a/c to client ---false");
		}
	}

}
