package automation1Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_checkboxes_by_choice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']")).click();
		 List <WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
Thread.sleep(2000);
			for (WebElement checks : check) {
				
			String only = checks.getAttribute("id");
				
			if (only.equals("hobbies-checkbox-3")  ||  only.equals("hobbies-checkbox-3")) {
			
				
				checks.click();
				
			}
				}
		
		
		
		
			}
		
	

}
