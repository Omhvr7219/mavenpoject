package test_ng_compatibilitytesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class egcomp2 {
	WebDriver driver;
	@Parameters("browsername")
	@Test
	public void TC01(String browsername) {
  if(browsername.equals("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		driver = new ChromeDriver();
  }
  else if(browsername.equals("firefox"))
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Dell\\selenium 4.4\\geckodriver.exe");
	  driver=new FirefoxDriver();
  }
  else if(browsername.equals("opera"))
  {
	  
  }
  driver.get("https://datatables.net");
	}

}
