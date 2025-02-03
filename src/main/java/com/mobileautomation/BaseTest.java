package com.mobileautomation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;

public class BaseTest {

    // Declare the AppiumDriver
    protected AppiumDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws Exception {
        // Set the DesiredCapabilities for LambdaTest
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");  
        capabilities.setCapability("deviceName", "Samsung Galaxy S20"); 
        capabilities.setCapability("app", "lt:2324620");  

        // LambdaTest credentials from environment variables
        String username = System.getenv("LT_USERNAME");
        String accessKey = System.getenv("LT_ACCESS_KEY");

        // Create Appium driver instance for LambdaTest cloud
        driver = new AppiumDriver<>(new URL("https://" + username + ":" + accessKey + "@mobile-hub.lambdatest.com/wd/hub"), capabilities);
    }

    @AfterClass
    public void tearDown() {
        // Quit the driver after the tests are finished
        if (driver != null) {
            driver.quit();
        }
    }
}
