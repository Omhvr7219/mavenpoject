package prcticeproject2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomscshot {
	@FindBy(xpath = "(//img)[1]")
	private WebElement image;

	public pomscshot(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void takesc(WebDriver driver) throws IOException

	{driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if (image.isDisplayed()) {
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\Users\\admin\\Desktop\\sc\\hr02.jpg");
			FileHandler.copy(file, f);
		}
	}

}
