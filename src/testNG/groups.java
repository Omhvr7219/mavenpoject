package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groups {
@Test
	public void TC1() 
	{
		Reporter.log("harshad",true);
	}
@Test
	public void TC2() 
	{
		Reporter.log("vasant",true);
	}
@Test
	public void TC3() 
	{
		Reporter.log("randive",true);
	}
}
