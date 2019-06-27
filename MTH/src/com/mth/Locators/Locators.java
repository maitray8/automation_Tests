package com.mth.Locators;

public interface Locators {

	public interface TemplatePageLocator {

	}

	public interface LoginPageLocators {
		String LOGO_XPATH = "//div[contains(@class,'logo')]//img";
		String REMEMBER_ME_XPATH = "//div[contains(@class,'rmmberMe')]/span";
		String FORGOT_PASSWORD_XPATH = "//a[text()='Forgot Password?']";
		String PROBLEM_IN_LOGIN_XPATH = "//a[text()='Problem Logging in?']";
		String USERNAME_TEXTBOX_ID = "inputEmail";
		String PASSWORD_TEXTBOX_ID = "inputPassword";
		String SUBMIT_BUTTON_XPATH = "//button[contains(text(),'Log In')]";
		String VALIDATION_MSG_ERROR_XPATH="//div[contains(@class,'danger')]";
		String PAGETITLE_XPATH = "//title[contains(text(),'Dashboard')]";

		
	}

	public interface DashboardLocators {

		String PAGETITLE_XPATH = "//span[text()='Dashboard']";
		String UPCOMING_EVENT_ID="//div[@id='upcoming-events']";
		String OVER_DUE_LENT_ITEM_ID="//div[@id='money']";
		String ACCOUNT_INFO_ID="//div[@id='finances']";
		String MONTHLY_EARNING_CHART="//div[@id='money']";
		String BIRTHDAY_TILE_ID="//div[@id='birthday']";

	}

	public interface HomePageLocators {
		String LOGIN_LINK = "//a[contains(@href,'login')]";
	}

}
