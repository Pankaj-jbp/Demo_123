package webdrivermethods;
//launch 5 windows
//1) transfer your driver control to the first window and verify and validate the url
//of the page (first window page)
//2)transfer your driver control to the second window and verify the title.
//3) transfer your driver control to the third window and set the size defined size is 200, 600
//4)transfer your driver control to the fourth window and close the window.
//5)Terminate the session.
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloneSeleniumScenario {
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
				String actualURL = driver.getCurrentUrl();
				String expectedURL = "https://www.facebook.com/";
				if(actualURL.equals(expectedURL)) {
					System.out.println("verified");
				}
				
			}
			
			else if(url.equals("https://www.netflix.com/in/")) {
				String actualTitle = driver.getTitle();
				String expectedTitle = "Netflix India – Watch TV Shows Online, Watch Movies Online";
				if(actualTitle.equals(expectedTitle)) {
					System.out.println("verified");
				}
			}
			else if(url.equals("https://www.dunzo.com/bangalore")) {
				Dimension size = new Dimension(200,600);
				driver.manage().window().setSize(size);
				
			}
			else if(url.equals("https://ajio.com/")){
				driver.close();
					}
			else if (url.equals("https://www.flipkart.com/")) {
				driver.quit();
			
			}
			
			}

}
}
