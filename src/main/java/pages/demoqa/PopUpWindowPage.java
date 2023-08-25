package pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopUpWindowPage extends BasePage {
    public PopUpWindowPage(WebDriver driver) {
        super(driver);
    }

    private final Map<String, String> expectedMap = createExpectedMap();
    private final By head = By.id("example-modal-sizes-title-lg");
    private final String nameLabel = "Student Name";
    private final String emailLabel = "Student Email";
    private final String genderLabel = "Gender";
    private final String mobileLabel = "Mobile";
    private final String dateOfBirthLabel = "Date of Birth";
    private final String subjectsLabel = "Subjects";
    private final String hobbiesLabel = "Hobbies";
    private final String pictureLabel = "Picture";
    private final String addressLabel = "Address";
    private final String stateAndCityLabel = "State and City";

    public PopUpWindowPage checkHead() {
        String actualHead = driver.findElement(head).getText();

        Assert.assertEquals("Thanks for submitting the form", actualHead);
        return this;
    }

    public void checkTableElements() {
        List<WebElement> myList = driver.findElements(By.xpath("//table/tbody/tr"));
        Map<String, String> actualTable = new HashMap<>();
        List<WebElement> labelAndValue;

        for (int i = 1; i <= myList.size(); i++) {
            labelAndValue = findElements(i);
            String label = labelAndValue.get(0).getText();
            String value = labelAndValue.get(1).getText();

            actualTable.put(label, value);
            labelAndValue.clear();
        }

        Assert.assertEquals(actualTable.get(nameLabel), expectedMap.get(nameLabel));
        Assert.assertEquals(actualTable.get(emailLabel), expectedMap.get(emailLabel));
        Assert.assertEquals(actualTable.get(genderLabel), expectedMap.get(genderLabel));
        Assert.assertEquals(actualTable.get(mobileLabel), expectedMap.get(mobileLabel));
        Assert.assertEquals(actualTable.get(dateOfBirthLabel), expectedMap.get(dateOfBirthLabel));
        Assert.assertEquals(actualTable.get(subjectsLabel), expectedMap.get(subjectsLabel));
        Assert.assertEquals(actualTable.get(hobbiesLabel), expectedMap.get(hobbiesLabel));
        Assert.assertEquals(actualTable.get(pictureLabel), expectedMap.get(pictureLabel));
        Assert.assertEquals(actualTable.get(addressLabel), expectedMap.get(addressLabel));
        Assert.assertEquals(actualTable.get(stateAndCityLabel), expectedMap.get(stateAndCityLabel));
    }

    private List<WebElement> findElements(int i) {
        return driver.findElements(By.xpath("//table/tbody/tr["+i+"]/td"));
    }

    private Map<String, String> createExpectedMap() {
        Map<String, String> expectedMap = new HashMap<>();

        expectedMap.put(nameLabel, "Иван Иванов");
        expectedMap.put(emailLabel, "ivan@gmail.com");
        expectedMap.put(genderLabel, "Male");
        expectedMap.put(mobileLabel, "9876543210");
        expectedMap.put(dateOfBirthLabel, "03 May,1992");
        expectedMap.put(subjectsLabel, "Hindi");
        expectedMap.put(hobbiesLabel, "");
        expectedMap.put(pictureLabel, "image.jpg");
        expectedMap.put(addressLabel, "Street");
        expectedMap.put(stateAndCityLabel, "NCR Delhi");

        return expectedMap;
    }
}
