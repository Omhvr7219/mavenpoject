package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled_invocation {
	@Test(invocationCount = 4) 
	public void TC0() {
		Reporter.log("running TC0",true); // show o/p in consol only
	}

	@Test
	public void TC1() {
		Reporter.log("running of TC1", true);// show o/p in consol and emailale report
	}

	@Test(enabled=false)
	public void TC2(){
		Reporter.log("running of TC2", true); // show o/p in emailale report
	}

	@Test(enabled=false)
	public void TC3() {
		Reporter.log("running of TC3", true);// show o/p in consol and emailale report
	}

	@Test
	public void TC4() {
		Reporter.log("running of TC4",true); // show o/p in emailale report
}
}