package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class scscscs {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver", "C:\\Dell\\selenium 4.4\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://mahadbtmahait.gov.in/Grievance/Grievance");
	Thread.sleep(5000);
	for(int i=1;i<=10;i++) {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String add = RandomString.make(2);
	File dest = new File ("C:\\Users\\admin\\Desktop\\sc\\hvrr"+add+".jpg");
	FileHandler.copy(src, dest);}
} 
}
