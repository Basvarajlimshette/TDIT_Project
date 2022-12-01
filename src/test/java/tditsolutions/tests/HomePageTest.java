package tditsolutions.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import tdit.TestBase.TestBase;
import tdit.utils.constants;
import tditsolutions.pages.HomePage;
import tditsolutions.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	@Test
	public void Verify_Homepage() {
		
		
	   HomePage homePage=loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		String actualmag=homePage.welcomeMsg();
		Assert.assertEquals(actualmag,constants.HomePage_WelcomMsg);
		String actual=homePage.getHomePageTitle();
		Assert.assertEquals(actual,constants.HomePage_HeaderTitle);
		
	}

}
