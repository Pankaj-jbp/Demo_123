package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchTheEmptyChromeBrowser {
         public static void main(String[] args) {
			// launching the empty chrome browser
        	 //OOAD
        WebDriver	driver = new ChromeDriver();
//        driver.getTitle();
//        driver.getCurrentUrl();
//        driver.getWindowHandle();
//        driver.getWindowHandles();
//        driver.getPageSource();
//        driver.get(null);
//        driver.manage();
//        driver.switchTo();
//        driver.navigate();
//        driver.close();
//        driver.quit();
          driver.get("https://www.facebook.com");
		}
}
