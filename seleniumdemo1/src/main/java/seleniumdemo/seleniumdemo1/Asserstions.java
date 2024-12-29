package seleniumdemo.seleniumdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Asserstions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        
      //  driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
 Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
       driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        
        
        for (int i=1; i<5;i++) {
                    driver.findElement(By.id("hrefIncAdt")).click();
                    }
        
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
       
       
       driver.close();
       
       //hrefIncAdt
	}

	
	
}
