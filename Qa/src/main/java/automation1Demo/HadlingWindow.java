package automation1Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HadlingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.partialLinkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();

		Set<String> winchild =  driver.getWindowHandles();
		Iterator<String>it = winchild.iterator();
		String parentid = it.next();
		String childid = it.next(); 
		
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
	}

}
