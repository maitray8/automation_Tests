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


	
	@AfterSuite
	public void closeBrowser() {
		BasePage.closeBroswer();
	}
}
