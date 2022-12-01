package tdit.TestBase;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import tdit.driverfactory.Driverfactory;
import tdit.utils.PropConfig;
import tditsolutions.pages.AddAccount;
import tditsolutions.pages.AddSecurityPage;
import tditsolutions.pages.DeleteAccount;
import tditsolutions.pages.HomePage;
import tditsolutions.pages.LoginPage;
import tditsolutions.pages.UpdateAccount;

public class TestBase {

	protected AddSecurityPage addpage;
	protected Driverfactory df;
	protected WebDriver driver;
	protected LoginPage loginPage;
	protected HomePage homePage;
	protected AddAccount addaccount;
	protected UpdateAccount updateaccount;
	protected DeleteAccount deleteaccount;
    PropConfig propconfig;
	protected Properties prop;
	
	
	@Parameters (value = {"EnvName"})
	
	@BeforeMethod
	public void beforemethod(String env) {
		
		propconfig=PropConfig.getInstance();
		try {
	     prop= PropConfig.load_prop(env);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		df = new Driverfactory();
		driver=df.init_driver(prop.getProperty("browser"));
		driver.get(prop.getProperty("app_url"));
		loginPage = new LoginPage(driver);

	}

	@AfterMethod
	public void aftermethod() {
		driver.quit();
	}

}
