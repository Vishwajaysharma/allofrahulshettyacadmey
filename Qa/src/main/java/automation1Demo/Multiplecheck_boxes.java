package automation1Demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplecheck_boxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		
		
		
		
		System.out.println(driver.findElements(By.cssSelector("input[type= 'checkbox']")).size());
	         List <WebElement> multis = driver.findElements(By.cssSelector("input[type= 'checkbox']"));
	         for(WebElement multi : multis) {
	        	 
	        	 
	        	 if (multi.isDisplayed())
	        	 
	        	 {
	        		 multi.click();
	        	 }
	        	
	        	 
	         }
	        		 
		//checkbox
		
	//	ctl00$mainContent$chk_friendsandfamily
		
		
		// TODO Auto-generated method stub
		
		
		
		
		

	}

}
