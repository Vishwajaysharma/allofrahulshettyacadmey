package seleniumdemo.seleniumdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dyndrop {

    public static void main(String[] args) {
   
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
       
        driver.findElement(By.xpath("//a[@value='MAA']")).click();  // Corrected XPath
        
       
        driver.quit();
    }
}

