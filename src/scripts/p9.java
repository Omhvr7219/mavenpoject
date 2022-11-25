package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p9 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe" );
			WebDriver  driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.get("https://web.whatsapp.com/");
			driver.getTitle();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());

			driver.navigate().back();

			driver.navigate().forward();

			driver.navigate().refresh();

			driver.manage().window().maximize();
}
}
