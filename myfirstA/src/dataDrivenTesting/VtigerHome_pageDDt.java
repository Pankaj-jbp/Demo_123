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

public class VtigerHome_pageDDt {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./data\\commondata02.properties");
		Properties prob = new Properties();
		prob.load(fis);
		String browserName = prob.getProperty("browser");
//		System.out.println("browserName =" +browserName);
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
		Thread.sleep(1000);
		WebElement userNameTextField = driver.findElement(By.id("username"));
		Thread.sleep(1000);
		userNameTextField.clear();
		userNameTextField.sendKeys(prob.getProperty("username"));
		WebElement passwordTextField = driver.findElement(By.id("password"));
		Thread.sleep(1000);
		passwordTextField.clear();
		passwordTextField.sendKeys(prob.getProperty("password"));
		WebElement signInButton = driver.findElement(By.xpath("//button[text() ='Sign in']"));
		Thread.sleep(1000);
		signInButton.submit();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		
	}

}
