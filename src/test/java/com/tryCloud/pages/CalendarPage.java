package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarPage extends BasePage {

    @FindBy(xpath = "(//li[@class='new-entity-container'])[1]")
    public WebElement newCalendarButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement calendarNameInputBox;

    @FindBy(id = "submitnewCalendar")
    public WebElement newCalendarSubmitButton;

    @FindBy(xpath = "//ul[@id='calendarlistcontainer']/li")
    public List<WebElement> calendarListContainer;




}
