package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloApplicationAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//step1 trigger the url
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
		//step7 the trellio board page
		String actualTitle1=driver.getTitle();
		String expectedTitle1 = "Boards | Trello";
		Thread.sleep(1000);
		if(actualTitle1.equals(expectedTitle1)) {
			System.out.println("Pass: The Trello boards page verified and validate and found correct");
		}
		else {
			System.out.println("Failed : The trello boards page verified and validate and found incorrect");
		}
		//step8 create new Board option
		driver.findElement(By.xpath("//button[@data-testid = 'header-create-menu-button']")).click();
		driver.findElement(By.xpath("//button[@data-testid = 'header-create-board-button']")).click();
		//step9 enter the board name 
		driver.findElement(By.xpath("//input[@data-testid ='create-board-title-input']")).sendKeys("India");
		//check the create button availability
		WebElement createButton = driver.findElement(By.xpath("//button[@data-testid = 'create-board-submit-button']"));
		Thread.sleep(1000);
		if(createButton.isEnabled()) {
//			wait.until(ExpectedConditions.elementToBeClickable(createButton));
			createButton.click();
		}
		else {
			System.out.println("create button is not enabled");
		}
	//step10 click on 3 dots
        
		driver.findElement(By.xpath("//button[@aria-label = 'Show menu']")).click();
		
	//	step 11 click on close board
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class = 'board-menu-navigation-item-link board-menu-navigation-item-link-v2 js-close-board']")).click();
	// step 12 click on close button 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value = 'Close']")).click();
		
	//step 13 permanently delete board link
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-testid= 'close-board-delete-board-button']")).click();
		
	//step 14 click on delete button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-testid = 'close-board-delete-board-confirm-button']")).click();
		
		
	// step 15verify trillo boards page 	
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		if(waits.until(ExpectedConditions.titleIs("Boards | Trello"))) {
			System.out.println("pass");
		}
		else {
			System.out.println("Failed");
		}
		

	//step 16 click on account option
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@aria-label ='Pankaj Sharma (pnkj86386)']")).click();
	//step 17 click on logout
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-testid = 'account-menu-logout']")).click();
		
	// step 18 verify logout page
//		if(waits.until(ExpectedConditions.urlContains("https://id.atlassian.com/logout?continue=https%3A%2F%2Ftrello.com%2Flogout%3Fdsc%3D810907d1e6fa6bfd1b372872ef1ccaf5011ef22f3a61224d859fd5e350b5b6cd"))) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("failed");
//		}
		
		
	// step 19 click on logout button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-testid ='logout-button']")).submit();
		
		
	//step 20 verify home page of trello application	

	if(waits.until(ExpectedConditions.titleIs("Manage Your Team’s Projects From Anywhere | Trello"))) {
		System.out.println("pass");
	}
	else {
		System.out.println("failed");
	}


		//check step 20 and 15 and 18 how can we verify url step 18 using explicit wait
		
		
	}

}
