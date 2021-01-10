package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesschromebrowserdemo {

	
	public static void main(String[] args) throws InterruptedException {
		test();
	}
	
	
	public static void test() throws InterruptedException, IOException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sudee\\Documents\\Java workspace\\Seleniumjavaframework\\Drivers\\Chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1920,1080");
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.get("https://www.google.ca/");
		String title = driver.getTitle();
		System.out.println("title");
		driver.findElement(By.name("q")).sendKeys("Automation");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println("Completed");
		
		
		//Runtime.getRuntime().exec("Location of exe");
		driver.close();
		
	}

}
