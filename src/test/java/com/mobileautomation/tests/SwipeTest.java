package com.mobileautomation.tests;

import com.mobileautomation.BaseTest;
import com.mobileautomation.utils.GestureUtils;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {

    @Test
    public void testSwipeUp() {
        GestureUtils.swipeUp(driver);
    }
}
