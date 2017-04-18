package com.hotels.bootcamp.qa_autoation_bobby;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCardNumberandPin extends WebDriverFactory {

	
	
	@Test
	public void cardInfo() throws InterruptedException {
		
		NewLandingPage cardInfo = new NewLandingPage();
		cardInfo.enterData(By.xpath(".//*[@id='qf-0q-destination']"), "New");
		
		List<WebElement>listOfLinks =getDriver().findElements(By.xpath(".//tbody[@class='autosuggest-city']/tr/td/div[2]"));
		for (WebElement element : listOfLinks) {
			if(element.getText().equals("New York, New York, United States of America")) {
				element.click();
				break;
			}
		}
	
		cardInfo.clickOn(By.xpath(".//*[@id='qf-0q-localised-check-in']"));
		cardInfo.clickStuff(By.xpath("html/body/div[7]/div[1]/div[2]/table/tbody/tr[3]/td[6]/a"));
		cardInfo.clickStuff(By.xpath(".//*[@id='qf-0q-localised-check-out']"));
		cardInfo.clickStuff(By.xpath("html/body/div[7]/div[1]/div[2]/table/tbody/tr[4]/td[6]/a"));
		cardInfo.clickStuff(By.xpath(".//*[@id='main-content']/main/div/div/div[1]/div/div[1]/div[1]/div/div/form/div[5]/button"));
		Thread.sleep(5000);
		cardInfo.clickStuff(By.xpath(".//*[@id='listings']/ol/li[1]/article/div/div[3]/div[3]/a/span"));
		
		for (String windowName : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(windowName);
		}
		
		cardInfo.clickStuff(By.xpath(".//*[@id='book-now-button']"));
		Thread.sleep(6000);
		cardInfo.clickStuff(By.xpath(".//*[@id='room-1-rateplan-1']/button"));
		Thread.sleep(5000);
		cardInfo.clickStuff(By.xpath(".//*[@id='pay-now-etp-form']/button"));
		cardInfo.clickOn(By.xpath(".//*[@id='payment-option-selector-GIFTCARD']"));
		cardInfo.passingKey(By.xpath(".//*[@id='gift-card-number']"), "1234567898765432");
		cardInfo.passingKey(By.xpath(".//*[@id='gift-card-pin-code']"), "12345678");
		cardInfo.clickStuff(By.xpath(".//*[@id='payment-option-GIFTCARD']/div[3]/div/div/div[3]/button"));
		cardInfo.texts(By.xpath(".//*[@id='payment-option-GIFTCARD']/div[1]/div"), "An error has occurred. Please check your gift card details and if you’re still having problems, call us at 800-246-8357");
		
		
	}
}
