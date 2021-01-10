package Test;

import org.testng.annotations.Test;


@Test(groups = {"Allclasstest"})

public class TestNGgroupdemo {

@Test(groups = {"Sanity"})	
	public void test1() {
		
		System.out.println("This is test1");
	}



@Test(groups = {"Sanity", "Smoke"})	
public void test2() {
		
		System.out.println("This is test2");
	}


@Test(groups = {"Sanity", "Regression"})
public void test3() {
	
	System.out.println("This is test3");
}

public void test4() {
	
	System.out.println("This is test4");
}
	
}
