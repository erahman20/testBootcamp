package com.hotels.bootcamp.qa_autoation_bobby;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestVerifySubmit extends WebDriverFactory {
	
	
	@Test
	public void VerifyTest() {
		
		NewLandingPage verifyLanding = new NewLandingPage() ;
		
		verifyLanding.clickStuff(By.xpath(".//*[@id='resp-footer']/div[3]/div[1]/div[1]/ul[1]/li[3]/h2"));
		verifyLanding.clickStuff(By.xpath(".//*[@id='ftr-feedback']"));
		
		for (String windowName : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(windowName);
		}
		verifyLanding.clickStuff(By.xpath(".//*[@id='overall-1']"));
		verifyLanding.clickStuff(By.xpath("html/body/form/footer/div/div/div[1]/input"));
	}

}
