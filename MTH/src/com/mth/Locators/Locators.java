package com.mth.Locators;

public interface Locators {

	public interface TemplatePageLocator {
		String PROFILE_ICON_XPATH = ".//div[@id='welcome']//div[@class='menu-profile']";
		String SETTING_MENU_XPATH = "//a[@class='menu-web-settings']";
		String DIV_TOP_XPATH = "//div[@id='top']";
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
		String SELECT_LESSON_XPATH="//div[@class='chosen-drop']//ul//li[text()='Lesson']";
		String SUCCESS_MESSAGE_CLASS="//span[text()='Your Rate Settings Have Been Updated.']";
	}
}
