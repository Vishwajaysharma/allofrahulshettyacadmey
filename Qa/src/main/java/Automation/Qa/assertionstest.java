package Automation.Qa;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class assertionstest {

	    WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        // Set up ChromeDriver
	        driver = new ChromeDriver();
	    }

	    @Test
	    public void testSeniorCitizenDiscount() throws InterruptedException {
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	        Thread.sleep(2000);

	        // Check the checkbox and validate it is not selected
	        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected(),
	                "Checkbox should not be selected by default");
	    }

	    @Test
	    public void testPassengerCount() throws InterruptedException {
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	        driver.findElement(By.id("divpaxinfo")).click();
	        Thread.sleep(2000);

	        // Click on "Add Adult" button 4 times
	        for (int i = 1; i < 5; i++) {
	            driver.findElement(By.id("hrefIncAdt")).click();
	        }

	        // Verify passenger count
	        String expectedPassengerCount = "5 Adult";
	        String actualPassengerCount = driver.findElement(By.id("divpaxinfo")).getText();
	        Assert.assertEquals(actualPassengerCount, expectedPassengerCount, "Passenger count mismatch");
	    }

	    @AfterClass
	    public void teardown() {
	        // Close the driver
	        driver.quit();
	    }
	}


