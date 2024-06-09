package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotUsingSeleniumLogic {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.nykaafashion.com/");
		TakesScreenshot te = (TakesScreenshot)driver;
		File temp = te.getScreenshotAs(OutputType.FILE);
		File permfile = new File("./bugggshorts/nyka.png");
	    FileUtils.copyFile(temp, permfile);
	    driver.manage().window().minimize();
	    driver.quit();
	    
	}

}
