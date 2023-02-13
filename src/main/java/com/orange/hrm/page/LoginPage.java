package com.orange.hrm.page;

import com.orange.hrm.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']");
    By loginText = By.xpath("//h5[text()='Login']");
    By userProfile = By.xpath("//p[@class='oxd-userdropdown-name']");
    By logoutButton = By.xpath("//a[text()='Logout']");


    public void enterUsername(String email){
        sendTextToElement(usernameField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String verifyLoginText (){
        return getTextFromElement(loginText);
    }
    public void clickOnUserProfile(){
       clickOnElement(userProfile);
    }
    public void clickOnLogout(){
        clickOnElement(logoutButton);
    }
}
