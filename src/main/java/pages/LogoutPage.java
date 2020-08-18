package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BasePage;

public class LogoutPage extends BasePage {

	public LogoutPage(WebDriver driver, ExtentTest eTest) {
		super(driver, eTest);
	}

	
	// @FindBy(css = "#welcome-menu>ul>li:nth-child(2)>a")

	//@FindBy(linkText = "Logout")
	@FindBy(xpath = "//*[@id='welcome-menu']/ul/li[2]/a")
	public WebElement logout;

	@FindBy(id = "txtUsername")
	public WebElement Username;

	public void doLogout() throws InterruptedException {
		
		boolean welvalue = driver.findElement(By.xpath("//*[@id='welcome']")).isDisplayed();
		
		if (welvalue) {
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
		}

		Thread.sleep(5000);
		
		boolean value = verifyObjectDisplayed(logout);
		if (value) {
			logout.click();
		}
	}

	public boolean ValidateLogout() {

		boolean value = verifyObjectDisplayed(Username);
		return value;

	}

}
