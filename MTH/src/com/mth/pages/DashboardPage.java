package com.mth.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mth.Locators.Locators.DashboardLocators;
import com.mth.Locators.Locators.HomePageLocators;
import com.mth.configuration.BasePage;

public class DashboardPage extends BasePage implements HomePageLocators{
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = DashboardLocators.PAGETITLE_XPATH)
	private WebElement dashboardtitle;
	
	public WebElement get_dashboardtitle() {return dashboardtitle;}
		
}


