package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class SEERHomePage {

    // @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[3]/div[1]/sp-page-row[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]")
    // public static WebElement paragraphText;

    public static String paragraphTextTwo = "//body[1]/div[1]/section[1]/main[1]/div[3]/div[1]/sp-page-row[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]";

    public static WebElement inspectLocator(String xpath){
       
        return WebDriverUtils.driver.findElement(By.xpath(xpath));
    }

    public static void main(String[] args) {
        System.out.println("Hi");
    }

    public SEERHomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
