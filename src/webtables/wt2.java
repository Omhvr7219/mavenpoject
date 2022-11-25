package webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wt2 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.espn.in/cricket/standings/series/8048/ipl");
	 List<WebElement> tr = driver.findElements(By.xpath("//table[@class='standings has-team-logos']//tr"));
	int rs = tr.size();
	System.out.println(rs);
	List<WebElement> td = driver.findElements(By.xpath("//table[@class='standings has-team-logos']//tr[2]//td"));
	int cs = tr.size();
	System.out.println(cs);
	 List<WebElement> hr = driver.findElements(By.xpath("//table[@class='standings has-team-logos']//tr[1]//th"));
	int hrs = hr.size();
	System.out.println(hrs);
//	for(int j=1;j<=10;j++)
//	{
//		String tdr2 = driver.findElement(By.xpath("//table[@class='standings has-team-logos']//tr[3]//td["+j+"]")).getText();
//		System.out.print(tdr2+"  ");
//	}
//	
	for(int i=1;i<=10;i++)
	{
		String tdr1 = driver.findElement(By.xpath("//table[@class='standings has-team-logos']//tr[1]//th["+i+"]")).getText();
		System.out.print(tdr1+"  ");
	}
	
	
	
}
}