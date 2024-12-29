package automation1Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class demostringpractice {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "vishwajaysharma" ;
          WebDriver driver= new ChromeDriver();
         String password = getpass(driver);
          driver.get("https://rahulshettyacademy.com/locatorspractice/");
          driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		   driver.findElement(By.className("submit")).click();
		   Thread.sleep(1000);
           System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText());
           Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText(),"You are successfully logged in.");
           Thread.sleep(1000);
           //  Assert.assertEquals(driver.findElement(By.xpath("(//h2[normalize-space()='Hello jfjhv,'])[1]")).getText(), name);
           driver.findElement(By.cssSelector(".logout-btn")).click();
	       driver.quit();
	}

public static String getpass (WebDriver driver) throws InterruptedException {
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	 Thread.sleep(1000);
	driver.findElement(By.xpath("(//button[normalize-space()='Reset Login'])[1]")).click(); 
	 
	String passtext = driver.findElement(By.cssSelector(".infoMsg")).getText();
	//Please use temporary password 'rahulshettyacademy' to Login.
	String [] passwordarray = passtext.split("'");
	String [] passwordarray2 = passwordarray[1].split("'");
	String password = passwordarray2[0];
	System.out.println(password);
    return password;
}
	
	
}
