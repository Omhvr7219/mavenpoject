package practiceproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upcl1 {
	@FindBy(xpath = "//input[@id='userCode']")
	private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement PWD;
	@FindBy(xpath = "//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']")
	private WebElement clck;

	public upcl1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void upcl1enterUN(String unn) {
		UN.sendKeys(unn);
	}

	public void upcl1enterPW(String pww) {
		PWD.sendKeys(pww);
	}

	public void upcl1clicks() {
		clck.click();
	}

}
