package com.orange.hrm.page;

import com.orange.hrm.utility.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By dashboardText = By.className("oxd-topbar-header-breadcrumb");

    public String verifyDashboardText(){
        return getTextFromElement(dashboardText);
    }
}
