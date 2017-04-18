package com.hotels.bootcamp.qa_autoation_bobby;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestDEMO extends WebDriverFactory {
	@Test
	public void testSupport() {
		LandingPage supportLanding = new LandingPage();
		supportLanding.clickOnSupport();

		supportLanding.clickOnButton();

		for (String windowName : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(windowName);

		}
		getDriver().findElement(By.xpath("html/body/form/footer/div/div/div[2]/div/div[2]/div/ul/li[1]/a")).click();
		supportLanding.clickOnchoose();
		
		supportLanding.enterDatachoose("c");
	}

}
