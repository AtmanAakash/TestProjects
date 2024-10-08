package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver) {
		
		super(driver);
           
		 
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement accmsgheading;
	
	
	
	public boolean isMyaccountExist() {
		
		try {
		  
			return(accmsgheading.isDisplayed());
			
		}catch (Exception e) {
			
			return false;
		}
		
		
		
	}

}
