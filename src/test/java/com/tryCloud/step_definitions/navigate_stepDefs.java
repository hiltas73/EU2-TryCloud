package com.tryCloud.step_definitions;

import com.tryCloud.pages.FilePage;
import io.cucumber.java.en.Then;

public class navigate_stepDefs {
    @Then("the user navigates to {string} page")
    public void the_user_navigates_to_page(String page) {
        new FilePage().navigateToModule(page);
    }
}
