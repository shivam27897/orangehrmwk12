package com.orange.hrm.page;

import com.orange.hrm.utility.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    By systemUserText = By.xpath("//h5[text()='System Users']");
    By usernameField = By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form/div[1]/div[1]/div/div/div[2]/input");
    By userDropDown = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i");
    By selectingAdmin = By.xpath("//*[@class='oxd-select-dropdown --position-bottom']//*[contains(text(),'Admin')]");
    By employeeField = By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']");
    By statusDropdown = By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form/div[1]/div[1]/div[4]/div/div[2]/div/div/div[2]/i");
    By searchButton = By.xpath("//button[@type='submit']");
    By resetButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']");
    By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    By deleteButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']");
    By admintext = By.xpath("//body/div/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div");
    By addUserText = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']");

    public String verifySystemUserText(){
        return getTextFromElement(systemUserText);
    }
//    public void enterUsername(String username){
//        sendTextToElement(usernameField,username);
//    }
    public void clickOnUserdropdown() throws InterruptedException {
        clickOnElement(userDropDown);
        Thread.sleep(3000);
        clickOnElement(selectingAdmin);
    }

//    public void selectUserRole(String a){
//        selectByContainsTextFromDropDown(selectingAdmin,a);
//    }
    public void selectAdmin(){
        clickOnElement(userDropDown);
    }
    public void selectStatus(){
        clickOnElement(statusDropdown);
    }
    public String verifyAdminText(){
        return getTextFromElement(admintext);
    }
    public String verifyAddUserText(){
        return getTextFromElement(addUserText);
    }
    public void enterEmployeename(String name){
        sendTextToElement(employeeField,name);
    }

    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }
    public void clickOnResetButton(){
        clickOnElement(resetButton);
    }
    public void clickOnAddButton(){
        clickOnElement(addButton);
    }
    public void clickOnDeleteButton(){
        clickOnElement(deleteButton);
    }
}
