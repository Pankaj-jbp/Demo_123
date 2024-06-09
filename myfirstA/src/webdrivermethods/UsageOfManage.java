package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {
	public static void main(String[] args) throws InterruptedException{
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com");
	    Thread.sleep(2000);
	    driver.manage().window().minimize();
	    Thread.sleep(3000);
//	    driver.manage().window().fullscreen();
	    driver.close();
//	    driver.quit();
		
	}

}
