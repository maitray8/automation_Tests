package com.mth.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.mth.Locators.Locators.LoginPageLocators;
import com.mth.configuration.BasePage;;

public class LoginPage extends TemplatePage implements LoginPageLocators {
	public LoginPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	

}
