package prcticeproject2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class testppom {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	//go to upstox URL
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	p1pom o1 = new p1pom(driver);
	
//	o1.mstr();

	o1.mUN();

	o1.mPW();
	Thread.sleep(3000);
	o1.mRB2();
	Thread.sleep(3000);
	o1.mPOP();
	Thread.sleep(3000);
	o1.mSB();
	Thread.sleep(3000);
	o1.mAGR();
	Thread.sleep(3000);
	o1.mSGNBTN();
	Thread.sleep(5000);
//	 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File f=new File("C:\\Users\\admin\\Desktop\\sc\\hr.jpg");
//		FileHandler.copy(file, f);
	pomscshot obj8 = new pomscshot(driver);
	obj8.takesc(driver);
	
}
}