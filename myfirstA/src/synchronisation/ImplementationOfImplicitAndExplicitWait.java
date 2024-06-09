package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplementationOfImplicitAndExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://trello.com");
		WebElement loginLink = driver.findElement(By.xpath
				("//a[contains(@class, 'Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr')]"));
		loginLink.click();
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		driver.findElement(By.id("username")).sendKeys("pnkj86386@gmail.com");
		driver.findElement(By.id("login-submit")).submit();
		driver.findElement(By.id("password")).sendKeys("9300751815");
		driver.findElement(By.id("login-submit")).submit();
		driver.findElement(By.xpath("//span[text() = \"Create new board\"]")).click();
		WebElement boardTitleTextField = driver.findElement(By.xpath("//input[@data-testid= 'create-board-tile']"));
		
//		wait.until(ExpectedConditions.titleIs("Boards | Trello"));
		
		boardTitleTextField.sendKeys("new board is creating");
		WebElement createButton = driver.findElement(By.xpath("//button[text() = 'Create']"));
		if(createButton.isEnabled()) {
//			wait.until(ExpectedConditions.elementToBeClickable(createButton));
			createButton.click();
		}
		else {
			System.out.println("create button is not enabled");
		}
		
		
	
		
		
	}
	

}
