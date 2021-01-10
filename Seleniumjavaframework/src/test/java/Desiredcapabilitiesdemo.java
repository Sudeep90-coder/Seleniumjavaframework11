import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desiredcapabilitiesdemo {

	public static void main(String[] args) throws InterruptedException {
		
		googlesearch();
	}

	
	
	public static void googlesearch() throws InterruptedException {

		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("loggingPrefs", true);
	
		System.setProperty("webdriver.gecko.driver","C:/Users/sudee/Documents/Java workspace/Seleniumjavaframework/Drivers/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.ca/");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@title='Search']"));
		textbox.sendKeys("Lifelabs");
		Thread.sleep(4000);
		// click on search button
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']")).sendKeys(Keys.RETURN);
		
		Thread.sleep(4000);
		driver.close();
		
		System.out.println("Test completed successfuly");
		
		}
}
