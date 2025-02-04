package com.mobileautomation.tests;

import com.mobileautomation.BaseTest;
import com.mobileautomation.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password123");
        loginPage.tapLoginButton();
    }
}
