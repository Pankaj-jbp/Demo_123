package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCode {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.netflix.com/in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.dunzo.com/bangalore");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.ajio.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids.size());
		for(String wid : allWids) {
			
			String url = driver.switchTo().window(wid).getCurrentUrl();
			System.out.println(url);
			if(url.equals("https://www.facebook.com/")) {
				System.out.println("verified");
			}
			else if(url.equals("https://www.dunzo.com/bangalore")) {
				Dimension size = new Dimension(200,600);
				driver.manage().window().setSize(size);
				
			}
			else if(url.equals("https://ajio.com/")) {
				driver.close();
			}
			String widTitle = driver.switchTo().window(wid).getCurrentUrl();
			if(wid.equals("sale")) {
				System.out.println("opened");
			}
			else {
				
			}
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
