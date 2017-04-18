package com.hotels.bootcamp.qa_autoation_bobby;

import org.openqa.selenium.By;

public class SignInLanding extends BasePage {
	
	
	private By signIN;
	private By createAccount; 
	private By sendValidEmail;
	private By sendValidPass;
	private By sendFirstName;
	private By sendLastName;
	private By clickCreate;
	
	
	public SignInLanding() {
		signIN = By.xpath(".//*[@id='hdr-account']");
		createAccount = By.xpath(".//*[@id='hdr-create']");
		sendValidEmail = By.xpath(".//*[@id='sign-up-email']");
		sendValidPass = By.xpath(".//*[@id='sign-up-password']");
		sendFirstName = By.xpath(".//*[@id='sign-up-first-name']");
		sendLastName = By.xpath(".//*[@id='sign-up-last-name']");
		clickCreate = By.xpath(".//*[@id='signup-button']");
	}
		
	public void signInButton() {
		clickOn(signIN);
	}
	public void createAccountButton() {
		clickOn(createAccount);
	}
	public void enterValidEmail(String keysTosend) {
		enterData(sendValidEmail, keysTosend);
	}
	public void enterValidPass(String keysTosend) {
		enterData(sendValidPass, keysTosend);
	}
	public void enterFistName(String keysTosend) {
		enterData(sendFirstName, keysTosend);
	}
	public void enterLastName(String keysTosend) {
		enterData(sendLastName, keysTosend);
	}
	public void clickONCreate() {
		clickOn(clickCreate);
	}
	
	
	
	
	
}





