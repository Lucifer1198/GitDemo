package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String uname)
	{
		//selenium
		System.out.println("WebLoginHomePersonalLoan");
		System.out.println(uname);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileLoginHome");
		System.out.println("Hello again human");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("APILoginHome");
	}
	

}
