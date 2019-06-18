package com.mth.Locators;

public interface Locators {

	public interface TemplatePageLocator{
		

	}
	
	public interface LoginPageLocators {
		
		String USERNAME_TEXTBOX_ID = "inputEmail";
		String PASSWORD_TEXTBOX_ID = "inputPassword";
		String SUBMIT_BUTTON_XPATH = "//button[contains(text(),'Log In')]";
	}

	public interface DashboardLocators {
		
		String PAGETITLE_XPATH = "//title[contains(text(),'Dashboard')]";
		
	}

	public interface HomePageLocators {
		String LOGIN_LINK = "//a[contains(@href,'login')]";
	}
	

		
}
