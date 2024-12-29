package seleniumdemo.seleniumdemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class End_to_endtesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(2000);
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        
        Thread.sleep(2000);
        
      
        List<WebElement> autosugst = driver.findElements(By.className("ui-menu-item"));
         for(WebElement auto : autosugst ) {
        	
        	if ( auto.getText().equalsIgnoreCase("India")) {
        	         auto.click();
        		System.out.println("true") ;
        		
        		}
        }
  
               	driver.findElement(By.cssSelector("input[value = 'OneWay']")).click();
            
              driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
            	
        		driver.findElement(By.xpath("//a[@value='DEL']")).click();
        		Thread.sleep(1000);
        		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
        		Thread.sleep(1000);
        	     driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
        	     
        	     
           //    	driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1 > option[value='GOI']")).click();
            	//driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
               	
            	driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency> option[value='INR']")).click();
            	
            	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
            	
            	driver.findElement(By.cssSelector("#divpaxinfo")).click();
            	Thread.sleep(2000);
            	for(int i = 1;i<5;i++) {
            	driver.findElement(By.id("hrefIncAdt")).click();
            	}
            	
            	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
            	//ui-state-default ui-state-highlight
            	
            	driver.findElement(By.xpath("//*[@id='ctl00_mainContent_btn_FindFlights']")).click();
            	
            	
            	
            	
           // 	#ctl00_mainContent_DropDownListCurrency> option[value='INR']
               	//value="DEL"
               	//ctl00_mainContent_ddl_originStation1
       driver.close();
        	driver.quit();
        	
        	
        	
        }
        
        }


