package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {

		super(driver);

	}

	@FindBy(xpath = "//a[@title='My Account']")
	WebElement InkAccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement InkRegister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement InkLogin;
	

	public void clickmyAccount() {

		InkAccount.click();

	}

	public void clickmyRegister() {

		InkRegister.click();
	}
	
	
	public void clickmyLogin() {

		InkLogin.click();
	}

}
