
package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegister;
import pageObject.HomePage;
import testBase.BaseClass;

public class tc001_AccountRegister extends BaseClass {

	@Test (groups = {"Regression"})
	public void verifyAccRegisteration() throws IOException {

		HomePage hp = new HomePage(driver);
		hp.clickmyAccount();
		hp.clickmyRegister();

		AccountRegister ar = new AccountRegister(driver);
		ar.setFirstname(randomString().toUpperCase());
		ar.setLastname(randomString().toUpperCase());
		ar.setEmail(randomString() + "@gmail.com");
		ar.setNumber(randomNumber());

		String password = randomAlphaNumeric();

		ar.setPassword(password);
		ar.setConPassword(password);
		ar.clickPolicy();
		ar.ClickContinue();
		String confirmMsg = ar.getConfirmMsg();
		Assert.assertEquals(confirmMsg, "Your Account Has Been Created!");
		

	}

}
