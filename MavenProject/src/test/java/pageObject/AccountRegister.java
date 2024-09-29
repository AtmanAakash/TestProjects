package pageObject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

public class AccountRegister extends BasePage {

	public AccountRegister(WebDriver driver) {

		super(driver);

	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtfirstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtlastname;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement Usernumber;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtpwd;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtconfirmpwd;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkpolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btncontinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirmation;
	
	@FindBy(xpath ="//a[normalize-space()='Login']")
	WebElement btnlogin;
	
	

	public void setFirstname(String fname) {
		txtfirstname.sendKeys(fname);

	}

	public void setLastname(String lname) {

		txtlastname.sendKeys(lname);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}

	public void setNumber(String num) {
		Usernumber.sendKeys(num);

	}

	public void setPassword(String pwd) {
		txtpwd.sendKeys(pwd);

	}

	public void setConPassword(String pwd) {
		txtconfirmpwd.sendKeys(pwd);

	}

	public void clickPolicy() {
		chkpolicy.click();

	}

	public void ClickContinue() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btncontinue);

	}

	public String getConfirmMsg() {
		try {
			return (msgconfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}

	}
	
	public void clickLogin() {
		 
		btnlogin.click();
		
		}
		
	
	
	
//	public void screenShotMsg() throws IOException {
//		
//		TakesScreenshot tk = (TakesScreenshot)driver;
//		File src = tk.getScreenshotAs(OutputType.FILE);
//		File dest= new File ("E:\\Neweclipseworkspace\\MavenProject\\Screenshots.img.png");
//		FileHandler.copy(src, dest);
		
	}


