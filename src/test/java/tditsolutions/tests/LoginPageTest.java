package tditsolutions.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import tdit.TestBase.TestBase;
import tdit.utils.constants;
import tditsolutions.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	
	
	@Test
	public void Verify_DoLoginPage() {
		String Actual=loginPage.getHeaderTitle();
		Assert.assertEquals(Actual,constants.LoginPage_HeaderTitle);
		homePage=loginPage.doLogin("sump1", "techfin@12");
	}
	
	
	
	
	
	
	
	
	

}
