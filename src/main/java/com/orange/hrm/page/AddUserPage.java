package com.orange.hrm.page;

import com.orange.hrm.utility.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {

    //div[@id='app']/div/div[2]/div[2]/div/div/form/div[1]/div[1]

    By userRoleDropDown = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div[1]/div[1]/div[1]/div[1]/div[2]/div/div/div[2]/i");
    By employeeNameField = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/input");
    By statusDropDown = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[2]/i");
    By userNameField = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div[1]/div[1]/div[4]/div[1]/div[2]/input");
    By passwordField = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div[2]/div[1]/div[1]/div[1]/div[2]/input");
    By confirmPassField = By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div[2]/div[1]/div[2]/div/div[2]/input");
    By saveButton = By.xpath("//button[@type='submit']");
    By cancelButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']");


//    public void selectRole(int value){
//        selectByValueFromDropDown(userRoleDropDown,value);
//    }
    public void enterEmployeename(String name){
        sendTextToElement(employeeNameField,name);
    }
//    public void selectStatus(int value1){
//        selectByValueFromDropDown(statusDropDown,value1);
//    }
    public void enterUsername(String name){
        sendTextToElement(userNameField,name);
    }
    public void enterPassword(String name){
        sendTextToElement(passwordField,name);
    }
    public void enterConfirmnPassword(String name){
        sendTextToElement(confirmPassField,name);
    }
    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }
    public void clickOnCancelButton(){
        clickOnElement(cancelButton);
    }
}
