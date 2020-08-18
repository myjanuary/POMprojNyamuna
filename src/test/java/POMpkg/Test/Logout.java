package POMpkg.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POMpkg.Base.BaseTest;
import base.BasePage;
import pages.Homepage;
import pages.Launchpage;
import pages.LoginPage;
import pages.LogoutPage;
import util.Constants;

public class Logout extends BaseTest{
	
	@Test
	public void doLogout() throws InterruptedException {
		
		eTest = eReport.startTest("Logout Test");

		OpenBrowser(Constants.BROWSER_TYPE);
		BasePage BasePg = new BasePage(driver, eTest);
		PageFactory.initElements(driver, BasePg);

		Launchpage Launchpg = new Launchpage(driver, eTest);
		PageFactory.initElements(driver, Launchpg);
		Launchpg.goToLoginPage();

		LoginPage LoginPg = new LoginPage(driver, eTest);
		PageFactory.initElements(driver, LoginPg);
		LoginPg.doLogin(Constants.USERNAME, Constants.PASSWORD);

		Homepage HomePg = new Homepage(driver, eTest);
		PageFactory.initElements(driver, HomePg);
		boolean objectDisplayed = HomePg.ValidateHomePage();

		if (objectDisplayed) {
			reportPass("MP Option on HomePage is displayed");
		} else {
			reportFail("MP Option on HomePage is not displayed");
		}
		
		
		LogoutPage lp = new LogoutPage(driver, eTest);
		PageFactory.initElements(driver, lp);
		lp.doLogout();
		boolean value = lp.ValidateLogout();

		if (value) {
			reportPass("Login Page is displayed after logout");
		} else {
			reportFail("Login Page is not displayed after logout");
		}
		
	}
	

}
