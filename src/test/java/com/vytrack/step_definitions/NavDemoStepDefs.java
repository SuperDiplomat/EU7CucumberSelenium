package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavDemoStepDefs {
    @Given("sales manager is on the main page")
    public void sales_manager_is_on_the_main_page() {
        System.out.println("The Expected and Actual results are matched");
    }

    @When("sales manager clicks on Fleet button")
    public void sales_manager_clicks_on_Fleet_button() {
        System.out.println("The Expected and Actual results are matched");
    }

    @When("Clicks on Vehicles button")
    public void clicks_on_Vehicles_button() {
        System.out.println("The Expected and Actual results are matched");
    }

    @Then("sales manager should see the title as \"Vehicles")
    public void sales_manager_should_see_the_title_as_Vehicles() {
        System.out.println("The Expected and Actual results are matched");
    }

    @When("sales manager clicks on MArketing button")
    public void sales_manager_clicks_on_MArketing_button() {
        System.out.println("The Expected and Actual results are matched");
    }

    @When("sales manager clicks on Campaigns butom")
    public void sales_manager_clicks_on_Campaigns_butom() {
        System.out.println("The Expected and Actual results are matched");
    }

    @Then("The title should apear as Campaigns")
    public void the_title_should_apear_as_Campaigns() {
        System.out.println("The Expected and Actual results are matched");
    }

    @When("sales manager clicks on Activities button")
    public void sales_manager_clicks_on_Activities_button() {
        System.out.println("The Expected and Actual results are matched");
    }

    @When("sales manager clicks on Calendar Events button")
    public void sales_manager_clicks_on_Calendar_Events_button() {
        System.out.println("The Expected and Actual results are matched");
    }

    @Then("title should be Calendars")
    public void title_should_be_Calendars() {
        System.out.println("The Expected and Actual results are matched");
    }

}
