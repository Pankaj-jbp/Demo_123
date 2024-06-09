package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/login/identify");
	    Set<String> allWids = driver.getWindowHandles();
	    System.out.println(allWids.size());
	    for (String wid : allWids) {
	    	String widTitle = driver.switchTo().window(wid).getTitle();
	    	System.out.println(widTitle);
	    	if(widTitle.equals("Facebook - log in or sign up")) {
	    		
	    	}
	    	else if(widTitle.equals("Forgotten Password | Can't Log In | Facebook ")) {
	    		driver.close();
	    	}
	    }
	    driver.manage().window().minimize();
	    driver.quit();
		
	}

}
