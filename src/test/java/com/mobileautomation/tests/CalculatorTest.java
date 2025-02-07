package com.mobileautomation.tests;

import com.mobileautomation.pages.CalculatorPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest {

    @Test
    public void testAddition() {
        CalculatorPage calculator = new CalculatorPage(driver);

        calculator.clickNumber("2");
        calculator.clickPlus();
        calculator.clickNumber("3");
        calculator.clickEquals();

        String result = calculator.getResult();
        Assert.assertEquals(result, "5");
    }
}
