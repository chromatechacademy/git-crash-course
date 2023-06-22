package com.chroma.appsCommon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.utils.EncryptionUtils;
import com.chroma.utils.LocalConfUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class AppLoginMethods extends CommonUtils {
   static AppLoginMethods appLoginMethods = new AppLoginMethods();

    // username text box
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameTextBox;

    // password text box
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    public static void ctsmsEnterUsername() {
        String decryptedUsername = EncryptionUtils.decrypt(LocalConfUtils.getProperty("username"));
        appLoginMethods.usernameTextBox.sendKeys(decryptedUsername);
    }

    public static void ctsmsEnterPassword() {
        String encryptedPassword = EncryptionUtils.decrypt(LocalConfUtils.getProperty("password"));
        appLoginMethods.passwordTextBox.sendKeys(encryptedPassword);
    }

    public AppLoginMethods() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
