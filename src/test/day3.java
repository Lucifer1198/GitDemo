package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void b4class()
	{
		System.out.println("Before executing any methods in the class");
	}
	
	@Parameters({"URL", "APIKey/usrname"})
	@Test
	public void WebLoginCarLoan(String urlname, String key)
	{
		//selenium
		System.out.println("WebLoginCar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("BAZINGA");
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("This is my spot - Sheldon Cooper");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After executing every method in the class");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("MobileLoginCar");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am the number 1");
	}
	
	@Test(enabled=false)
	public void MobileSigninCarLoan()
	{
		//Appium
		System.out.println("MobileSigninCar");
	}
	
	@Test(dataProvider="getData")
	public void MobileSignoutCarLoan(String username, String password)
	{
		//Appium
		System.out.println("MobileSignoutCar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"WebLoginCarLoan", "MobileSignoutCarLoan"})
	public void APILoginCarLoan()
	{
		//Rest API automation
		System.out.println("APILoginCar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination
		//2nd combination
		//3rd combination
		Object[][] data = new Object[3][2]; //defining array with 3 rows and 2 columns
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="password";
		//Columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
		
		
		
	}
	

}
