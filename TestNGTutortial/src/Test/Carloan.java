package Test;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Carloan {
	@Test(groups={"smoke"})
	public void interestrate()
	{
	System.out.println("Car Interest rate");
	}
	@Test(enabled=false)
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
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] obj = new Object[3][2];
		obj[0][0]="uname1";
		obj[0][1]="Password1";
		obj[1][0]="uname2";
		obj[1][1]="Password2";
		obj[2][0]="uname3";
		obj[2][1]="Password3";
		return obj;
		
		
	}

}
