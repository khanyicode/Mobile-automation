package com.mobileautomation.tests;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected static IOSDriver driver;  // No generic parameter!

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("deviceName", "iPhone Simulator");
        caps.setCapability("platformVersion", "15.0");  // Use your iOS version
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("bundleId", "com.apple.calculator");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);  // No <>
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


