package Test;



import org.testng.Assert;

import org.testng.annotations.Test;

public class Carloan2 {
	@Test
	public void interestrate()
	{
	System.out.println("Car Interest rate");
	Assert.assertEquals(true, false);
	}
	@Test
	public void personalloaninquiry()
	{
		System.out.println(" Car Go to help desk");
	}
	@Test
	public void inquirt1()
	{
		System.out.println(" Car Go to help 1");
	}
	@Test
	public void inquirt2()
	{
		System.out.println(" Car Go to help 2");
		Assert.fail();
	}
	@Test(dataProvider="getdata")
	public void inquirt3(String username,String password)
	{
		System.out.println(" Car Go to help 3");
		System.out.println(username);
		System.out.println(password);
	}
	
		
		
	}


