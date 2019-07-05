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

	public WebElement getTop_menu() {
		return top_menu;
	}

	public WebElement getProfile_icon() {
		return profile_icon;
	}
	
	public WebElement getSetting_menu() {
		return setting_menu;
	}

	

}
