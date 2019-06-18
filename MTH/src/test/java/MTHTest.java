package test.java;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mth.configuration.BasePage;
import com.mth.configuration.configFileReader;
import com.mth.pages.LoginPage;

public class MTHTest {

	@BeforeSuite
	public void setUpBrowser() {
		BasePage.OpenApplication();
	}

	@Test(groups = {"regression","smoke"})
	public void login_With_Valid_Credentails() throws IOException {
		LoginPage lp = new LoginPage();
		lp.loginToApplication();
	}
	
	@Test(groups = {"regression"})
	public void login_With_InValid_Credentails() throws IOException {
		LoginPage lp = new LoginPage();
		lp.loginToApplication_Invalid();
	}
	
	@AfterSuite
	public void closeBrowser() {
		BasePage.closeBroswer();
	}
}
