package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Googlesearchpagesobjects {

	WebDriver driver;
	
	//By textbox_search = By.className("gLFyf gsfi");
	
	By textbox_search = By.name("q");
	
	By button_search = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']");
	
	
	public Googlesearchpagesobjects(WebDriver driver) {
		
		this.driver = driver;
		
	}
	public void textboxsearch(String text) {
		
     driver.findElement(textbox_search).sendKeys("Lifelabs");
	}
	
	
	public void clicksearchbutton() {
		
	driver.findElement(button_search).sendKeys(Keys.RETURN);
		
		
	}

}
