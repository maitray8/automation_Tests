package com.mth.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.mth.configuration.*;
import com.mth.Locators.Locators.LoginPageLocators;
import com.mth.configuration.BasePage;;

public class LoginPage extends TemplatePage implements LoginPageLocators {
	
	
	@FindBy(how = How.ID, using = USERNAME_TEXTBOX_ID)
	private WebElement username_textbox;
	
	@FindBy(how = How.ID, using = PASSWORD_TEXTBOX_ID)
	private WebElement password_textbox;
	
	@FindBy(how = How.XPATH, using = SUBMIT_BUTTON_XPATH)
	private WebElement submit_button;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void loginToApplication() throws IOException {
		HomePage hp = new HomePage();
		LoginPage lp = new LoginPage();
		
		hp.get_loginlink().click();
		lp.getUsernameTextbox().sendKeys(configFileReader.getCustomProperty("email"));
		lp.getPasswordTextbox().sendKeys(configFileReader.getCustomProperty("password"));
		lp.getSubmitButton().click();
	}
	
	public void loginToApplication_Invalid() throws IOException {
		
	}

	public WebElement getUsernameTextbox(){
		return username_textbox;
	}
	
	public WebElement getPasswordTextbox(){
		return password_textbox;
	}
	
	public WebElement getSubmitButton(){
		return submit_button;
	}
}
