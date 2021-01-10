package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;



public class ExtentsreportdemomowithTestNG {

	@BeforeTest
	public void testsetup() {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);	


	}
	@Test
	public void test12() {

	}
	@AfterTest
	public void teardown() {


	}


}


