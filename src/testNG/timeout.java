package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
	@Test(timeOut = 2000)
	public void TC0() throws InterruptedException {
		Thread.sleep(3500);
		Reporter.log("running TC0", true); // show o/p in consol only
	}
}
