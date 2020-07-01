package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeckPage extends BasePage{

    @FindBy(css = ".icon.icon-add")
    public WebElement addNewBoard;

    @FindBy(xpath = "//input[@placeholder='New board title']")
    public WebElement newBoardTitleInputBox;

    @FindBy(xpath = "//span[@title='Create board']")
    public WebElement createBoardCheckIcon;







}
