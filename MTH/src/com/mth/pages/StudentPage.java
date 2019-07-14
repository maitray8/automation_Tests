
package com.mth.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.mth.Locators.Locators.settingPageLocators;
import com.mth.Locators.Locators.studentPageLocators;

/**
 * @author Maitray Bhatt & Nidhi Gohil
 *
 */
public class StudentPage extends TemplatePage implements studentPageLocators {

	public StudentPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = BTN_ADD_STUDENT_XPATH)
	private WebElement btn_addstudent;

	@FindBy(how = How.XPATH, using = ADD_NEW_STUDENT_XPATH)
	private WebElement Add_student_pop_up;

	@FindBy(how = How.XPATH, using = TXT_FIRSTNAME_XPATH)
	private WebElement txt_first_name;

	@FindBy(how = How.XPATH, using = TXT_LASTNAME_XPATH)
	private WebElement txt_last_name;

	@FindBy(how = How.XPATH, using = RADIOBTN_ACTIVE_XPATH)
	private WebElement rdbtn_Active_status;

	@FindBy(how = How.XPATH, using = RADIOBTN_LEAD_XPATH)
	private WebElement rdbtn_lead_status;

	@FindBy(how = How.XPATH, using = RADIOBTN_WAITLIST_XPATH)
	private WebElement rdbtn_wait_status;

	@FindBy(how = How.XPATH, using = BTN_CREATE_XPATH)
	private WebElement btn_create;

	@FindBy(how = How.XPATH, using = BTN_CANCEL_XPATH)
	private WebElement btn_cancel;

	@FindBy(how = How.XPATH, using = BTN_ADD_DETAIL_XPATH)
	private WebElement btn_add_Details;

	public WebElement getRdbtn_Active_status() {
		return rdbtn_Active_status;
	}

	public WebElement getRdbtn_lead_status() {
		return rdbtn_lead_status;
	}

	public WebElement getRdbtn_wait_status() {
		return rdbtn_wait_status;
	}

	public WebElement getBtn_addstudent() {
		return btn_addstudent;
	}

	public WebElement getAdd_student_pop_up() {
		return Add_student_pop_up;
	}

	public WebElement getTxt_first_name() {
		return txt_first_name;
	}

	public WebElement getTxt_last_name() {
		return txt_last_name;
	}

	public WebElement getBtn_create() {
		return btn_create;
	}

	public WebElement getBtn_cancel() {
		return btn_cancel;
	}

	public WebElement getBtn_add_Details() {
		return btn_add_Details;
	}

	public void naviagteToStudentListingPage() {
		Reporter.log("Navigating to student listing page");
		driver.get(getApplicationUrl() + "/teacher/students.php");
		waitForPageToLoad();
	}

	public void verify_Add_Student_Page() throws Exception {
		Actions actions = new Actions(driver);
		actions.moveToElement(getBtn_addstudent());
		actions.click();
		actions.build().perform();
	}

	public void VerifyAddStudentPopup() throws Exception {
		Reporter.log("Verifying element on new student pop up");
		verifyElement(getAdd_student_pop_up(), "Pop Up");
		waitForPageToLoad();
		driver.switchTo().frame(getAdd_student_pop_up());
		verifyElement(getTxt_first_name(), "First Name Textbox");
		verifyElement(getTxt_last_name(), "Last Name Textbox");
		verifyElement(getRdbtn_Active_status(), "Active Status Radio Button");
		verifyElement(getRdbtn_lead_status(), "Lead Status Radio Button");
		verifyElement(getRdbtn_wait_status(), "wait Status Radio Button");
		verifyElement(getBtn_add_Details(), "Add Detail Button");
		verifyElement(getBtn_cancel(), "Cancel Button");
		verifyElement(getBtn_create(), "Create Button");

	}

	public void createStudent(String name, String lastname) {
		getTxt_first_name().sendKeys(name);
		getTxt_last_name().sendKeys(lastname);
		getBtn_create().click();
	}
}
