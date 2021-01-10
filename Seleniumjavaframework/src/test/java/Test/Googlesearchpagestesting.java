package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.Googlesearchpagesobjects;

public class Googlesearchpagestesting {

	public static void main(String[] args) throws InterruptedException {
		
		googlesearchtest();
		
	}
	
	public static void googlesearchtest() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:/Users/sudee/Documents/Java workspace/Seleniumjavaframework/Drivers/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		
		Googlesearchpagesobjects searchpageobj = new Googlesearchpagesobjects(driver);
		
		driver.get("https://www.google.ca/");
		
		searchpageobj.textboxsearch("Lifelabs");
		Thread.sleep(2000);
		searchpageobj.clicksearchbutton();
		Thread.sleep(2000);
		driver.close();
		
	}

}
