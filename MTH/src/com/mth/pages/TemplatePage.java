package com.mth.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.mth.Locators.Locators.TemplatePageLocator;
import com.mth.configuration.BasePage;
/**
 * @author Maitray Bhatt & Nidhi Gohil
 *
 */
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

	@FindBy(how = How.XPATH, using = MENU_STUDENTS_XPATH)
	private WebElement menustudent;

	@FindBy(how = How.XPATH, using = MENU_STUDENT_LIST_XPATH)
	private WebElement menustdent_list;

	@FindBy(how = How.XPATH, using = MENU_PRACTICE_LOG_XPATH)
	private WebElement menupractice_log;

	@FindBy(how = How.XPATH, using = MENU_LENDING_LIBRARY_XPATH)
	private WebElement menulending_library;

	@FindBy(how = How.XPATH, using = MENU_REPERATOIRE_XPATH)
	private WebElement menuReportoire_tracker;

	@FindBy(how = How.XPATH, using = MENU_PUSH_ANNOUNCEMENT_XPATH)
	private WebElement menupush_annoucement;

	@FindBy(how = How.XPATH, using = MENU_CALENDAR_XPATH)
	private WebElement menu_calendar;

	@FindBy(how = How.XPATH, using = MENU_BIILING_XPATH)
	private WebElement menu_billing;

	@FindBy(how = How.XPATH, using = MENU_ALL_REPORTS_XPATH)
	private WebElement menu_all_reports;

	@FindBy(how = How.XPATH, using = MENU_REPORTS_XPATH)
	private WebElement menu_reports;

	@FindBy(how = How.XPATH, using = MENU_FINANCE_REPORTS_XPATH)
	private WebElement menu_finance_reports;

	@FindBy(how = How.XPATH, using = MENU_STUDENT_REPORTS_XPATH)
	private WebElement menu_student_reports;

	@FindBy(how = How.XPATH, using = MENU_CALENDAR_REPORTS_XPATH)
	private WebElement menu_calendar_reports;

	@FindBy(how = How.XPATH, using = MENU_WEBSITE_XPATH)
	private WebElement menu_website;

	@FindBy(how = How.XPATH, using = MENU_PAGES_XPATH)
	private WebElement menu_pages;

	@FindBy(how = How.XPATH, using = MENU_THEME_XPATH)
	private WebElement menu_theme;

	@FindBy(how = How.XPATH, using = MENU_BLOG_XPATH)
	private WebElement menu_blog;

	@FindBy(how = How.XPATH, using = MENU_PHOTOS_XPATH)
	private WebElement menu_photos;

	@FindBy(how = How.XPATH, using = MENU_PHOTOS_XPATH)
	private WebElement menu_links;
	
	@FindBy(how = How.XPATH, using = MENU_PHOTOS_XPATH)
	private WebElement menu_announcement;

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

	public WebElement getMenustudent() {
		return menustudent;
	}

	public WebElement getMenustdent_list() {
		return menustdent_list;
	}

	public WebElement getMenupractice_log() {
		return menupractice_log;
	}

	public WebElement getMenulending_library() {
		return menulending_library;
	}

	public WebElement getMenuReportoire_tracker() {
		return menuReportoire_tracker;
	}

	public WebElement getMenupush_annoucement() {
		return menupush_annoucement;
	}

	public WebElement getMenu_calendar() {
		return menu_calendar;
	}

	public WebElement getMenu_billing() {
		return menu_billing;
	}

	public WebElement getMenu_all_reports() {
		return menu_all_reports;
	}

	public WebElement getMenu_website() {
		return menu_website;
	}

	public WebElement getMenu_reports() {
		return menu_reports;
	}

	public WebElement getMenu_finance_reports() {
		return menu_finance_reports;
	}

	public WebElement getMenu_student_reports() {
		return menu_student_reports;
	}

	public WebElement getMenu_calendar_reports() {
		return menu_calendar_reports;
	}

	public WebElement getMenu_pages() {
		return menu_pages;
	}

	public WebElement getMenu_theme() {
		return menu_theme;
	}

	public WebElement getMenu_blog() {
		return menu_blog;
	}

	public WebElement getMenu_photos() {
		return menu_photos;
	}

	public WebElement getMenu_links() {
		return menu_links;
	}

	public WebElement getMenu_announcement() {
		return menu_announcement;
	}
	// Method to verify help menu functionality
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
	// Method to verify Navigation menu
	public void verify_nevigation_menu() throws Exception {
		verifyElement(getDashboard_menu(), "Dashboard Menu");
		verifyElement(getMenustudent(), "Student Menu");
		getMenustudent().click();
		verifyElement(getMenu_all_reports(), "All Reports menu");
		verifyElement(getMenupractice_log(), "Practice log menu");
		verifyElement(getMenulending_library(), "Lending library menu");
		verifyElement(getMenuReportoire_tracker(), "Reportoire Tracker menu");
		verifyElement(getMenupush_annoucement(), "Push announcement menu");
		verifyElement(getMenu_calendar(), "Calendar Menu");
		verifyElement(getMenu_billing(), "Billing Menu");
		verifyElement(getMenu_reports(), "Report Menu");
		getMenu_reports().click();
		verifyElement(getMenu_all_reports(), "All Report Menu");
		verifyElement(getMenu_finance_reports(), "Finance Report Menu");
		verifyElement(getMenu_student_reports(), "Student Report Menu");
		verifyElement(getMenu_calendar_reports(), "Calendar Report Menu");
		verifyElement(getMenu_website(), "Website Menu");
		getMenu_website().click();
		verifyElement(getMenu_pages(), "Page Menu");
		verifyElement(getMenu_theme(), "Theme menu");
		verifyElement(getMenu_blog(), "Blog menu");
		verifyElement(getMenu_photos(), "Photo menu");
		verifyElement(getMenu_announcement(), "Announcement menu");
		verifyElement(getMenu_links(), "Link menu");

	}
}
