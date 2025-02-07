package com.mobileautomation.pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorPage {
    private IOSDriver driver;  

    public CalculatorPage(IOSDriver driver) {
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
