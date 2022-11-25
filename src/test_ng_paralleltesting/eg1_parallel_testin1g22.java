package test_ng_paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class eg1_parallel_testin1g22 {
@Test
public void openupstox()
{
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://login-v2.upstox.com/");
	driver.manage().window().maximize();
	
	}
}
