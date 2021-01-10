package Test;

import org.testng.annotations.Test;

public class TestNGfailtestcasesdemo {

	
	@Test
	public void test1() {
		
		System.out.println("I am inside test1");
	}
	
	
@Test	
public void test2() {
		
		System.out.println("I am inside test2");
		//int i = 1/0;
	}

@Test
public void test3() {
	
	System.out.println("I am inside test3");
	int k = 2/0;
}
	
}


