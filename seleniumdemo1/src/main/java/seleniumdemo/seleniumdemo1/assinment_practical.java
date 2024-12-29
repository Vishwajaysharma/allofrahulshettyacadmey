package seleniumdemo.seleniumdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assinment_practical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        Thread.sleep(2000);
        
        driver.findElement(By.name("name")).sendKeys("vishwajaysharma");
        driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("vishwajaysharma@gmail.com");
        
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Ilove923772466");
        driver.findElement(By.id("exampleCheck1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("exampleFormControlSelect1")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[text()='Male']")).click();
        driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("02032003");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type ='submit'and @value = 'Submit' ]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Success!']")).getText(), "Success!");
     //   driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/input")).click();
        
       // form-control
      //input[@id="inlineRadio1"]
      //option[text()='Male']
      //*[@id="exampleFormControlSelect1"]/option[1]
      //input[@class='form-control ng-untouched ng-pristine ng-invalid']
        		//exampleCheck1
	}

}
