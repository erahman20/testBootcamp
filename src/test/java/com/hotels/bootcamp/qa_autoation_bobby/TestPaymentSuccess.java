package com.hotels.bootcamp.qa_autoation_bobby;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestPaymentSuccess extends WebDriverFactory {
	
	
	
	
	@Test
	public void successPayment() throws InterruptedException {
		NewLandingPage paymentSuccess = new NewLandingPage();
		
		paymentSuccess.clickStuff(By.xpath(".//*[@id='managed-overlay']/button"));

		
		paymentSuccess.enterData(By.xpath(".//*[@id='qf-0q-destination']"), "Los");
		
		List<WebElement>listOfLinks =getDriver().findElements(By.xpath(".//tbody[@class='autosuggest-city']/tr/td/div[2]"));
		for (WebElement element : listOfLinks) {
			if(element.getText().equals("Los Angeles, California, United States of America")) {
				element.click();
				break;
			}
		}
		
		paymentSuccess.clickStuff(By.xpath(".//*[@id='qf-0q-localised-check-in']"));
		paymentSuccess.clickStuff(By.xpath("html/body/div[7]/div[1]/div[2]/table/tbody/tr[4]/td[2]/a"));
		paymentSuccess.clickStuff(By.xpath(".//*[@id='qf-0q-localised-check-out']"));
		paymentSuccess.clickStuff(By.xpath("html/body/div[7]/div[1]/div[2]/table/tbody/tr[5]/td[2]/a"));
		paymentSuccess.clickStuff(By.xpath(".//*[@id='qf-0q-compact-occupancy']"));
		paymentSuccess.selected(By.xpath(".//*[@id='qf-0q-compact-occupancy']/option[2]"));
		paymentSuccess.clickStuff(By.xpath(".//*[@id='main-content']/main/div/div/div[1]/div/div[1]/div[1]/div/div/form/div[5]/button"));
		paymentSuccess.clickStuff(By.xpath(".//*[@id='listings']/ol/li[1]/article/div/div[3]/div[3]/a"));
		
		for (String windowName : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(windowName);
		}
		
		paymentSuccess.clickStuff(By.xpath(".//*[@id='book-now-button']"));
		paymentSuccess.clickStuff(By.xpath(".//*[@id='room-1-rateplan-1']/button"));
		paymentSuccess.clickStuff(By.xpath(".//*[@id='pay-now-etp-form']/button"));
		
		paymentSuccess.passingKey(By.xpath(".//*[@id='room-details-room-0-first-name']"), "Bobby");
		paymentSuccess.passingKey(By.xpath(".//*[@id='room-details-room-0-last-name']"), "Rahman");
		
		paymentSuccess.clickStuff(By.xpath(".//*[@id='payment-details-card-type-selector']"));
		paymentSuccess.selected(By.xpath(".//*[@id='payment-details-card-type-selector']/option[2]"));
		
		
		paymentSuccess.passingKey(By.xpath(".//*[@id='payment-details-card-number']"), "123456789098765");
		paymentSuccess.passingKey(By.xpath(".//*[@id='payment-details-cvv']"), "123");
		paymentSuccess.clickStuff(By.xpath(".//*[@id='payment-details-expiry-month']"));
		paymentSuccess.selected(By.xpath(".//*[@id='payment-details-expiry-month']/option[3]"));
		paymentSuccess.clickStuff(By.xpath(".//*[@id='payment-details-expiry-year']"));
		paymentSuccess.selected(By.xpath(".//*[@id='payment-details-expiry-year']/option[3]"));
		paymentSuccess.passingKey(By.xpath(".//*[@id='billing-details-post-code']"), "11102");
		paymentSuccess.passingKey(By.xpath(".//*[@id='contact-details-email']"), "e.rahman20@gmail.com");
		paymentSuccess.passingKey(By.xpath(".//*[@id='contact-details-phone']"), "6461235678");
		
		
		
		
	}

}
