package com.icarro.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertTrue;

public class SearchAddCarPage extends BasePage {


    public SearchAddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = ("date"))
    WebElement dateInput;
    @FindBy(xpath = ("//button[contains(text(), 'Search')]"))
    WebElement searchButton;
    @FindBy(className = ("car-list"))
    WebElement carList;
    @FindBy(xpath = ("//div[@class='car-list']/div[1]"))
    WebElement firstCar;
    @FindBy(xpath = ("//button[contains(text(), 'Let the car work')]"))
    WebElement letTheCarWorkButton;
    @FindBy(id = ("model"))
    WebElement modelInput;
    @FindBy(id = ("year"))
    WebElement yearInput;
    @FindBy(id = ("price"))
    WebElement priceInput;
    @FindBy(xpath = ("//button[contains(text(), 'Add Car')]"))
    WebElement addCarButton;
    @FindBy(xpath = ("//div[contains(text(), 'Car added successfully!')]"))
    WebElement successMessage;

    public void dateInput(CharSequence date) {
        dateInput.clear();
        dateInput.sendKeys(date);

    }

    public void searchButton() {
        searchButton.click();
    }

    public void carList() {
        assertTrue(carList.isDisplayed());
    }

    public void firstCar() {
        firstCar.click();
    }

    public void letTheCarWorkButton() {
        letTheCarWorkButton.click();
    }

    public Object modelInput() {
        modelInput.sendKeys("Toyota Camry");
        return this;
    }


    public void yearInput() {
        yearInput.sendKeys("2018");

    }

    public void priceInput() {
        priceInput.sendKeys("25000");
    }

    public void addCarButton() {
        addCarButton.click();
    }

    public void successMessage() {
        assertTrue(successMessage.isDisplayed());
    }



    }


