package test.java;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.mth.configuration.BasePage;
import com.mth.configuration.configFileReader;
import com.mth.pages.DashboardPage;
import com.mth.pages.LoginPage;
import com.mth.pages.SettingPage;
import com.mth.pages.StudentPage;

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
			"regression" }, priority = 2, description = "suit is to verify login page with incorrect Credentail")
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

	@Test(groups = { "regression", "smoke" }, priority = 4, description = "suit is to verify dashboard")
	public void verify_dashboard() throws Exception {
		DashboardPage dashboardPage = new DashboardPage();
		dashboardPage.verify_LandingPage();
	}
	
	@Test(groups = { "regression", "smoke" }, priority = 4, description = "suit is to verify Navigation menu")
	public void verify_navigation_menu() throws Exception {
		DashboardPage dashboardPage = new DashboardPage();
		dashboardPage.verify_nevigation_menu();
	}

	@Test(groups = { "regression", "smoke" }, priority = 5, description = "suit is to verify add rate functionality")
	public void verify_add_rate_functionality() throws Exception {
		SettingPage settingPage = new SettingPage();
		settingPage.getSettingMenu();
		settingPage.navigateToRateSetting_Page();
		settingPage.verifyRatePackagePage();
		settingPage.createRatePackage("Test", "10", "1", "description");
	}

	@Test(groups = { "regression",
			"smoke" }, priority = 6, description = "suit is to verify add Add student functionality")
	public void verify_add_student_functionality() throws Exception {
		StudentPage studentPage = new StudentPage();
		studentPage.naviagteToStudentListingPage();
		studentPage.verify_Add_Student_Page();
		studentPage.VerifyAddStudentPopup();
		studentPage.createStudent(configFileReader.getCustomProperty("firstname"),
				configFileReader.getCustomProperty("LastName"));

	}
	
	@Test(groups = { "regression", "smoke" }, priority = 5, description = "suit is to verify student list with different status")
	public void Verify_Student_With_Different_Status() throws Exception {
		StudentPage studentPage = new StudentPage();
		studentPage.naviagteToStudentListingPage();
		studentPage.verify_tab();
		studentPage.verify_student_status();
		studentPage.verify_help_functionality();
	}

	@AfterSuite
	public void closeBrowser() {
		BasePage.closeBroswer();
	}

}
