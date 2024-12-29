package automation1Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_webElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		          driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		          driver.findElement(By.id("autosuggest")).sendKeys("af");
		          
		        Thread.sleep(2000);
		        
		        List <WebElement>  options = driver.findElements(By.className("ui-menu-item"));
		//ui-menu-item
		        for(WebElement option : options ) {
		        	
		        	if(option.getText().equalsIgnoreCase("South Africa"))
		        	{
		        		System.out.println( "true");
		        		option.click();
		        		driver.quit();
		        	}
		        	
		        	
		        }
		
	}

}
