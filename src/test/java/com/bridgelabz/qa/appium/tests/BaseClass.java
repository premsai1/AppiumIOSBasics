package com.bridgelabz.qa.appium.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public static IOSDriver<WebElement> driver;

	public static IOSDriver<WebElement> setup() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro Max");
		capabilities.setCapability(MobileCapabilityType.APP,
				"/Users/prem/Library/Developer/Xcode/DerivedData/UICatalog-acsqebcsthqaihdcwsfpcbqgblrm/Build/Products/Debug-iphonesimulator/UICatalog.app");
		try {
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new IOSDriver<WebElement>(url, capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver;
	}
}
