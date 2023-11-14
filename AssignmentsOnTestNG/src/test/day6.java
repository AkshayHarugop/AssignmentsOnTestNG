package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day6 {

	@Parameters({ "Name", "UserName" })
	@Test
	public void parameterization(String Name, String UserName) {
		System.out.println(Name);
		System.out.println(UserName);
	}

}
