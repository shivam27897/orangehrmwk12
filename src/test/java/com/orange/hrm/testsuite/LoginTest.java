package com.orange.hrm.testsuite;

import com.orange.hrm.page.DashboardPage;
import com.orange.hrm.page.HomePage;
import com.orange.hrm.page.LoginPage;
import com.orange.hrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String actualMessage1 = dashboardPage.verifyDashboardText();
        String expectedMessage1 = "Dashboard";
        Assert.assertEquals(actualMessage1, expectedMessage1, "Dashboard welcome is verified");
    }

    @Test
    public void verifyTheLogoDisplayOnHomePage() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
//        String actualMessage2 = String.valueOf(homePage.verifylogo());
//        String expectedMessage2 = "Dashboard";
//        Assert.assertEquals(actualMessage2, expectedMessage2, "Logo Verified");

    }

    @Test
    public void verifyUserShouldLogoutSuccessFully() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        loginPage.clickOnUserProfile();
        loginPage.clickOnLogout();
        String actualMessage3 = loginPage.verifyLoginText();
        String expectedMessage3 = "Login";
        Assert.assertEquals(actualMessage3, expectedMessage3, "Login page verified");

    }
}
