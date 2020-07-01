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

    @FindBy(xpath = "//button[@ng-value='agendaWeek']")
    public WebElement agendaWeekClick;

    @FindBy(xpath = "//tr[23]//td[2]")
    public WebElement dateAndTime;

    @FindBy(xpath = "//textarea[@placeholder='Title of the Event']")
     public WebElement titleOfEvent;

    @FindBy(xpath = "//select[@ng-model='calendar']")
    public WebElement personalName;

    @FindBy(xpath = "(//input[@ng-model='date'])[1]")
    public WebElement dateStartsPicker;

    @FindBy(xpath = "(//input[@ng-model='time'])[1]")
    public WebElement TimeStartsPicker;

    @FindBy(xpath = "(//input[@ng-model='date'])[2]")
    public WebElement dateEndsPicker;

    @FindBy(xpath = "(//input[@ng-model='time'])[2]")
    public WebElement TimeEndsPicker;

    @FindBy(xpath = "//button[@class='events--button button btn primary ng-scope']")
    public WebElement createButton;
}
