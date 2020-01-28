package com.bridgelabz.qa.appium.tests;

	import java.util.List;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;
	import io.appium.java_client.ios.IOSDriver;

	/**
	 * @author Premsai Manthani
	 * @purpose This class perform the date selection 
	 */
	public class DatePickerTest extends BaseClass {

		@Test
		public void datePickerTest() throws InterruptedException {
			IOSDriver<WebElement> driver = setup();
			Thread.sleep(1000);
			driver.findElementByAccessibilityId("Date Picker").click();
			Thread.sleep(500);
			List<WebElement> element = driver.findElementsByXPath("//XCUIElementTypePickerWheel");

			for (int i = 0; i < element.size(); i++)
				System.out.print(element.get(i).getText() + "   ");
			element.get(0).sendKeys("Jan 18");
			Thread.sleep(500);
			element.get(0).sendKeys(Keys.TAB);
			element.get(1).sendKeys("3");
			Thread.sleep(500);
			element.get(1).sendKeys(Keys.TAB);
			element.get(2).sendKeys("30");
			Thread.sleep(500);
			element.get(2).sendKeys(Keys.TAB);
			element.get(3).sendKeys("AM");
			Thread.sleep(3000);
			driver.quit();
		}

	}

