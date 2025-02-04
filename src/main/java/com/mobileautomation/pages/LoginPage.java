package com.mobileautomation.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginPage {
    private AppiumDriver<MobileElement> driver;

    // Locators
    private By usernameField = By.id("com.example:id/username");
    private By passwordField = By.id("com.example:id/password");
    private By loginButton = By.id("com.example:id/loginBtn");

    // Constructor
    public LoginPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void tapLoginButton() {
        driver.findElement(loginButton).click();
    }
}
