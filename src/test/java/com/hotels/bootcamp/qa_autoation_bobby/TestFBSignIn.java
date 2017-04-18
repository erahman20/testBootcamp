package com.hotels.bootcamp.qa_autoation_bobby;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestFBSignIn extends WebDriverFactory {
	
	
	@Test
	public void fbSignIn() {
		
		NewLandingPage fbSignIn = new NewLandingPage();
		
		fbSignIn.clickStuff(By.xpath(".//*[@id='hdr-account']"));
		fbSignIn.clickStuff(By.xpath(".//*[@id='hdr-create']"));
		fbSignIn.clickStuff(By.xpath(".//*[@id='main-content']/div/div/div/div/div/div[1]/a[2]"));
		
		for (String windowName : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(windowName);
		
		}
		
		fbSignIn.passingKey(By.xpath(".//*[@id='email']"), "e.rahman20@gmail.com");
		fbSignIn.passingKey(By.xpath(".//*[@id='pass']"), "sinister2");
		fbSignIn.clickStuff(By.xpath(".//*[@id='u_0_2']"));
		
		
		
		
	}
	
	
	

}
