package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {
	@Test(groups={"smoke"})
	public void Homeinterestrate()
	{
	System.out.println("Home Interest rate");
	}
	@Parameters({"URL","Uname"})
	@Test
	public void personalloaninquiry(String urlname,String key)
	{
		System.out.println("Home Go to help desk");
		System.out.println(urlname);
		System.out.println(key);
	}

}
