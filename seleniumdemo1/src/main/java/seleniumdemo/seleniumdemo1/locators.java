package seleniumdemo.seleniumdemo1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
             WebDriver gh = new ChromeDriver();
            gh.get("https://rahulshettyacademy.com/locatorspractice/");
            System.out.println( gh.getCurrentUrl());
            gh.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
            gh.findElement(By.id("inputUsername")).sendKeys("vishwajayshama");
            gh.findElement(By.name("inputPassword")).sendKeys("ghjhgghhgghj");
            gh.findElement(By.className("submit")).click();
            
            System.out.println( gh.findElement(By.cssSelector("p.error")).getText());
            gh.findElement(By.linkText("Forgot your password?")).click();
		    gh.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("vishwajay");
		    gh.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("viswa@gmail.com");
	        gh.findElement(By.xpath("(//input[@placeholder='Phone Number'])")).sendKeys("9887656503");
	        
		    gh.findElement(By.xpath("(//button[normalize-space()='Reset Login'])[1]")).click(); 
		    gh.findElement(By.cssSelector(".go-to-login-btn")).click();
		   Thread.sleep(3000);  
		   gh.findElement(By.id("inputUsername")).sendKeys("vishwa");
		   gh.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		   gh.findElement(By.cssSelector("#chkboxOne")).click();
		   gh.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		   gh.findElement(By.xpath("(//button[normalize-space()='Sign In'])[1]")).click();
		   
			}

}
