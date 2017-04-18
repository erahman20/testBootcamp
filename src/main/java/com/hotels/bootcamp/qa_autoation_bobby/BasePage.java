package com.hotels.bootcamp.qa_autoation_bobby;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.base.Function;

public class BasePage extends WebDriverFactory {

	public static WebElement webDriverFluentWait(final By locator) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(WebDriverFactory.getDriver()).withTimeout(15, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class).ignoring(ElementNotFoundException.class).withMessage(
						"Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});

		return element;
	}
	
	public void enterData(By locator, String keysToSend) {
		webDriverFluentWait(locator).sendKeys(keysToSend);
	}

	public void clickOn(By locator) {
		webDriverFluentWait(locator).click();
	}
	
	public void selected(By locator) {
		webDriverFluentWait(locator).isSelected();
	}
	
	public void verifyingText(By locator, String actual ) {
		String expected = webDriverFluentWait(locator).getText();
		Assert.assertEquals(expected, actual);
		
	}
	
}
