package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://datatables.net/");
 List<WebElement> rsize = driver.findElements(By.xpath("//table[@id='example']//tr"));// row size
// int size =rsize.size();
// System.out.println(size);
List<WebElement> colsize = driver.findElements(By.xpath("//table[@id='example']//tr[2]/td"));
	
//	int csize= colsize.size();
//	System.out.println(csize);// col size
//	
//	List<WebElement> headsize = driver.findElements(By.xpath("//table[@id='example']//tr[1]/th"));
//	int  hdrsize = headsize.size();
//	System.out.println(hdrsize);
//  String hedr = driver.findElement(By.xpath("(//table[@id='example']//tr[1]/td)[1]")).getText();
//	System.out.println(hedr);
	
	for(int i=1;i<=6;i++)
	{
		 String hvr = driver.findElement(By.xpath("(//table[@id='example']//tr[2]/td)["+i+"]")).getText();
		 
		 
		 System.out.print(hvr);
	}
	
	
	
}
}
