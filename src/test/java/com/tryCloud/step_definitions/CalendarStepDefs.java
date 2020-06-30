package com.tryCloud.step_definitions;

import com.tryCloud.pages.CalendarPage;
import com.tryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class CalendarStepDefs {

    CalendarPage calendarPage = new CalendarPage();

    @When("the user click on the New Calendar")
    public void the_user_click_on_the_new_calendar() {
        BrowserUtils.waitFor(3);
        BrowserUtils.waitForClickablility(calendarPage.newCalendarButton,10);
        calendarPage.newCalendarButton.click();
    }

    @When("the user write {string} as a calendar name")
    public void the_user_write_as_a_calendar_name(String calendarName) {
        BrowserUtils.waitFor(3);
        BrowserUtils.waitForVisibility(calendarPage.calendarNameInputBox,10);
        calendarPage.calendarNameInputBox.sendKeys(calendarName);
    }

    @When("the user click on the submit button")
    public void the_user_click_on_the_submit_button() {
        BrowserUtils.waitFor(3);
        BrowserUtils.waitForClickablility(calendarPage.newCalendarSubmitButton,10);
        calendarPage.newCalendarSubmitButton.click();
    }

    @Then("the user should be able to see {string} at the end of the calendar list")
    public void the_user_should_be_able_to_see_at_the_end_of_the_calendar_list(String expectedCalendarName) {

        BrowserUtils.waitFor(3);

        for (WebElement each : calendarPage.calendarListContainer) {
            System.out.println(each.getText());
        }

        int index = calendarPage.calendarListContainer.size();

        BrowserUtils.scrollToElement(calendarPage.calendarListContainer.get(index-3));

        String actualCalendarName = calendarPage.calendarListContainer.get(index-3).getText();

        System.out.println("actualCalendarName = " + actualCalendarName);
        System.out.println("expectedCalendarName = " + expectedCalendarName);

        Assert.assertEquals("Verify that the new calendar name exist at the end of the list",
                expectedCalendarName,actualCalendarName);


    }





}
