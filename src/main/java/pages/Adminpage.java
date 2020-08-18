package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;

public class Adminpage extends BasePage{
	
	public Adminpage(WebDriver driver, ExtentTest eTest) {
		super(driver, eTest);
	}
	
	@FindBy(className="firstLevelMenu")
	public WebElement Admin;
	@FindBy(id="searchBtn")
	public WebElement Search;

	public void clickAdmin() {
		Admin.click();
	}
	public boolean ValidateAdminPage()
	{
		boolean status=verifyObjectDisplayed(Search);
		
		if(status)
		{
			eTest.log(LogStatus.INFO,"Search option is displayed on AdminPage ");
		}
	
		else {
			eTest.log(LogStatus.INFO, "Search Option is not displayed on Home Page");
		}
	
		return status;
}
	
}
