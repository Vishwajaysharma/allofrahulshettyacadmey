package seleniumdemo.seleniumdemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allcheckkbox_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
       // ul[attribite= 'value']
        List <WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checks : check) {
			
			if (checks.isDisplayed()) {
				checks.click();
			}
			
			
		}
		
	}

}
