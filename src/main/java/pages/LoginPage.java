package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;
import util.Constants;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver, ExtentTest eTest) {
		super(driver, eTest);
	}

	@FindBy(id = "txtUsername")
	public WebElement emailid;
	@FindBy(id = "txtPassword")
	public WebElement password;
	@FindBy(id = "btnLogin")
	public WebElement login;

	public void doLogin(String username, String Passwrd) {

		input(emailid, username);
		eTest.log(LogStatus.INFO, "Entered Username: " + username);
		input(password, Passwrd);
		eTest.log(LogStatus.INFO, "Entered Password: " + Passwrd);
		login.click();
		eTest.log(LogStatus.INFO, "Clicked on Sign In link");

	}
}
