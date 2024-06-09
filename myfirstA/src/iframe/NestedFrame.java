package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		WebElement iframewithinanIframe = driver.findElement(By.linkText("Iframe with in an Iframe"));
		iframewithinanIframe.click();
		WebElement parentFrame = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
		driver.switchTo().frame(parentFrame);
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));
		driver.switchTo().frame(childFrame);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Selenium");
		
		
		
		
	}

}
