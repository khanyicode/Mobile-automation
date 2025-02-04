package com.mobileautomation.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import java.time.Duration;

public class GestureUtils {

    public static void swipeUp(AppiumDriver<MobileElement> driver) {
        Dimension size = driver.manage().window().getSize();
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);
        int centerX = size.width / 2;

        new TouchAction<>(driver)
                .press(PointOption.point(centerX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(centerX, endY))
                .release()
                .perform();
    }
}
