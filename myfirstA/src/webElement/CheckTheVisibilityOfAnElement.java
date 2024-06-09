package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheVisibilityOfAnElement {
	
		//element is not is present in the UI of an application by the element source code is present in the HTML
		//document[not to use idDisplayed () upon this scenario]
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement invisibleElement = driver.findElement(By.name("preferred_pronoun"));
		if(invisibleElement.isDisplayed()) {
			System.out.println("method -- True");
			System.out.println("Client --- False");
		}
		else {
			System.out.println("method -- False");
			System.out.println("client -- True");
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}	
	

}
