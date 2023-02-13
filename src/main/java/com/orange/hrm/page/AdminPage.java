package com.orange.hrm.page;

import com.orange.hrm.utility.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    By userManagement = By.xpath("//span[text()='User Management ']");
    By job = By.xpath("//span[text()='Job ']");
    By organization = By.xpath("//span[text()='Organization ']");


    public void clickOnUserManagement(){
        clickOnElement(userManagement);
    }
    public void clickOnjob(){
        clickOnElement(job);
    }
    public void clickOnOrganization(){
        clickOnElement(organization);
    }
}
