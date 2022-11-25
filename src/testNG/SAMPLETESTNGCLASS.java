package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SAMPLETESTNGCLASS {
	@Test
	public void TC0() {
		System.out.println("running TC0"); // show o/p in consol only
	}

	@Test
	public void TC1() {
		Reporter.log("running of TC1", true);// show o/p in consol and emailale report
	}

	@Test
	public void TC2() {
		Reporter.log("running of TC2", false); // show o/p in emailale report
	}

	@Test
	public void TC3() {
		Reporter.log("running of TC3", true);// show o/p in consol and emailale report
	}

	@Test
	public void TC4() {
		Reporter.log("running of TC4"); // show o/p in emailale report
	}
}
