package test_ng_compatibilitytesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class eg3_multibroweser {
	WebDriver driver;

	@Parameters("browsername")
	@Test
	public void TC0001(String browsername) {
		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Dell\\selenium 4.4\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Dell\\selenium 4.4\\geckodriver.exe");
			driver = new EdgeDriver();
		}
		driver.get("https://www.google.com");
	}
}
