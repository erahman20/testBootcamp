package com.hotels.bootcamp.qa_autoation_bobby;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestYourBooking extends WebDriverFactory {
	
	
	@Test
	public void yourBooking() throws InterruptedException {
		
		NewLandingPage yourBooking = new NewLandingPage();

		yourBooking.clickStuff(By.xpath(".//*[@id='hdr-account']"));
		yourBooking.clickStuff(By.xpath(".//*[@id='hdr-account-bookings']"));
		yourBooking.clickStuff(By.xpath(".//*[@id='main-content']/div/div/div/div/div/div/div[3]/a[2]"));
		
		for (String windowName : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(windowName);
		
		}
		
		yourBooking.passingKey(By.xpath(".//*[@id='email']"), "e.rahman20@gmail.com");
		yourBooking.passingKey(By.xpath(".//*[@id='pass']"), "sinister2");
		yourBooking.clickStuff(By.xpath(".//*[@id='u_0_2']"));
		yourBooking.verifyingText(By.xpath(".//*[@id='no-results']"), "You have no bookings");
	}
	

}
