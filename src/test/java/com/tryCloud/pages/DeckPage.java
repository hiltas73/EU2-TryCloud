package com.tryCloud.pages;


import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage extends BasePage {
    public DeckPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = ".icon.icon-add")
    public WebElement addNewBoard;

    @FindBy(xpath = "//input[@placeholder='New board title']")
    public WebElement newBoardTitleInputBox;

    @FindBy(xpath = "//span[@title='Create board']")
    public WebElement createBoardCheckIcon;



}
