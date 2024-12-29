package automation1Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_2rahulshetty_acadmy_lopin_page_explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		WebDriverWait wv = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");

		//// label/input[@value='user']/following-sibling::span[@class='checkmark']

		driver.findElement(By.xpath("//label/input[@value='user']/following-sibling::span[@class='checkmark']"))
				.click();
		wv.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		//// option[@value='consult']
		driver.findElement(By.xpath("//option[@value='consult']")).click();
		driver.findElement(By.id("terms")).click();
		//signInBtn
		driver.findElement(By.id("signInBtn")).click();
		
		wv.until(ExpectedConditions.urlMatches("https://rahulshettyacademy.com/angularpractice/shop"));
		System.out.println(driver.getTitle());
	
		Selectallproduct  ( driver);
		//.nav-link.btn.btn-primary
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();

		//button.btn.btn-success
		driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		
		driver.findElement(By.id("country")).sendKeys("harharmahadev");
		//#checkbox2
		
	//	driver.findElement(By.cssSelector("lable::before")).click();
		
		//input.btn.btn-success.btn-lg
		driver.findElement(By.xpath("//label[@for='checkbox2'] ")).click();
		//System.out.println(driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText());
		}
		
		
	
	
	public static void Selectallproduct  (WebDriver driver) {
		List <WebElement> numberofproduct = driver.findElements(By.cssSelector(".btn.btn-info"));
		
		for (int i = 0 ; i<numberofproduct.size();i++) {
			
			numberofproduct.get(i).click();
			
		
		}
		
	}

}
