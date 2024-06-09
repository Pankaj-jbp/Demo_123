package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTableState {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com.signup");
		Thread.sleep(2000);
		WebElement customRadioButton = 
				driver.findElement(By.xpath("//label[text() = 'Custom']/..//input[@type = 'radio']"));
		if(customRadioButton.isSelected()) {
			System.out.println("according to the method - - True");
			System.out.println("according to client it is false because it should be not selected");
		}
		else {
			System.out.println("according to the method --false");
			System.out.println("according to client it is true");
			customRadioButton.clear();
			
		}
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
