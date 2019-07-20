
package com.mth.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.mth.Locators.Locators.calendarPageLocatores;
import com.mth.Locators.Locators.settingPageLocators;

/**
 * @author Maitray Bhatt & Nidhi Gohil
 *
 */
public class CalendarPage extends LoginPage implements calendarPageLocatores {

/*	@FindBy(how = How.XPATH, using =  )
	private WebElement ;
*/
	public CalendarPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
}

