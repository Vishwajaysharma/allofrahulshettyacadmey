package automation1Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_mouse_interaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/ref=nav_bb_logo");
		Actions a = new Actions (driver);
	WebElement 	moveto = driver.findElement(By.id("nav-link-accountList"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("sdfghjkl;").build().perform();
		a.moveToElement(moveto).build().perform();
		
		}

}
