package automation1Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_test_Senium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.findElement(By.cssSelector("select")).click();
		//value="IND"
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='IND']")).click();
	
		
		
	}

}
