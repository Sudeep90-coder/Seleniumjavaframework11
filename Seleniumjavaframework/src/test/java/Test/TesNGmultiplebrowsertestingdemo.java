package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TesNGmultiplebrowsertestingdemo {

	WebDriver driver = null;
	
	@Parameters("browsername")
	@BeforeTest
	public void setup(String browsername) {
		
	System.out.println("Browser name is :"+ browsername);	
	
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudee\\Documents\\Java workspace\\SeleniumTest\\Drivers\\chromedriver.exe");	
		 driver = new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver","C:/Users/sudee/Documents/Java workspace/Seleniumjavaframework/Drivers/geckodriver/geckodriver.exe");
		 driver = new FirefoxDriver();
		
	}
		
	}
	@Test
	public void maintest() throws InterruptedException{
		Thread.sleep(3000);
		driver.get("https://www.google.ca/");
	}
	
@AfterTest
 public void teardown(){
	 
	 driver.close();
 }
	
}



