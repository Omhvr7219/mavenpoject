package test_ng_paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class eg2_paralleltesting33 {
@Test
public void openzerodha()
{
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
}
}