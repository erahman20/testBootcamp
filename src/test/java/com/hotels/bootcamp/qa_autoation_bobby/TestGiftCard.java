package com.hotels.bootcamp.qa_autoation_bobby;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TestGiftCard extends WebDriverFactory {
	
	
	@Test 
	public void GiftCard() {
		
	GiftCardLanding giftCard = new GiftCardLanding() ;
		giftCard.enterCity("New ");
//		giftCard.selectCity();
		List<WebElement>listOfLinks =getDriver().findElements(By.xpath(".//tbody[@class='autosuggest-city']/tr/td/div[2]"));
		for (WebElement element : listOfLinks) {
			if(element.getText().equals("New York, New York, United States of America")) {
				element.click();
				break;
			}
		}
	
		giftCard.checkIN();
		giftCard.checkINSelect();
		giftCard.checkOut();
		giftCard.checkOutSlect();
//		giftCard.clickRoom();
//		giftCard.selectRoom();
		giftCard.clickSearch();
		giftCard.pickRoom();
		
		for (String windowName : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(windowName);

		}
		
		giftCard.bookingRoom();
		giftCard.lastBooking();
		for (String windowName : getDriver().getWindowHandles()) {
			getDriver().switchTo().window(windowName);

		}	
		
		giftCard.payingNow();
		giftCard.giftCardoption();
		
	}
		
		
}
	



