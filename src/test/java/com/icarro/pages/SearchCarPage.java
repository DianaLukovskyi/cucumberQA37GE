package com.icarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchCarPage extends BasePage {
    public SearchCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='city']")
    WebElement selectCityName;
    @FindBy(xpath = "//input[@id='dates']")
    WebElement dateInput;

    @FindBy(xpath = ("//button[contains(text(), 'Search')]"))
     WebElement searchButton;


    public SearchCarPage selectCityName(String telAviv) {
        selectCityName.click();
        selectCityName.sendKeys(telAviv);
        return this;

    }

    public SearchCarPage dateInput(String dates) {
        dateInput.click();
        dateInput.sendKeys(dates);
        return this;
    }

    public SearchCarPage searchButton() {
            searchButton.click();
        return this;
    }

}



