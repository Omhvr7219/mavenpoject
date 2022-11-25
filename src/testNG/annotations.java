package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	@BeforeClass
	public void OPEN_BROWSER() {
		Reporter.log("opening browser", true); // show o/p in consol only
	}

	@BeforeMethod
	public void LOGIN_TO_APP() {
		Reporter.log("LOGINg TO APP", true);// show o/p in consol and emailale report
	}

	@Test
	public void VERIFY_ID1() {
		Reporter.log("verifying 1", true); // show o/p in emailale report
	}

	@Test
	public void VERIFY_ID2() {
		Reporter.log("verifying 2", true);// show o/p in consol and emailale report
	}

	@AfterMethod
	public void LOGOUT() {
		Reporter.log("logut done",true); // show o/p in emailale report
	}

	@AfterClass
	public void CLOSEBRSR() {
		Reporter.log("browesr closed",true); // show o/p in emailale report
	}
}
