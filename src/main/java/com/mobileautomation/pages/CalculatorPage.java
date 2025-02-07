
package com.mobileautomation.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class CalculatorPage {
    private AppiumDriver<MobileElement> driver;
    
    public CalculatorPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }
    
    public void clickNumber(String number) {
        driver.findElement(By.name(number)).click();
    }
    
    public void clickPlus() {
        driver.findElement(By.name("+")).click();
    }
    
    public void clickEquals() {
        driver.findElement(By.name("=")).click();
    }
    
    public String getResult() {
        return driver.findElement(By.className("XCUIElementTypeStaticText")).getText();
    }
}