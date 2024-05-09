package com.icarro.stepdefinations;
import com.icarro.pages.SearchAddCarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;

public class SearchAddCarSteps {
    public WebDriver driver;

    @Given("User is on the home page of ilcarro")
    public void userIsOnHomePage() {
        new SearchAddCarPage(driver).ChromeDriver();
    }

    @When("User enters the date {string} in the search field")
    public void userEntersDate(String date) {
        new SearchAddCarPage(driver).dateInput(date);
    }

    @When("User clicks the search button")
    public void userClicksSearchButton() {
        new SearchAddCarPage(driver).searchButton();
    }

    @Then("User should see a list of available cars for the specified date")
    public void userShouldSeeListOfCars() {
        new SearchAddCarPage(driver).carList();
    }

    @When("User clicks on the first available car")
    public void userClicksOnFirstCar() {
        new SearchAddCarPage(driver).firstCar();
    }

    @And("User clicks on the \"Let the car work\" page")
    public void userClicksOnLetTheCarWorkPage() {
        new SearchAddCarPage(driver).letTheCarWorkButton();
    }

    @And("User fills out the car details")
    public void userFillsOutCarDetails() {
        new SearchAddCarPage(driver).modelInput();
        new SearchAddCarPage(driver).yearInput();
        new SearchAddCarPage(driver).priceInput();
    }

    @And("User clicks the \"Add Car\" button")
    public void userClicksAddCarButton() {
        new SearchAddCarPage(driver).addCarButton();
    }

    @Then("User should see a success message confirming the car has been added")
    public void userShouldSeeSuccessMessage() {
        new SearchAddCarPage(driver).successMessage();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}