package actionsclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA_FindHowManylinkpresentinwebpage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  for(WebElement link : links) {
			  String href = link.getAttribute("href");
			  System.out.println(href);
			  
			  
		  }
		
	}

}
