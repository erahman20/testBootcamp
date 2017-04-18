package com.hotels.bootcamp.qa_autoation_bobby;

import org.testng.annotations.Test;

public class TestSignIn extends WebDriverFactory {

	
	@Test
	public void signIN() {
		
		SignInLanding accountSignIn = new SignInLanding();
		accountSignIn.signInButton();
		
		accountSignIn.createAccountButton();
		
		accountSignIn.enterValidEmail("emtajur.rahman@outlook.com");
		
		accountSignIn.enterValidPass("sinister1");
		
		accountSignIn.enterFistName("bobby");
		
		accountSignIn.enterLastName("rahman");
		
		accountSignIn.clickONCreate();
			
		
	}
	
}
