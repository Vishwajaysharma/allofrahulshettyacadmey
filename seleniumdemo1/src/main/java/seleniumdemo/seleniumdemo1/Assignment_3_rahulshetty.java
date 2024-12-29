package seleniumdemo.seleniumdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3_rahulshetty {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(200);
        driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
        Thread.sleep(200);
        driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		Thread.sleep(200);
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
		
		
	}

}
