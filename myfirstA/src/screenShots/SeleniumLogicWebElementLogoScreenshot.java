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

public class SeleniumLogicWebElementLogoScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		driver.get("https://www.royalchallengers.com/");
		WebElement rcblogo = driver.findElement(By.xpath("//div[@class='hdr-logo']/."));
		File temp = rcblogo.getScreenshotAs(OutputType.FILE);
		File perm = new File("./bugelement/"+timeStamp+"rcblogo2.png");
		FileUtils.copyFile(temp, perm);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
