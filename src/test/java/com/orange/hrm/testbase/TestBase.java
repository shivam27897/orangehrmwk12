package com.orange.hrm.testbase;

import com.orange.hrm.propertyreader.PropertyReader;
import com.orange.hrm.utility.Utility;
import com.orange.hrm.propertyreader.PropertyReader;
import com.orange.hrm.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Bhavesh
 */
public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
       // closeBrowser();
    }

}
