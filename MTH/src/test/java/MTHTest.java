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

	@Test
	public void loginTest() throws IOException {
		LoginPage lp = new LoginPage();
		
		lp.loginToApplication();
	}
	
	@AfterSuite
	public void closeBrowser() {
		BasePage.closeBroswer();
	}
}
