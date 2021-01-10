package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.Propertiesfile;

public class Testgooglesearch_TestNGdemo {


	WebDriver driver = null;
	public static  String  browsername = null;
	
@BeforeTest
public  void testsetup() {
	 Propertiesfile.getproperties();
	
		if (browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudee\\Documents\\Java workspace\\SeleniumTest\\Drivers\\chromedriver.exe");	
			WebDriver driver = new ChromeDriver();	
			
		}
		else if (browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:/Users/sudee/Documents/Java workspace/Seleniumjavaframework/Drivers/geckodriver/geckodriver.exe");
			 driver = new FirefoxDriver();	
		}
	

		driver.get("https://www.google.ca/");	
	}
	
	@Test
	public  void googlesearch() throws InterruptedException {
		
		driver.findElement(By.name("q")).sendKeys("Lifelabs");
	//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Lifelabs");
	Thread.sleep(4000);
	// click on search button
	driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']")).sendKeys(Keys.RETURN);
	
	Thread.sleep(4000);
	
	
	}
	@AfterTest
	public  void closingtest(){
		driver.close();
		
		System.out.println("Test completed successfuly");
		
	}
	
	
}
