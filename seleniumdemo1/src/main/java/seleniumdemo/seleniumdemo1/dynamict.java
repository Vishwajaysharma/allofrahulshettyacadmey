package seleniumdemo.seleniumdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamict {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
		Thread.sleep(1000);
	     driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
	    
		driver.close();
		driver.quit();
	}

}
