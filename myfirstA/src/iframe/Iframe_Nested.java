package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Nested {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		WebElement childFrame = driver.findElement(By.tagName("h1"));
		String childFrameText = childFrame.getText();
		System.out.println("childframeText  =" +childFrameText);
		
		driver.switchTo().parentFrame();
		String parentFrameText = driver.findElement(By.tagName("p")).getText();
		System.out.println("ParentFrameText = " +parentFrameText);
		driver.manage().window().minimize();
		
		
		
	}

}
