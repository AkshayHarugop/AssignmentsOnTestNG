package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

	// TODO Auto-generated method stub
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I will execute before Suite");
	}

	@AfterSuite
	public void afSuite() {
		System.out.println("I will execute after Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I will execute before Test");

	}

	@AfterTest
	public void afTest() {
		System.out.println("I will execute after test");

	}

	@AfterMethod
	public void afterevery() {
		System.out.println("I will execute after every test method");
	}
	
	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every test method");
	}

	@Test
	public void Demo() {
		System.out.println("hello");// automation
		Assert.assertTrue(true);
	}

	@Test
	public void SecondTest() {
		System.out.println("bye");
	}

}
