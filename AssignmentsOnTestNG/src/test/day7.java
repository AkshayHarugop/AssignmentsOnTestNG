package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day7 {

	@Test(dataProvider = "getData")
	public void MobileSignoutCarLoan(String username, String password) {
		System.out.println("mobileSignout");
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getData() {
//		Multi dimensional object is very import to make it work
		// 1st combination - username and password -good credit history
		// 2nd combination - username and password -no crdit history
		// 3rd combination - username and password -fraudent credit history
		Object[][] data = new Object[3][2];
		data[0][0] = "firstSeleniumusername";
		data[0][1] = "firstPassword";
		data[1][0] = "SecondSeleniumusername";
		data[1][1] = "SecondPassword";
		data[2][0] = "ThirdSeleniumusername";
		data[2][1] = "ThirdPassword";
		return data;
	}

}
