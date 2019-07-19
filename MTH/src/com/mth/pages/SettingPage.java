
package com.mth.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.mth.Locators.Locators.settingPageLocators;

/**
 * @author Maitray Bhatt & Nidhi Gohil
 *
 */
public class SettingPage extends DashboardPage implements settingPageLocators {

	@FindBy(how = How.XPATH, using = RATE_TAB_XPATH)
	private WebElement rate_tab;

	@FindBy(how = How.XPATH, using = RATE_TXT_NAME_ID)
	private WebElement rate_txt_name;

	@FindBy(how = How.ID, using = AMOUNT_TXT_ID)
	private WebElement rate_txt_amount;

	@FindBy(how = How.XPATH, using = EVERY_TXT_ID)
	private WebElement rate_txt_every;

	@FindBy(how = How.XPATH, using = DESCRIPTION_TXTAREA_ID)
	private WebElement description_txt;

	@FindBy(how = How.XPATH, using = CREATE_NEW_RATE_BUTTON)
	private WebElement btn_txt_add_rate;

	@FindBy(how = How.CSS, using = PERIOD_DROPDOWN_ID)
	private WebElement drp_period;

	@FindBy(how = How.XPATH, using = SELECT_LESSON_XPATH)
	private WebElement select_lesson;

	@FindBy(how = How.XPATH, using = SUCCESS_MESSAGE_CLASS)
	private WebElement sucess_message;

	

	public SettingPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

	public WebElement getSelect_lesson() {
		return select_lesson;
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

	public WebElement getSucess_message() {
		return sucess_message;
	}

	// Clicking on setting menu
	public void getSettingMenu() throws Exception {
		waitForPageToLoad();
		verifyElement(getProfile_icon(), "Profile Icone");
		driver.get(getApplicationUrl() + "/teacher/studiosettings.php");
	}

	// Clicking on rate tab
	public void navigateToRateSetting_Page() throws Exception {
		waitForPageToLoad();
		driver.get(getApplicationUrl() + "/teacher/ratesettings.php");
		waitForPageToLoad();
	}

	// Verifying elements on rate package
	public void verifyRatePackagePage() throws Exception {
		Reporter.log("Verifying elements on  rate setting page");
		verifyElement(getRate_txt_name(), "Name Textbox");
		verifyElement(getRate_txt_amount(), "Amount Textbox");
		verifyElement(getRate_txt_every(), "Every Textbox");
		verifyElement(getDrp_period(), "Period Dropdown");
		verifyElement(getDescription_txt(), "Description Textbox");
		verifyElement(getBtn_txt_add_rate(), "Create New Rate Package Button");
	}

	public void createRatePackage(String name, String amount, String every, String description) throws Exception {
		Reporter.log("Entering valid details on rate setting page");
		Actions actions = new Actions(driver);
		actions.moveToElement(getRate_txt_name());
		actions.click();
		actions.sendKeys(name);
		actions.moveToElement(getRate_txt_amount());
		actions.click();
		actions.sendKeys(amount);
		actions.moveToElement(getRate_txt_every());
		actions.click();
		actions.sendKeys(every);
		actions.moveToElement(getDescription_txt());
		actions.click();
		actions.sendKeys(description);
		actions.moveToElement(getDrp_period());
		actions.click();
		actions.moveToElement(getSelect_lesson());
		actions.click();
		actions.moveToElement(getBtn_txt_add_rate());
		actions.click();
		actions.build().perform();
		waitForPageToLoad();
		waitForElementToAppear(getSucess_message());
		verifyElement(getSucess_message(), "Sucess Message");
	}
}
