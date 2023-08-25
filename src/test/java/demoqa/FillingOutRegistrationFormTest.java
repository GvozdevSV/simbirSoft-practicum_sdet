package demoqa;

import base.BaseTest;
import org.testng.annotations.Test;

import static Constants.Constant.Urls.DEMO_QA_PAGE;

public class FillingOutRegistrationFormTest extends BaseTest {

    @Test
    public void registrationIsSuccessful() {
        basePage.open(DEMO_QA_PAGE);

        demoQaPage
                .inputFirstName("Иван")
                .inputLastName("Иванов")
                .inputEmail("ivan@gmail.com")
                .selectGenderMale()
                .inputMobile("9876543210")
                .selectDateOfBirth()
                .inputSubjectsHindi()
                .uploadImage()
                .inputCurrentAddress("Street")
                .selectStateNCR()
                .selectCityDelhi()
                .clickToSubmit();

        popUpWindowPage
                .checkHead()
                .checkTableElements();
    }
}
