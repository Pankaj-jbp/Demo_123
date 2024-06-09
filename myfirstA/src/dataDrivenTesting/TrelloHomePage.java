package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloHomePage {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./data\\commondata03.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String browserName = pro.getProperty("browser");
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver =new FirefoxDriver();
		}
		else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(pro.getProperty("url"));
		driver.findElement(By.xpath("//a[@class= 'Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
		driver.findElement(By.id("username")).sendKeys(pro.getProperty("username"));
		driver.findElement(By.id("login-submit")).submit();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(pro.getProperty("password"));
		Thread.sleep(1000);
		driver.findElement(By.id("login-submit")).submit();
		Thread.sleep(1000);
		String actualTitle1=driver.getTitle();
		String expectedTitle1 = "Boards | Trello";
		Thread.sleep(1000);
		if(actualTitle1.equals(expectedTitle1)) {
			System.out.println("Pass: The Trello boards page verified and validate and found correct");
		}
		else {
			System.out.println("Failed : The trello boards page verified and validate and found incorrect");
		}
		

		
	}

}
