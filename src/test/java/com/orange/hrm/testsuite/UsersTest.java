package com.orange.hrm.testsuite;

import com.orange.hrm.page.AdminPage;
import com.orange.hrm.page.HomePage;
import com.orange.hrm.page.LoginPage;
import com.orange.hrm.page.ViewSystemUsersPage;
import com.orange.hrm.testbase.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class UsersTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AdminPage adminPage = new AdminPage();
    ViewSystemUsersPage system = new ViewSystemUsersPage();
    @Test
    public void adminShouldAddUserSuccessFully(){
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        system.clickOnAddButton();
        String actualMessage1 = system.verifyAddUserText();
        String expedctedMessage1 = "Add User";
        Assert.assertEquals(actualMessage1,expedctedMessage1,"Admin text verified");

    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();

        String actualMessage = system.verifySystemUserText();
        String expedctedMessage = "System Users";
        Assert.assertEquals(actualMessage,expedctedMessage,"Admin tab verified");

        system.clickOnUserdropdown();
        system.selectAdmin();
       // system.selectStatus();
        system.clickOnSearchButton();
        //*[@class='oxd-grid-item oxd-grid-item--gutters'][2]//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']
        String actualMessage1 = system.verifyAdminText();
        String expedctedMessage1 = "Admin";
        Assert.assertEquals(actualMessage1,expedctedMessage1,"Admin text verified");
    }
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();

        String actualMessage = system.verifySystemUserText();
        String expedctedMessage = "System Users";
        Assert.assertEquals(actualMessage,expedctedMessage,"Admin tab verified");

        system.selectAdmin();
        // system.selectStatus();
        system.clickOnSearchButton();
    }

}
