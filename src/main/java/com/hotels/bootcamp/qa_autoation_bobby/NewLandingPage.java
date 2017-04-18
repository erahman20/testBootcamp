package com.hotels.bootcamp.qa_autoation_bobby;

import org.openqa.selenium.By;

public class NewLandingPage extends BasePage {
	
	private By locator;
	private By passKeys;

	public By getLocator() {
		return locator;
	}

	public void setLocator(By locator) {
		this.locator = locator;
	}
		
	public void clickStuff(By locator) {
		clickOn(locator);
	}

	public By getPassKeys() {
		return passKeys;
	}

	public void setPassKeys(By passKeys) {
		this.passKeys = passKeys;
	}
	
	public void passingKey(By locator, String keysToSend) {
		enterData(locator, keysToSend);
	}
	public void selecting(By locator) {
		selected(locator);
	}
	public void texts(By locator, String actual) {
		verifyingText(locator, actual);
	}
	
	
	

}
