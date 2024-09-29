package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.MyAccountPage;
import pageObject.MyLoginPage;
import testBase.BaseClass;

public class tc002_MyLogin extends BaseClass{
	
	@Test (groups = {"Sanity"})
	public void verifyMylogin()  {
		
		try {
			
			HomePage hp = new HomePage(driver);
			hp.clickmyAccount();
			hp.clickmyLogin();
			
			MyLoginPage lp =new MyLoginPage(driver);
			
			lp.setUseremail(p.getProperty("email"));
			lp.setUserpass(p.getProperty("password"));
			lp.clkLogin();
			
			MyAccountPage ap =new MyAccountPage(driver);
			boolean targetpage = ap.isMyaccountExist();
			Assert.assertEquals(targetpage, true);
			
		} catch (Exception e) {
			
			Assert.fail();
			
		}
		
		
		
		
		
			
		
		
	

}

}