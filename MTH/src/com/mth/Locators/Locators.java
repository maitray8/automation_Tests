package com.mth.Locators;

public interface Locators {

	public interface TemplatePageLocator {
		String PROFILE_ICON_XPATH = ".//div[@id='welcome']//div[@class='menu-profile']";
		String SETTING_MENU_XPATH = "//a[@class='menu-web-settings']";
		String DIV_TOP_XPATH = "//div[@id='top']";
		String HELP_ICON = "//div[@class='menu-support-icon']";
		String TOGGLE_HELP_BOX_XPATH = "//a[@id='help-show']";
		String STUDENT_HELP_XPATH = "//div[@id='hlpstudents-list-main']";
		String MENU_DASHBOARD = "//ul[@id='left-nav']//a[contains(@href,'teacher/index')]//span[text()='Dashboard']";
		String TEACHER_HELP_XPATH = "//div[@id='hlphome-intro']";


	}

	public interface LoginPageLocators {
		String LOGO_XPATH = "//div[contains(@class,'logo')]//img";
		String REMEMBER_ME_XPATH = "//div[contains(@class,'rmmberMe')]/span";
		String FORGOT_PASSWORD_XPATH = "//a[text()='Forgot Password?']";
		String PROBLEM_IN_LOGIN_XPATH = "//a[text()='Problem Logging in?']";
		String USERNAME_TEXTBOX_ID = "inputEmail";
		String PASSWORD_TEXTBOX_ID = "inputPassword";
		String SUBMIT_BUTTON_XPATH = "//button[contains(text(),'Log In')]";
		String VALIDATION_MSG_ERROR_XPATH = "//div[contains(@class,'danger')]";
		String PAGETITLE_XPATH = "//title[contains(text(),'Dashboard')]";
	}

	public interface DashboardLocators {

		String PAGETITLE_XPATH = "//span[text()='Dashboard']";
		String UPCOMING_EVENT_ID = "//div[@id='upcoming-events']";
		String OVER_DUE_LENT_ITEM_ID = "//div[@id='money']";
		String ACCOUNT_INFO_ID = "//div[@id='finances']";
		String MONTHLY_EARNING_CHART = "//div[@id='money']";
		String BIRTHDAY_TILE_ID = "//div[@id='birthday']";
		String ANNOUCEMENT_TILE_ID = "div #blog-feed";
	}

	public interface HomePageLocators {
		String LOGIN_LINK = "//a[contains(@href,'login')]";
	}

	public interface settingPageLocators {
		String RATE_TXT_NAME_ID = "//div[@id='NameRaterow']";
		String AMOUNT_TXT_ID = "Amountrow";
		String EVERY_TXT_ID = "//input[@id='Period']";
		String DESCRIPTION_TXTAREA_ID = "//textarea[@id='Description']";
		String PERIOD_DROPDOWN_ID = "div#LessonsType_chosen";
		String CREATE_RATE_ID = ".//input[@id='addratepackage']";
		String CREATE_NEW_RATE_BUTTON = ".//input[@id='addratepackage']";
		String RATE_TAB_XPATH = "//span[text()='Rates']";
		String SELECT_LESSON_XPATH = "//div[@class='chosen-drop']//ul//li[text()='Lesson']";
		String SUCCESS_MESSAGE_CLASS = "//span[text()='Your Rate Settings Have Been Updated.']";
	}

	public interface studentPageLocators {
		String BTN_ADD_STUDENT_XPATH = "//a[@title='New Student']";
		String ADD_NEW_STUDENT_XPATH = "//iframe[@id='externalSite']";
		String RADIOBTN_ACTIVE_XPATH = "//input[@value='Active']";
		String RADIOBTN_LEAD_XPATH = "//input[@value='Lead']";
		String RADIOBTN_WAITLIST_XPATH = "//input[@value='Waiting']";
		String TXT_FIRSTNAME_XPATH = "//input[@name='Student[0][First]']";
		String TXT_LASTNAME_XPATH = "//input[@name='Student[0][Last]']";
		String BTN_CREATE_XPATH = "//input[@id='AddStudent']";
		String BTN_ADD_DETAIL_XPATH = "//input[@id='addDetails']";
		String BTN_CANCEL_XPATH = "//a[text()='Cancel']";
		String ALL_TAB_XPATH = "//button[@data-id='all']";
		String ACTIVE_TAB_XPATH = "//button[@data-id='active']";
		String FORMER_TAB_XPATH = "//button[@data-id='former']";
		String LEAD_TAB_XPATH = "//button[@data-id='lead']";
		String WAITLIST_TAB_XPATH = "//button[@data-id='waitlist']";
		String BTN_FIRST_XPATH = "//a[text()='First']";
		String BTN_PREVIOUS_XPATH = "//a[text()='Previous']";
		String BTN_NEXT_XPATH = "//a[text()='Next']";
		String BTN_LAST_XPATH = "//a[text()='Last']";
	}
}
