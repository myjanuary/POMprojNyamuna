package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;

public class BasePage {
	
		
		public WebElement element;
		public WebDriver driver=null;
		public ExtentTest eTest=null;
		
		public BasePage(WebDriver driver, ExtentTest eTest){
			this.driver = driver;
			this.eTest = eTest;
		}
		
		public void click(WebElement ObjProp) {
			
				ObjProp.click();
			}
		
		public void input(WebElement ObjProp, String text) {
			
			ObjProp.sendKeys(text);;
		}
		
		public boolean verifyObjectDisplayed(WebElement ObjProp) {
			if(ObjProp.isDisplayed()) {
				return true;
			}else {
				return false;
		}

}
	}

