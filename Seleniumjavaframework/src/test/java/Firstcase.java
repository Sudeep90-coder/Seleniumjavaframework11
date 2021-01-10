import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Firstcase {

	public static void main(String[] args) throws InterruptedException {
		
		
		//String projectpath =  System.getProperty("user.dir");
		//System.out.println("projectpath");
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/sudee/Documents/Java workspace/SeleniumTest/Drivers/chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver","C:/Users/sudee/Documents/Java workspace/Seleniumjavaframework/Drivers/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/sudee/Documents/Java workspace/Seleniumjavaframework/Drivers/Chromedriver/chromedriver.exe");
		
		
		//WebDriver driver = new InternetExplorerDriver();
	//	System.setProperty("webdriver.ie.driver", "C:/Users/sudee/Documents/Java workspace/Seleniumjavaframework/Drivers/IEdriver/IEDriverServer.exe");
		
		driver.get("https://www.google.ca/");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@title='Search']"));
		textbox.sendKeys("Lifelabs");
	
		List<WebElement> listofinputtypeelements =  driver.findElements(By.xpath("//input"));
		int count = listofinputtypeelements.size();
		
		System.out.println("list of input type elements: "+ count);
		
		Thread.sleep(4000);

		driver.close();
		
	}

}
