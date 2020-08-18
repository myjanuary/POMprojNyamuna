package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;

public class Homepage  extends BasePage{
	
	public Homepage(WebDriver driver, ExtentTest eTest) {
		super(driver, eTest);
	}

	@FindBy(id="MP_link")
	public WebElement marketplace;
	@FindBy(linkText="logout")
	public WebElement logout;
	
	
	public boolean ValidateHomePage() {
		
		boolean value = verifyObjectDisplayed(marketplace);
		if(value){		
			eTest.log(LogStatus.INFO, "mp Option is displayed on Home Page");
		}
		else {
			eTest.log(LogStatus.INFO, "mp Option is not displayed on Home Page");
		}
			
      return value;
      
	}  

	
}
