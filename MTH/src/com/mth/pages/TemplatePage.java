package com.mth.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.mth.Locators.Locators.TemplatePageLocator;
import com.mth.configuration.BasePage;

public class TemplatePage extends BasePage implements TemplatePageLocator {
	@FindBy(how = How.XPATH, using = PROFILE_ICON_XPATH)
	private WebElement profile_icon;

	@FindBy(how = How.XPATH, using = SETTING_MENU_XPATH)
	private WebElement setting_menu;

	@FindBy(how = How.XPATH, using = DIV_TOP_XPATH)
	private WebElement top_menu;

	@FindBy(how = How.XPATH, using = HELP_ICON)
	private WebElement help_menu;

	@FindBy(how = How.XPATH, using = TOGGLE_HELP_BOX_XPATH)
	private WebElement toggle_menu;

	@FindBy(how = How.XPATH, using = MENU_DASHBOARD)
	private WebElement dashboard_menu;

	@FindBy(how = How.XPATH, using = TEACHER_HELP_XPATH)
	private WebElement teacher_helptext;

	@FindBy(how = How.XPATH, using = STUDENT_HELP_XPATH)
	private WebElement student_helptext;

	public WebElement getTop_menu() {
		return top_menu;
	}

	public WebElement getProfile_icon() {
		return profile_icon;
	}

	public WebElement getSetting_menu() {
		return setting_menu;
	}

	public WebElement getHelp_menu() {
		return help_menu;
	}

	public WebElement getToggle_menu() {
		return toggle_menu;
	}

	public WebElement getDashboard_menu() {
		return dashboard_menu;
	}

	public WebElement getTeacher_helptext() {
		return teacher_helptext;
	}

	public WebElement getStudent_helptext() {
		return student_helptext;
	}

	public void verify_help_functionality() throws Exception {
		verifyElement(getHelp_menu(), "Help Menu");
		getHelp_menu().click();
		verifyElement(getToggle_menu(), "Toggle Menu");
		getToggle_menu().click();
		verifyElement(getStudent_helptext(), "Student Helptext");
		getDashboard_menu().click();
		waitForPageToLoad();
		verifyElement(getTeacher_helptext(), "Teacher Helptext");

	}

}
