package Test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;



public class TestNGdependencydemo {

	
	@Test(dependsOnGroups = {"sanity.*"})
	public void test1() {
		
		System.out.println("I am inside test1");
	}
	
	@Test(groups = {"sanity1"})
   public void test2() {
		
		System.out.println("I am inside test2");
	}
	
	
   @Test(groups = {"sanity2"})
   public void test3() {
		
		System.out.println("I am inside test3");
	}
   
   
}



