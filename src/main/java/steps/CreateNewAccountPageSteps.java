package steps;

import pages.CreateNewAccountPage;

public class CreateNewAccountPageSteps {


    CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();

    public void clickOnMrWindow() {
        createNewAccountPage.clickOnMrWindow();
    }

    public void fillRegistrationFormWith(String firstName, String lastName, String email, String password, String birthday) {
        createNewAccountPage.clickOnFirstNameField(firstName);
        createNewAccountPage.clickOnEmailField(lastName);
        createNewAccountPage.clickOnEmailField(email);
        createNewAccountPage.clickPasswordField(password);
        createNewAccountPage.clickOnBirthdayField(birthday);
    }



    public void clickOnReceiveOffersWindow() {
        createNewAccountPage.clickOnReceiveOffersWindow();
    }

    public void clickOnCustomerDataPrivacyWindow() {
        createNewAccountPage.clickOnCustomerDataPrivacyWindow();
    }

    public void clickOnSignUpForOurNewsletterWindow() {
        createNewAccountPage.clickOnSignUpForOurNewsletterWindow();
    }

    public void clickOnAgreeWindow() {
        createNewAccountPage.clickOnAgreeWindow();
    }

    public void clickOnSaveButton() {
        createNewAccountPage.clickOnSaveButton();
    }
}
