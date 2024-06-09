package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToEle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement menOpt = driver.findElement(By.xpath("//div [@class = 'desktop-navLink']/a[text() = 'Men']"));
		WebElement womenOpt = driver.findElement(By.xpath("//div [@class = 'desktop-navLink']/a[text() = 'Women']"));
		WebElement kidsOpt = driver.findElement(By.xpath("//div [@class = 'desktop-navLink']/a[text() = 'Kids']"));
		WebElement homeandlyfOPt = driver.findElement(By.xpath("//div [@class = 'desktop-navLink']/a[text() = 'Home & Living']"));
		WebElement beautyOpt = driver.findElement(By.xpath("//div [@class = 'desktop-navLink']/a[text() = 'Beauty']"));
		WebElement studioOpt = driver.findElement(By.xpath("//div [@class = 'desktop-navLink']/a[text() = 'Studio']"));
		Actions actions = new Actions(driver);
//		actions.moveToElement(menOpt).pause(1000).moveToElement(womenOpt).pause(1000).moveToElement(kidsOpt).pause(1000).moveToElement(homeandlyfOPt).pause(1000).
//		moveToElement(beautyOpt).pause(1000).moveToElement(studioOpt).build().perform();
		
//		actions.moveToElement(menOpt, 0, 0).pause(2000).moveToElement(menOpt, 75, 0).pause(2000).moveToElement(womenOpt, 76, 0).pause(2000).
//		moveToElement(kidsOpt, 99, 0).pause(2000).moveToElement(homeandlyfOPt, 108, 0).pause(2000).moveToElement(beautyOpt, 84, 0).build().perform();
		
//		actions.moveToElement(menOpt, 0, 0).pause(2000).moveToElement(menOpt, 75, 0).pause(2000).moveToElement(menOpt, 150, 0).pause(2000).moveToElement(menOpt, 150, 0).pause(2000).
//		moveToElement(menOpt, 248, 0).pause(2000).moveToElement(menOpt, 356, 0).pause(2000).moveToElement(menOpt, 440, 0).build().perform();
		actions.moveToElement(menOpt, 0, 0).pause(2000).moveToElement(menOpt, 440, 0).perform();
		
		
				
				
	}

}
