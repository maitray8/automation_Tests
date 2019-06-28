package com.mth.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.mth.configuration.*;
import com.mth.Locators.Locators.LoginPageLocators;

public class LoginPage extends TemplatePage implements LoginPageLocators {

	@FindBy(how = How.ID, using = USERNAME_TEXTBOX_ID)
	private WebElement username_textbox;

	@FindBy(how = How.ID, using = PASSWORD_TEXTBOX_ID)
	private WebElement password_textbox;

	@FindBy(how = How.XPATH, using = SUBMIT_BUTTON_XPATH)
	private WebElement submit_button;

	@FindBy(how = How.XPATH, using = REMEMBER_ME_XPATH)
	private WebElement link_remeberme;

	@FindBy(how = How.XPATH, using = LOGO_XPATH)
	private WebElement link_forgotpassword;

	@FindBy(how = How.XPATH, using = LOGO_XPATH)
	private WebElement img_logo;

	@FindBy(how = How.XPATH, using = VALIDATION_MSG_ERROR_XPATH)
	private WebElement validation_msg;

	@FindBy(how = How.XPATH, using = PAGETITLE_XPATH)
	private WebElement dashboard_title;

	public WebElement getDashboard_title() {
		return dashboard_title;
	}

	public WebElement getImg_logo() {
		return img_logo;
	}

	public WebElement getValidation_msg() {
		return validation_msg;
	}

	public LoginPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getUsernameTextbox() {
		return username_textbox;
	}

	public WebElement getUsername_textbox() {
		return username_textbox;
	}

	public WebElement getPassword_textbox() {
		return password_textbox;
	}

	public WebElement getSubmit_button() {
		return submit_button;
	}

	public WebElement getLink_remeberme() {
		return link_remeberme;
	}

	public WebElement getLink_forgotpassword() {
		return link_forgotpassword;
	}

	public WebElement getPasswordTextbox() {
		return password_textbox;
	}

	public WebElement getSubmitButton() {
		return submit_button;
	}

	// Verifying login page elements
	public void verifyLoginPage() throws Exception {
		HomePage homePage = new HomePage();
		homePage.get_loginlink().click();
		waitForPageToLoad();
		verifyElement(getImg_logo(), "Logo");
		verifyElement(getUsernameTextbox(), "Username Textbox");
		verifyElement(getPasswordTextbox(), "Password Textbox");
		verifyElement(getSubmitButton(), "Login Button");
		verifyElement(getLink_remeberme(), "Forgot Password Link");
		verifyElement(getLink_forgotpassword(), "Forgot Password Link");
	}

	// Verifying login functionality with valid credentials
	public void loginToApplication() throws Exception {
		LoginPage loginPage = new LoginPage();
		Reporter.log("Entering valid username:" + configFileReader.getCustomProperty("email"));
		loginPage.getUsernameTextbox().sendKeys(configFileReader.getCustomProperty("email"));
		Reporter.log("Entering valid password:" + configFileReader.getCustomProperty("password"));
		loginPage.getPasswordTextbox().sendKeys(configFileReader.getCustomProperty("password"));
		loginPage.getSubmitButton().click();
		waitForPageToLoad();
		if(getDashboard_title().isDisplayed()) {
			Reporter.log("User is navigated on dashboard page");
		}
	}

	// Verifying login functionality with invalid credentials
	public void loginToApplication_Invalid() throws IOException {
		LoginPage loginPage = new LoginPage();
		Reporter.log("Entering invalid username:" + configFileReader.getCustomProperty("incorrect_email"));
		loginPage.getUsernameTextbox().sendKeys(configFileReader.getCustomProperty("incorrect_email"));
		Reporter.log("Entering invalid password:" + configFileReader.getCustomProperty("password"));
		loginPage.getPasswordTextbox().sendKeys(configFileReader.getCustomProperty("password"));
		loginPage.getSubmitButton().click();
		if (getValidation_msg().isDisplayed()) {
			Reporter.log("Validation message is displayed");
		}
	}

}
