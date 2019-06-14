package com.mth.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mth.Locators.Locators.HomePageLocators;
import com.mth.configuration.BasePage;

public class HomePage extends BasePage implements HomePageLocators{
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = LOGIN_LINK)
	private WebElement loginlink;
	
	public WebElement get_loginlink() {return loginlink;}
		
}


