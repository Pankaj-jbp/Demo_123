package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import actionsclass.ClickAndHold;

public class ReadTheDataFromPropertyFile {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./data\\commondata01.properties");
		Properties prob = new Properties();
		prob.load(fis);
		String browserName = prob.getProperty("browser");
		System.out.println("browserName  = " +browserName);
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prob.getProperty("url"));
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(prob.getProperty("username"));
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(prob.getProperty("password"));
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
		
		
		
		
	}

}
