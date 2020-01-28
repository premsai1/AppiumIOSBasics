package com.bridgelabz.qa.appium.tests;


import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;


public class IOSCreateWebSessionTest extends BaseClass {
    private IOSDriver<WebElement> driver;

    

    @Test()
    public void testCreateSafariSession() {
        // Navigate to google.com
        driver.get("https://www.google.com");

        // Test that it was successful by checking the Page title
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Google");

    }
}