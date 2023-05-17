package testngprt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class a22 {
	@Parameters("bname")
@Test
public void hvr(String bname) {
		WebDriver driver = null;
		if(bname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.youtube.com/");
			
		}
		else if(bname.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Dell\\selenium 4.4\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.get("https://www.google.com/");
		}
	
}
}