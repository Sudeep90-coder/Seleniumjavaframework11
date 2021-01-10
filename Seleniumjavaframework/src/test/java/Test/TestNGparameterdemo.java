package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGparameterdemo {

   @Test
   @Parameters("Myname")
	 public void test(String name) {
		 
		  System.out.println("Name is: " +name);
		 
	 }
	
	
	
}
