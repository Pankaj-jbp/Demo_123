package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLogicWebelementScript {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');

		driver.get("https://www.facebook.com");
		WebElement loginButton = driver.findElement(By.name("login"));
		File temp = loginButton.getScreenshotAs(OutputType.FILE);
		File perm = new File("./bugelement/"+timeStamp+"rcblogo2.png");
		FileUtils.copyFile(temp, perm);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
