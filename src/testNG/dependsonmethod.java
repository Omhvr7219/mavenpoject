package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependsonmethod {
	

	@Test(dependsOnMethods = {"LOGIN_TO_APP"})
	public void LOGOUT() {
		Reporter.log("logut done", true); // show o/p in emailale report
	}
	@Test
	public void LOGIN_TO_APP() {
		Reporter.log("LOGINg TO APP", true);// show o/p in consol and emailale report
	}

}
