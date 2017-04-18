package com.hotels.bootcamp.qa_autoation_bobby;

import org.openqa.selenium.By;


public class LandingPage extends BasePage{
	
		private By Support;
	    private By loginButton;
	    private By choose;
	    public LandingPage(){
	    	Support = By.xpath(".//*[@id='resp-footer']/div[3]/div[1]/div[1]/ul[1]/li[3]/h2");
	        loginButton = By.xpath(".//*[@id='ftr-feedback']");
	        choose = By.id("comment-select");
	        
	    }
	    
	    


	    public void clickOnButton(){
	        clickOn(loginButton);
	    }
	    public void clickOnSupport(){
	    	clickOn(Support);
	    }
	    public void clickOnchoose() {
	    	clickOn(choose);
	    }
	   public void enterDatachoose(String keysTosend) {
		   enterData(choose, keysTosend);
	    }
}
