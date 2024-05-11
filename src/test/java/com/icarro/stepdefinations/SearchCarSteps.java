package com.icarro.stepdefinations;

import com.icarro.pages.SearchCarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.icarro.pages.BasePage.driver;

public class SearchCarSteps {



    @And("User select \"Tel Aviv, Israel\" from the city dropdown")
    public void user_select_city_name() {
        new SearchCarPage(driver).selectCityName("Tel Aviv, Israel");
    }

    @And("User select  from the date picker")
    public void user_select_date() {
        new SearchCarPage(driver).dateInput("5/11/2024 - 5/11/2025");
    }

    @Then("User select on the \"Search\" button")
    public void select_search_button() {
        new SearchCarPage(driver).searchButton();
    }
}
