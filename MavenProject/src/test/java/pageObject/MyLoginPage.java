package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyLoginPage extends BasePage {

	public MyLoginPage(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtpass;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnlogin;

	public void setUseremail(String email) {

		txtEmail.sendKeys(email);
	}

	public void setUserpass(String pass) {

		txtpass.sendKeys(pass);

	}

	public void clkLogin() {

		btnlogin.click();

	}

}
