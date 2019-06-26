package com.mth.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mth.Locators.Locators.DashboardLocators;
import com.mth.Locators.Locators.HomePageLocators;
import com.mth.configuration.BasePage;

public class DashboardPage extends BasePage implements DashboardLocators {

	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = PAGETITLE_XPATH)
	private WebElement dashboardtitle;

	@FindBy(how = How.XPATH, using = UPCOMING_EVENT_ID)
	private WebElement upcoming_event;

	@FindBy(how = How.XPATH, using = OVER_DUE_LENT_ITEM_ID)
	private WebElement overdue_lent_item;
	
	@FindBy(how = How.XPATH, using = UPCOMING_EVENT_ID)
	private WebElement account_info;
	
	@FindBy(how = How.XPATH, using = UPCOMING_EVENT_ID)
	private WebElement finance_tile;
	
	@FindBy(how = How.XPATH, using = BIRTHDAY_TILE_ID)
	private WebElement birthday_tile;
	
	
	public WebElement getBirthday_tile() {
		return birthday_tile;
	}

	public WebElement getDashboardtitle() {
		return dashboardtitle;
	}

	public WebElement getUpcoming_event() {
		return upcoming_event;
	}

	public WebElement getOverdue_lent_item() {
		return overdue_lent_item;
	}

	public WebElement getAccount_info() {
		return account_info;
	}

	public WebElement getFinance_tile() {
		return finance_tile;
	}

	public void verify_LandingPage() throws Exception {
		verifyElement(getDashboardtitle(), "Dashboard Title");
		verifyElement(getOverdue_lent_item(), "Over due lent item Tile");
		verifyElement(getUpcoming_event(), "Upcoming event Tile");
		verifyElement(getAccount_info(), "Account Information Tile");
		verifyElement(getFinance_tile(), "Finance Tile");
		verifyElement(getBirthday_tile(), "Birthday Tile");
	
	}
	
	
	
}
