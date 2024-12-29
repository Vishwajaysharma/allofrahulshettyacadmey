package automation1Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;

public class Testdemoselenium2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();
		//driver.findElement(by.)
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		List<WebElement> chekbox = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println(chekbox.size());
    
		// TODO Auto-generated method stub

	}

}
