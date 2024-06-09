package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.CircuitBreaker.State;

public class EcourtCaseStatusExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://services.ecourts.gov.in/ecourtindia_v6/?p=casestatus/index&app_token=8993eee5f4d1fbfecfcc6472b093bf61fa756f13ed47b622bd7841d3c1ab0058");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class ='modal-header text-center align-items-start']//button[@aria-label = 'Close']")).click();
		Thread.sleep(2000);
		// state element
		WebElement stateDropDown = driver.findElement(By.id("sess_state_code"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		if(wait.until(ExpectedConditions.titleIs("Home - eCourt India Services"))) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		Select stateSelect = new Select(stateDropDown);
		List<WebElement> allStateOpts = stateSelect.getOptions();
		System.out.println(allStateOpts.size());
		for (WebElement stateOpt : allStateOpts) {
			String optText = stateOpt.getText();
			System.out.println(optText);
			stateSelect.selectByVisibleText(optText);
			if(stateOpt.isSelected()) {
				System.out.println("The state opt is selected");
			}
			else {
				System.out.println("The state opt is not selected");
			}
		}// for select karnataka
		stateSelect.selectByVisibleText("Karnataka");
		// district element	
		Thread.sleep(2000);
		WebElement cityDropDown = driver.findElement(By.id("sess_dist_code"));
		Select citySelect = new Select(cityDropDown);
		List<WebElement> allcityOpts = citySelect.getOptions();
		System.out.println(allcityOpts.size());
		for (WebElement cityOpt : allcityOpts) {
			String opttext = cityOpt.getText();
			System.out.println(opttext);
			citySelect.selectByVisibleText(opttext);
			if(cityOpt.isSelected()) {
				System.out.println("The district opt is selected");
			}
			else {
				System.out.println("The district opt is not selected");
			}
		}  // for select bangalore
		   citySelect.selectByValue("20");
		
		// select court complex
		Thread.sleep(2000);
		WebElement courtDropDown = driver.findElement(By.id("court_complex_code"));
		Select courtSelect = new Select(courtDropDown);
		List<WebElement> allcourtOpts = courtSelect.getOptions();
		System.out.println(allcourtOpts.size());
		for (WebElement courtOpt : allcourtOpts) {
			String opttext = courtOpt.getText();
			System.out.println(opttext);
			courtSelect.selectByVisibleText(opttext);
			if(courtOpt.isSelected()) {
				System.out.println("The court opt is selected");
			}
			else {
				System.out.println("The court opt is not selected");
			}
		}
		
		// court ested court
		Thread.sleep(2000);
		WebElement courtEstDropDown = driver.findElement(By.id("court_est_code"));
		Select courtEstSelect = new Select(courtEstDropDown);
		List<WebElement> allcourtEstOpts = courtEstSelect.getOptions();
		System.out.println(allcourtEstOpts.size());
		for (WebElement courtEstOpt : allcourtEstOpts) {
			String opttext = courtEstOpt.getText();
			System.out.println(opttext);
			courtEstSelect.selectByVisibleText(opttext);
			if (courtEstOpt.isSelected()) {
				System.out.println("The  court est opt is selected");
			}
			else {
				System.out.println("The court est opt is not selected");
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
