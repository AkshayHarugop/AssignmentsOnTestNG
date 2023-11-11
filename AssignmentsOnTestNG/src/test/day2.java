package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void ploan()
	{
		System.out.println("good");
	}
	
	@AfterMethod
	public void afterevery() {
		System.out.println("I will execute after every test method");
	}
	
	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every test method");
	}
	
}
