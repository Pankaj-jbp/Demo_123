package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class MalaichaRegisterButtonCssValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		WebElement registerButton = driver.findElement(By.xpath("//button[text() = 'Register']"));
		String backgroundColorOfRegisterButton = registerButton.getCssValue("background-color");
		System.out.println("backgroundColorOfRegisterButton +" +backgroundColorOfRegisterButton);
		String bgColorOfReg = Color.fromString(backgroundColorOfRegisterButton).asHex();
		System.out.println("bgColorOfReg =" +bgColorOfReg);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
