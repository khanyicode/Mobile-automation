package com.mobileautomation.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class HomePage {
    private AppiumDriver<MobileElement> driver;

    // Locator
    private By homeTitle = By.id("com.example:id/homeTitle");

    public HomePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public String getHomeTitle() {
        return driver.findElement(homeTitle).getText();
    }
}
