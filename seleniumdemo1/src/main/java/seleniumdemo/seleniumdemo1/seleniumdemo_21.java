package seleniumdemo.seleniumdemo1;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class seleniumdemo_21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//	ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("inputPassword")).sendKeys("sdfghjkkdfghj");
		driver.findElement(By.id("inputUsername")).sendKeys("vish@gmail.com");
		
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		
		
		
	}

}
