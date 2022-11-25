package base_class_and_utility_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstox_pom_homepage {
	@FindBy(xpath = "//span[text()='harshad r.']")private WebElement UID;
	
	@FindBy(xpath = "//div[text()='TCS']")private WebElement stocknm;
	

	upstox_pom_homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String stocknm()
	{
		stocknm.click();
		return 	stocknm.getText();
	
	}

//	public void upstox_pom_homepage_get_uid(String extid) {
//		
//		String ACTUAL = UID.getText();
//		System.out.println(ACTUAL);
//		boolean result = ACTUAL.equals(extid);
//		System.out.println("Result:" + result);       //for ddf  pom with ddf 
//
//		if (result == true) {
//			System.out.println("TC PASS :Valid Usr");
//		} else {
//			System.out.println("TC Fail :inValid Usr");
//		}
	public String upstox_pom_homepage_get_uid() {
		
	    
	    	String userID = UID.getText();
	    	return userID;
	    }
	}
