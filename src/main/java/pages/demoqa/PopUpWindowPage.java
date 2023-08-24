package pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class PopUpWindowPage extends BasePage {
    public PopUpWindowPage(WebDriver driver) {
        super(driver);
    }

    private final By head = By.id("example-modal-sizes-title-lg");

    public PopUpWindowPage checkHead() {
        String actualHead = driver.findElement(head).getText();

        Assert.assertEquals("Thanks for submitting the form", actualHead);
        return this;
    }

    public PopUpWindowPage checkTableBody(String value) {
        WebElement actualElement = driver.findElement(
                By.xpath("//table/tbody/tr[*]/td[text()='" + value + "']"));

        Assert.assertEquals(value, actualElement.getText());
        return this;
    }
}
