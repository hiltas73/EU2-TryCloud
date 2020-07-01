package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage extends BasePage {
    public DeckPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//tr[@class='board-create ng-scope']")
    public WebElement creatingBoard;


}
