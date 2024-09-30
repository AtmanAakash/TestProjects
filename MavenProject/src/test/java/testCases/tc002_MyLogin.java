package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.MyAccountPage;
import pageObject.MyLoginPage;
import testBase.BaseClass;

public class tc002_MyLogin extends BaseClass{
	
	
	
	@DataProvider(name = "loginData")
	Object[][] testData() {

		Object getdata[][] = { { "Admin", "Admin123" }, { "sfffsf@gmail.com", "Cn@hqTVnMJcht8" }};

		return getdata;
	}
	
	@Test (groups = {"Sanity"}, dataProvider = "loginData" )
	public void verifyMylogin(String username, String password)  {
		
				
		try {
			
			HomePage hp = new HomePage(driver);
			hp.clickmyAccount();
			hp.clickmyLogin();
			
			MyLoginPage lp =new MyLoginPage(driver);
			
			lp.setUseremail(username);
			lp.setUserpass(password);
			lp.clkLogin();
			
			MyAccountPage ap =new MyAccountPage(driver);
			boolean targetpage = ap.isMyaccountExist();
			Assert.assertEquals(targetpage, true);
			
		} catch (Exception e) {
			
			Assert.fail();
			
		}
		
		
		
		
		
			
		
		
	

}

}