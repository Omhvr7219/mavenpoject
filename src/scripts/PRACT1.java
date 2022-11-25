package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRACT1 {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/");
	String ok=driver.getTitle();
	System.out.println(ok);
	String om=driver.getCurrentUrl();
	String op="W3Schools Online Web Tutorials";

	System.out.println(om);
	if(op.equals(ok)) 
	{System.out.println("true");}
	else
	{System.out.println("false");}
		
	Thread.sleep(7000);
	driver.close();
}

}
