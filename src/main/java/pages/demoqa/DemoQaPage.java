package pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.io.File;

public class DemoQaPage extends BasePage {

    public DemoQaPage(WebDriver driver) {
        super(driver);
    }

    private final By firstName = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By email = By.cssSelector("#userEmail");
    private final By gender = By.xpath("//div[@id=\"genterWrapper\"]/div[2]/div[1]/label");
    private final By mobile = By.id("userNumber");
    private final By dateOfBirth = By.xpath("//div[@class=\"react-datepicker__input-container\"]");
    private final By monthMay = By.xpath("//div[@id=\"dateOfBirth\"]//select/option[text()=\"May\"]");
    private final By year1992 = By.xpath("//div[@id=\"dateOfBirth\"]//select/option[@value=\"1992\"]");
    private final By day3 = By.xpath("//div[@class=" +
            "\"react-datepicker__day react-datepicker__day--003 react-datepicker__day--weekend\"]");
    private final By subjectsInputHindi = By.id("subjectsInput");
    private final By subjectsClickHindi = By.id("react-select-2-option-0");
    private final By uploadPicture = By.xpath("//*[@id=\"uploadPicture\"]");
    private final By currentAddress = By.id("currentAddress");
    private final By selectState = By.xpath("//div[@id=\"state\"]/div/div[1]");
    private final By selectStateNCR = By.id("react-select-3-option-0");
    private final By selectCity = By.xpath("//div[@id=\"city\"]/div/div[1]");
    private final By selectCityDelhi = By.id("react-select-4-option-0");
    private final By submit = By.id("submit");

    public DemoQaPage inputFirstName(String input) {
        driver.findElement(firstName).sendKeys(input);
        return this;
    }

    public DemoQaPage inputLastName(String input) {
        driver.findElement(lastName).sendKeys(input);
        return this;
    }

    public DemoQaPage inputEmail(String input) {
        driver.findElement(email).sendKeys(input);
        return this;
    }

    public DemoQaPage selectGenderMale() {
        driver.findElement(gender).click();
        return this;
    }

    public DemoQaPage inputMobile(String input) {
        driver.findElement(mobile).sendKeys(input);
        return this;
    }

    public DemoQaPage selectDateOfBirth() {
        driver.findElement(dateOfBirth).click();
        driver.findElement(year1992).click();
        driver.findElement(monthMay).click();
        driver.findElement(day3).click();
        return this;
    }

    public DemoQaPage inputSubjectsHindi() {
        driver.findElement(subjectsInputHindi).sendKeys("Hindi");
        driver.findElement(subjectsClickHindi).click();
        return this;
    }

    public DemoQaPage uploadImage() {
        String imagePath = "./src/main/resources/image.jpg";
        driver.findElement(uploadPicture).sendKeys(new File(imagePath).getAbsolutePath());
        return this;
    }

    public DemoQaPage inputCurrentAddress(String input) {
        driver.findElement(currentAddress).sendKeys(input);
        return this;
    }

    public DemoQaPage selectStateNCR() {
        driver.findElement(selectState).click();
        driver.findElement(selectStateNCR).click();
        return this;
    }

    public DemoQaPage selectCityDelhi() {
        driver.findElement(selectCity).click();
        driver.findElement(selectCityDelhi).click();
        return this;
    }

    public DemoQaPage clickToSubmit() {
        WebElement btn = driver.findElement(submit);
        waitElementIsVisible(btn).click();
        return this;
    }
}
