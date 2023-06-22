package com.chroma.stepsImplementation;

import com.chroma.appsCommon.AppLoginMethods;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.utils.LocalConfUtils;

public class LoginStepsImpl extends PageInitializer {

    public static void login() {

        /*
         * ---- OLD CODE
         * loginPage.usernameTextBox.sendKeys(LocalConfUtils.getProperty("username"));
         * loginPage.passwordTextBox.sendKeys( LocalConfUtils.getProperty("password"));
         */
        /* ---- NEW CODE ---- */

        AppLoginMethods.ctsmsEnterUsername();
        AppLoginMethods.ctsmsEnterPassword();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        loginPage.signInBtn.click();
    }
}
