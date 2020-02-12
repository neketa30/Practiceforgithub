package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonalLoan {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
	}
	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("Before method");
	}
	@AfterTest
	public void firsttime()
	{
		System.out.println("After Test");
	}
	@BeforeSuite
	public void beforesuites()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	public void aftersuites()
	{
		System.out.println("After suite");
	}
	@Test
	public void interestrate()
	{
	System.out.println("Interest rate for personal loan");
	}
	@Test
	public void interestrate1()
	{
	System.out.println("Interest rate for personal loan");
	}
	@Test
	public void interestrate2()
	{
	System.out.println("Interest rate for personal loan");
	}
	@BeforeTest
	public void personalloaninquiry()
	{
		System.out.println("Before test");
	}

}
