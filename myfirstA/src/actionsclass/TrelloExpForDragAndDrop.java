package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloExpForDragAndDrop {            // not need to write this script already created
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://trello.com");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Manage Your Team’s Projects From Anywhere | Trello";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: The actual Title of Trello is verified and found correct");
		}
		else {
			System.out.println("Failed :The actual tile to Trelllo is verified and found incorrect");
		}
		//step2 click on login button
		driver.findElement(By.xpath("//a[@class= 'Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		//step3 enter the email 
		driver.findElement(By.id("username")).sendKeys("pnkj86386@gmail.com");
		Thread.sleep(1000);
	//step4 and click on continue
		driver.findElement(By.id("login-submit")).submit();
		Thread.sleep(1000);
		//step5 enter the password 
		driver.findElement(By.id("password")).sendKeys("9300751815");
		Thread.sleep(1000);
		//step6 click on login
		driver.findElement(By.id("login-submit")).submit();
		Thread.sleep(1000);
		WebElement scrollele = driver.findElement(By.xpath("//div[@class ='board-tile-details-sub-container']"));
		scrollele.click();
	
		
		Actions actions = new Actions(driver);
		
		
		WebElement draggable1 = driver.findElement(By.xpath("//a[text() ='collection']"));
		WebElement droppable1 = driver.findElement(By.xpath("//h2[text() ='java']"));
		actions.clickAndHold(draggable1).release(droppable1).perform();
		
		
		
		
	}

}
