package test;

import org.testng.annotations.Test;

public class day3 {

	@Test(groups= {"Smoke"})
	public void WebloginCarLoan() {
		System.out.println("weblogincar");
	}

	@Test(enabled=false)
	public void MobileloginCarLoan() {
		System.out.println("mobilelogincar");
	}

	@Test
	public void APIloginCarLoan() {
		System.out.println("apilogincar");
	}

}
