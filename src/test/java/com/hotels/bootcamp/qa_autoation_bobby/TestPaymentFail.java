package com.hotels.bootcamp.qa_autoation_bobby;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestPaymentFail extends WebDriverFactory {
	
	
	
	@Test
	public void paymentFail() throws InterruptedException {
		NewLandingPage failPayment = new NewLandingPage();
		
		failPayment.clickStuff(By.xpath(".//*[@id='managed-overlay']/button"));
		Thread.sleep(2000);
		
		failPayment.enterData(By.xpath(".//*[@id='qf-0q-destination']"), "New");
		
		List<WebElement>listOfLinks =getDriver().findElements(By.xpath(".//tbody[@class='autosuggest-city']/tr/td/div[2]"));
		for (WebElement element : listOfLinks) {
			if(element.getText().equals("New York, New York, United States of America")) {
				element.click();
				break;
			}
		}
		
		failPayment.clickOn(By.xpath(".//*[@id='qf-0q-localised-check-in']"));
		failPayment.clickStuff(By.xpath("html/body/div[7]/div[1]/div[2]/table/tbody/tr[3]/td[6]/a"));
		failPayment.clickStuff(By.xpath(".//*[@id='qf-0q-localised-check-out']"));
		failPayment.clickStuff(By.xpath("html/body/div[7]/div[1]/div[2]/table/tbody/tr[4]/td[6]/a"));
		failPayment.clickStuff(By.xpath(".//*[@id='qf-0q-compact-occupancy']"));
		failPayment.selected(By.xpath(".//*[@id='qf-0q-compact-occupancy']/option[2]"));
		failPayment.clickStuff(By.xpath(".//*[@id='main-content']/main/div/div/div[1]/div/div[1]/div[1]/div/div/form/div[5]/button"));
		failPayment.clickStuff(By.xpath(".//*[@id='listings']/ol/li[1]/article/div/div[3]/div[5]/a"));		
		
		for (String windowName : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(windowName);
		}
		
		
		failPayment.clickStuff(By.xpath(".//*[@id='book-now-button']"));
		Thread.sleep(6000);
		failPayment.clickStuff(By.xpath(".//*[@id='room-1-rateplan-1']/button"));
		Thread.sleep(5000);
//		failPayment.clickStuff(By.xpath(".//*[@id='pay-now-etp-form']/button"));
				
		failPayment.passingKey(By.xpath(".//*[@id='payment-details-card-number']"), "1234567890");
		failPayment.passingKey(By.xpath(".//*[@id='payment-details-cvv']"), "111");
		failPayment.clickStuff(By.xpath(".//*[@id='payment-details-card-type-selector']"));
		failPayment.selected(By.xpath(".//*[@id='payment-details-card-type-selector']/option[2]"));
		failPayment.clickStuff(By.xpath(".//*[@id='payment-details-expiry-month']"));
		failPayment.selected(By.xpath(".//*[@id='payment-details-expiry-month']/option[2]"));
		failPayment.clickStuff(By.xpath(".//*[@id='payment-details-expiry-year']"));
		failPayment.selected(By.xpath(".//*[@id='payment-details-expiry-year']/option[3]"));
		
		failPayment.passingKey(By.xpath(".//*[@id='billing-details-post-code']"), "11102");
		failPayment.clickStuff(By.xpath(".//*[@id='book-button']"));
		
	}
	

}
