package com.hotels.bootcamp.qa_autoation_bobby;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GiftCardLanding extends BasePage {
	
	
	private By currentLocation;
	private By citySearch;
	private By checkInDate;
	private By selectCheckIn;
	private By checkOutDate;
	private By selectCheckOut;
	private By rooms;
	private By roomSelect;
	private By searchButton;
	private By chooseRoom;
	private By bookRoom;
	private By letsBook;
	private By payNow;
	private By selectGift;
	
	
	
	public GiftCardLanding() {
	currentLocation = By.xpath(".//*[@id='main-content']/main/div/div/div[1]/div/div[1]/div[1]/div/div/form/fieldset[1]/button");	
	citySearch = By.xpath(".//*[@id='qf-0q-destination']");
	checkInDate = By.xpath(".//*[@id='qf-0q-localised-check-in']");
	selectCheckIn = By.xpath("html/body/div[7]/div[1]/div[2]/table/tbody/tr[6]/td[1]/a");
	checkOutDate = By.xpath(".//*[@id='qf-0q-localised-check-out']");
	selectCheckOut = By.xpath("html/body/div[7]/div[2]/div[2]/table/tbody/tr[5]/td[1]/a");
	rooms = By.xpath(".//*[@id='qf-0q-compact-occupancy']");
	roomSelect = By.xpath(".//*[@id='qf-0q-compact-occupancy']/option[1]");
	searchButton = By.xpath(".//*[@id='main-content']/main/div/div/div[1]/div/div[1]/div[1]/div/div/form/div[5]/button");
	chooseRoom = By.xpath(".//*[@id='listings']/ol/li[1]/article/div/div[3]/div[3]/a");
	bookRoom = By.xpath(".//*[@id='book-now-button']");
	letsBook = By.xpath(".//*[@id='room-1-rateplan-1']/button");
	payNow = By.xpath(".//*[@id='pay-now-etp-form']/button");
	selectGift = By.xpath(".//*[@id='payment-option-selector-GIFTCARD']");
	
	}
	public void location() {
		clickOn(currentLocation);
	}
	public void enterCity(String keysTosend) {
		enterData(citySearch, keysTosend);
	}
	public void selectCity() {
		List<WebElement>listOfLinks =getDriver().findElements(By.xpath(".//tbody[@class='autosuggest-city']/tr/td/div[2]"));
		for (WebElement element : listOfLinks) {
			if(element.getText().matches("New York, New York, United States of America")) {
				System.out.println("Found New York");
				element.click();
				break;
			}
		}
	}
	
	
	public void checkIN() {
		clickOn(checkInDate);
	}
	public void checkINSelect() {
		clickOn(selectCheckIn);
	}		
	public void checkOut() {
		clickOn(checkOutDate);
	}
	public void checkOutSlect() {
		clickOn(selectCheckOut);
	}
	public void clickRoom() {
		clickOn(rooms);
	}
	public void selectRoom() {
		clickOn(roomSelect);
	}
	public void clickSearch() {
		clickOn(searchButton);
	}
	public void pickRoom() {
		clickOn(chooseRoom);
	}
	public void bookingRoom() {
		clickOn(bookRoom);
	}
	public void lastBooking() {
		clickOn(letsBook);
	}
	public void payingNow() {
		clickOn(payNow);
	}
	public void giftCardoption() {
		clickOn(selectGift);
	}
	
	}

