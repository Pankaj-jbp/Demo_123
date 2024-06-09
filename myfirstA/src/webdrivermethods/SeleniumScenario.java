package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScenario {
	public static void main(String[] args)  throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/";
		System.out.println(actualURL);
		System.out.println(expectedURL);
		if (actualURL.equals(expectedURL)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Failed");
		}
		
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "https://www.amazon.in/";
		System.out.println("actualTitle is = " +actualTitle);
		System.out.println("expectedTitle is = " +expectedTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Failed");
		}
		
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.shopsy.in/");
		Dimension definedSize = new Dimension(200,600);
		driver.manage().window().setSize(definedSize);
		
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.dunzo.com/bangalore");
		driver.close();

		Thread.sleep(000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		 Set<String> allWids = driver.getWindowHandles();
		    System.out.println(allWids);
		    driver.quit();
		    

//		for (String wid : allWids) {
//	    	String widTitle = driver.switchTo().window(wid).getTitle();
//	    	System.out.println(widTitle);
//	    	if (widTitle.equals("Facebook - log in or sign up ")) {
//	    		
//	    	}
//	    	else if (widTitle.equals("Sign up for Facebook | Facebook")) {
//	    		String signUpPageURL = driver.getCurrentUrl();
//	    		System.out.println("signUpPageURL = " + signUpPageURL);
//
//       driver.quit();
//       
//	    	}
//		}	
	}

}

