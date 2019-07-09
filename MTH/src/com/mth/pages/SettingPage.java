
package com.mth.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.mth.Locators.Locators.settingPageLocators;

public class SettingPage extends TemplatePage implements settingPageLocators {

	@FindBy(how = How.XPATH, using = RATE_TAB_XPATH)
	private WebElement rate_tab;

	@FindBy(how = How.XPATH, using = RATE_TXT_NAME_ID)
	private WebElement rate_txt_name;

	@FindBy(how = How.ID, using = AMOUNT_TXT_ID)
	private WebElement rate_txt_amount;

	@FindBy(how = How.XPATH, using = EVERY_TXT_ID)
	private WebElement rate_txt_every;

	@FindBy(how = How.CSS, using = DESCRIPTION_TXTAREA_ID)
	private WebElement description_txt;

	@FindBy(how = How.XPATH, using = CREATE_NEW_RATE_BUTTON)
	private WebElement btn_txt_add_rate;

	@FindBy(how = How.CSS, using = PERIOD_DROPDOWN_ID)
	private WebElement drp_period;

	public SettingPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

	public WebElement getRate_tab() {
		return rate_tab;
	}

	public WebElement getRate_txt_name() {
		return rate_txt_name;
	}

	public WebElement getRate_txt_amount() {
		return rate_txt_amount;
	}

	public WebElement getRate_txt_every() {
		return rate_txt_every;
	}

	public WebElement getDescription_txt() {
		return description_txt;
	}

	public WebElement getBtn_txt_add_rate() {
		return btn_txt_add_rate;
	}

	public WebElement getDrp_period() {
		return drp_period;
	}

	// Clicking on setting menu
	public void getSettingMenu() throws Exception {
		waitForPageToLoad();
		driver.get(getApplicationUrl() + "/teacher/studiosettings.php");
	}

	// Clicking on rate tab
	public void navigateToRateSetting_Page() throws InterruptedException {
		waitForPageToLoad();
		driver.get(getApplicationUrl() + "/teacher/ratesettings.php");
		waitForPageToLoad();
		/*
		 * if(getRate_tab().isDisplayed()) {
		 * Reporter.log("Navigated to rates setting page"); } else {
		 * Reporter.log("Not Navigated to rates setting page"); }
		 */
	}

	// Verifying elements on rate package
	public void verifyRatePackagePage() throws Exception {
		Reporter.log("Verifying elements on  rate setting page");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		verifyElement(getRate_txt_name(), "Name Textbox");
		verifyElement(getRate_txt_amount(), "Amount Textbox");
		verifyElement(getRate_txt_every(), "Every Textbox");
		verifyElement(getDrp_period(), "Period Dropdown");
		verifyElement(getBtn_txt_add_rate(), "Create New Rate Package Button");
	}

}
