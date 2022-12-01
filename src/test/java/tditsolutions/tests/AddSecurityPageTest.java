package tditsolutions.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import tdit.TestBase.TestBase;
import tdit.utils.constants;
import tditsolutions.DataProvider.DataProvideClass;
import tditsolutions.pages.AddSecurityPage;
import tditsolutions.pages.HomePage;
import tditsolutions.pages.LoginPage;

public class AddSecurityPageTest extends TestBase {

	AddSecurityPage addpage;

	@Test(dataProvider = "CreateAddSecurity", dataProviderClass = DataProvideClass.class)
	public void Verify_Add_Security(String securitynum, String iSInnum, String sedolnum, String date, String shares,
			String summery) {
		HomePage homePage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		addpage = homePage.clickOnAddSecurity();
		addpage.addSecurity(securitynum, iSInnum, sedolnum, date, shares, summery);
		boolean actual = addpage.IsAlertPresent();
		Assert.assertEquals(actual, true);
		String Actual = addpage.getAlertText();
		Assert.assertEquals(Actual, constants.AddSecurityMsg);

	}

}
