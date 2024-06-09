package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/signup ");
		Thread.sleep(2000);
		//capture all the window id's
	    Set<String> allWids = driver.getWindowHandles();
	    System.out.println(allWids);
	    for (String wid : allWids) {
	    	String widTitle = driver.switchTo().window(wid).getTitle();
	    	System.out.println(widTitle);
	    	if (widTitle.equals("Facebook - log in or sign up ")) {
	    		
	    	}
	    	else if (widTitle.equals("Sign up for Facebook | Facebook")) {
	    		String signUpPageURL = driver.getCurrentUrl();
	    		System.out.println("signUpPageURL = " + signUpPageURL);
	    	    //Size
	    		int signUpHeight = driver.manage().window().getSize().getHeight();
	    		System.out.println("signUpHeight = " +signUpHeight);
	    		int signUpWidth = driver.manage().window().getSize().getWidth();
	    		System.out.println("signUpWidth = "  +signUpWidth);
	    		//Position
	    		int signUpXAxis = driver.manage().window().getPosition().getX();
	    		System.out.println("signUpXaxis = " +signUpXAxis);
	    		int signUpYAxis = driver.manage().window().getPosition().getY();
	    		System.out.println("signUpYAxis = " +signUpYAxis);
	    	}
	    }
	}

}




















