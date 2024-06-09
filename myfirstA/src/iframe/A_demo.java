package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.goibibo.com/");
		WebElement canOp = driver.findElement(By.xpath("//span[@class = 'logSprite icClose']"));
		canOp.click();
		WebElement roundTrip = driver.findElement(By.xpath("//p[text() = 'Round-trip']/..//span[@class = 'sc-12foipm-83 TdSAp']"));
		roundTrip.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
		
//		WebElement fromTextField = driver.findElement(By.xpath("//span[text()='From']/..//p[text() = 'Enter city or airport']"));
//		Thread.sleep(2000);
//		fromTextField.sendKeys("Mumbai");
		
//		Thread.sleep(2000);
//		Select se = new Select(fromTextField);
//		se.selectByVisibleText("Mumbai (BOM)");
		
		driver.findElement(By.xpath("//span [@class ='sc-12foipm-22 cUvQPq fswDownArrow'][1]")).click();
		driver.findElement(By.xpath("//p[text() = '5'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text() = 'Done']")).click();
		driver.findElement(By.xpath("//a[text() = 'Done']")).click();
//		driver.findElement(By.xpath("//div[@class = 'sc-12foipm-34 iHoHRr']//div[@class='sc-12foipm-16 wRKJm fswFld '][3]")).click();
//		driver.findElement(By.xpath(" //p[text()='Click to add a return flight for better discounts']")).click();
//		driver.findElement(By.xpath("//p[text() = '6'][1]")).click();
//		driver.findElement(By.xpath("//span[text() = 'Done']")).click();
//		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
