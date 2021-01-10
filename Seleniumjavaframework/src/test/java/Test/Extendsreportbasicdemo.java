package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Extendsreportbasicdemo {

	static WebDriver driver = null;
	
	public static <ExtentHtmlReporter> void main(String[] args) {
		
		
		// start reporters
        
		  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("intent.html");
		
		// create ExtentReports and attach reporter(s)
	        ExtentReports extent = new ExtentReports(null);
	        extent.attachReporter(htmlReporter);

	        // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test1 = extent.createTest("Google search test", "Sample description");
		
	        System.setProperty("webdriver.gecko.driver","C:/Users/sudee/Documents/Java workspace/Seleniumjavaframework/Drivers/geckodriver/geckodriver.exe");
	    	WebDriver driver = new FirefoxDriver();

	    	driver.get("https://www.google.ca/");
	test1.log(Status.in, details);
	
	test1.pas
	
	// calling flush to write everything on the log files.
	extent.flush();
		

	}

}
