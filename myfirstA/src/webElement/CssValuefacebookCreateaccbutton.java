package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class CssValuefacebookCreateaccbutton {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement createaccountButton = driver.findElement(By.xpath("//button[text() = 'Log in']"));
		String backgroundcolourofCreateAccount = createaccountButton.getCssValue("background-color");
		System.out.println("Backgroundcolor of create Account  " +backgroundcolourofCreateAccount);
		String bgcolorofcreateAccount = Color.fromString(backgroundcolourofCreateAccount).asHex();
		System.out.println("background colou of create account button " +bgcolorofcreateAccount);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
