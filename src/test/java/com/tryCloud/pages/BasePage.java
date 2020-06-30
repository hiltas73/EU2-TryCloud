package com.tryCloud.pages;

import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en_lol.WEN;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class  BasePage {

@FindBy(css = ".logo.logo-icon")
public WebElement logo;

@FindBy(css = ".notifications")
public WebElement notifications;

@FindBy(css = ".icon-contacts.menutoggle")
public WebElement contacts;

@FindBy(css = ".avatardiv.avatardiv-shown")
public WebElement user;

@FindBy(xpath = "//li[@data-id='settings']")
public WebElement settings;

@FindBy(xpath = "//li[@data-id='logout']")
public WebElement logout;

@FindBy(xpath = "//li[@data-id='help']")
public WebElement help;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

//    public void logOut(){
//        BrowserUtils.waitFor(2);
//        user.click();
//        BrowserUtils.clickWithJS(logOutLink);
//    }
//    public void goToMyUser(){
//        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForClickablility(userName, 5).click();
//        BrowserUtils.waitForClickablility(myUser, 5).click();
//
//    }

    /**
     * This method will navigate user to the specific module in vytrack application.
     * @param module
     */

    public void navigateToModule(String module) {
        String locator= "(//a[@aria-label='"+module+"'])[1]";
        Driver.get().findElement(By.xpath(locator)).click();
        String expectedTitle = module + " - Trycloud";
        Assert.assertEquals("verify title",expectedTitle,Driver.get().getTitle() );
    }

}
