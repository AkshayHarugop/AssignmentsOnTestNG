package test;

import org.testng.annotations.Test;

public class day5 {

	@Test(groups= {"Smoke"})
	public void WebloginCarLoan() {
		System.out.println("weblogincar");
	}

	@Test
	public void MobileloginCarLoan() {
		System.out.println("mobilelogincar");
	}

	@Test
	public void MobileSigninCarLoan() {
		System.out.println("mobilesignin");
	}

	@Test
	public void MobileSignoutCarLoan() {
		System.out.println("mobileSignout");
	}

	@Test
	public void APIloginCarLoan() {
		System.out.println("apilogincar");
	}
	

}
