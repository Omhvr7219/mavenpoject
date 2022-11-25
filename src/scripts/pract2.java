package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract2 {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=ByIZIKFmHOA&list=RDbVNJVB10C6w&index=2&ab_channel=SonyMusicIndia");
	Thread.sleep(3000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
//	driver.manage().window().maximize();
//	Thread.sleep(3000);
//	driver.manage().window().minimize();
//	Thread.sleep(3000);
//	
	

}
}