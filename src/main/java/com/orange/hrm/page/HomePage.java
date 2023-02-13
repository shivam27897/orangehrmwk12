package com.orange.hrm.page;

import com.orange.hrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By orangehrmLogo = By.xpath("//div[@class='orangehrm-login-logo']");
    By adminLink = By.xpath("//span[text()='Admin']");
    By pimLink = By.xpath("//span[text()='PIM']");
    By leaveLink = By.xpath("//span[text()='Leave']");
    By dashboardLink = By.xpath("//span[text()='Dashboard']");


    public void clickOnAdmin(){
        clickOnElement(adminLink);
    }
    public void clickOnpim(){
        clickOnElement(pimLink);
    }
    public void clickOnLeave(){
        clickOnElement(leaveLink);
    }
    public void clickOnDashboard(){
        clickOnElement(dashboardLink);
    }

    public By verifylogo(){
        return orangehrmLogo;
    }

}