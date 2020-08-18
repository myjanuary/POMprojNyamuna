package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import util.Constants;

public class Launchpage extends BasePage {

	public Launchpage(WebDriver driver, ExtentTest eTest) {
		super(driver, eTest);
	}

	public void goToLoginPage() {

		driver.get(Constants.APP_URL);
		driver.manage().window().maximize();
		eTest.log(LogStatus.INFO, "Application URL " + Constants.APP_URL + " got opened");

	}
}
