package testngprt;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation1 {
@Test(timeOut = 3000,priority=-2)
public void opnbroweser() throws InterruptedException {

	Reporter.log("opening browser",true);
}
@Test(priority=0)
public void login1() {
	
	Reporter.log("login to app",true);
}
@Test(priority=1,dependsOnMethods = {"login1"})
public void verify_uids() {
//	Assert.fail("fails");
	Reporter.log("verify id s",true);
}
@Test(priority=2)
public void logout() {
	Reporter.log("logout to app",true);
}
@Test(priority=3)
public void closebrs() {
	Reporter.log("close brsers",true);

}}
