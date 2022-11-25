package test_ng_compatibilitytesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class egcompatibilty {
	WebDriver driver;

	@Parameters("browesername")
	@Test

	public void TC1(String browesername) {
		
		if (browesername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browesername.equals("firefox"))
		 {
			System.setProperty("webdriver.gecko.driver", "C:\\Dell\\selenium 4.4\\geckodriver.exe");
		driver = new FirefoxDriver();
	       }
		else if(browesername.equals("opera"	))
		{
			
		}
		driver.get("https://www.google.com/");
}}