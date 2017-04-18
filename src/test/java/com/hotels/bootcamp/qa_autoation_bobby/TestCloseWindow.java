package com.hotels.bootcamp.qa_autoation_bobby;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCloseWindow extends WebDriverFactory {
	
	
	
	
	@Test
	public void closeWindowTest() throws InterruptedException {
		NewLandingPage closingWindow = new NewLandingPage();
		
		closingWindow.clickStuff(By.xpath(".//*[@id='resp-footer']/div[3]/div[1]/div[1]/ul[1]/li[3]/h2"));
		closingWindow.clickStuff(By.xpath(".//*[@id='ftr-feedback']"));
		

		for (String windowName : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(windowName);
		}
		
		closingWindow.clickStuff(By.xpath(".//*[@id='overall-1']"));
		closingWindow.clickStuff(By.xpath("html/body/form/footer/div/div/div[1]/input"));
		Thread.sleep(6000);
		closingWindow.clickStuff(By.xpath("html/body/form/footer/div/div/div[1]/input"));
		
		
	}

}
