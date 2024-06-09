package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aa {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/bangalore");
		WebElement petSupplierImg = driver.findElement(By.xpath("//a[@class = 'sc-fzoiQi lbhjWt sc-blgsrr-4 bNplSl']"));
	     String perSupplierALT = petSupplierImg.getAttribute("alt");
	     System.out.println("perSupplierALT value is = " +perSupplierALT);
		
		
	}

}
