package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract3 {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=ByIZIKFmHOA&list=RDbVNJVB10C6w&index=2&ab_channel=SonyMusicIndia");
	Thread.sleep(3000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
	driver.close();

}
}