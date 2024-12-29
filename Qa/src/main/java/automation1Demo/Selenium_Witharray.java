package automation1Demo;


import java.time.Duration;

import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Witharray {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		String[] itemlist = { "Brocolli", "Cauliflower", "Cucumber", "Tomato" };
		
		addItemincart( driver,itemlist);
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	
	driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector(".promoBtn")).click();
	
	
	
   String b = driver.findElement(By.className("promoInfo")).getText();
   
   if (b.equalsIgnoreCase("Code applied ..!")) {
	   System.out.println("promocode is applide");
   }
   
  
	}
	
	
	
	
	public static void addItemincart(WebDriver driver,String[] itemlist)
	{
	int j = 0;
	List<WebElement> name = driver.findElements(By.xpath("//h4[@class='product-name']"));

	for (int i = 0; i < name.size(); i++) {
		
		String[] itemName = name.get(i).getText().split("-");
		String formattedName = itemName[0].trim();
		//Thread.sleep(2000);

		List<String> itemNeeded = Arrays.asList(itemlist);

		if (itemNeeded.contains(formattedName))

		{
			j++;
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			if (j == itemlist.length)

			{
				// driver.close();
				break;

			}

		}

	}
	}


}
