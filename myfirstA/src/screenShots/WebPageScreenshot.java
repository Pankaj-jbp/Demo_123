package screenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		TakesScreenshot te = (TakesScreenshot)driver;
		File temp = te.getScreenshotAs(OutputType.FILE);
		File permfile = new File("./defectshorts/myntra.png");
	    FileUtils.copyFile(temp, permfile);
	    driver.manage().window().minimize();
	    driver.quit();
	    
	    
	}

}
