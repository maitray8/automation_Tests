package com.mth.test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.mth.configuration.BasePage;
import com.mth.pages.DashboardPage;
import com.mth.pages.LoginPage;

public class MTHTest {

	@BeforeSuite
	public void setUpBrowser() {
		BasePage.OpenApplication();
	}

	@Test(groups = { "regression",
			"smoke" }, priority = 1, description = "This test suit is to verify login page elements")
	public void verify_loginPage() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.verifyLoginPage();
	}

	@Test(groups = {
			"regression" }, priority = 2
					, description = "suit is to verify login page with incorrect Credentail")
	public void login_With_InValid_Credentails() throws IOException {
		LoginPage loginPage = new LoginPage();
		loginPage.loginToApplication_Invalid();
	}

	@Test(groups = { "regression",
			"smoke" }, priority = 3, description = "suit is to verify login page with correct Credentail")
	public void login_With_Valid_Credentails() throws Exception {
		LoginPage loginPage = new LoginPage();
		loginPage.loginToApplication();
	}


	@Test(groups = { "regression",
			"smoke" }, priority = 4, description = "suit is to verify dashboard")
	public void verify_dashboard() throws Exception {
		DashboardPage dashboardPage=new DashboardPage();
		dashboardPage.verify_LandingPage();
	}	
	
	@AfterSuite
	public void closeBrowser() {
		BasePage.closeBroswer();
	}
}
