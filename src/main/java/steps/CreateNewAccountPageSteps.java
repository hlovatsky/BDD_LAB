package steps;

import pages.CreateNewAccountPage;
import pages.LogPage;
import pages.MainPage;
import pages.NewAccountPage;

public class CreateNewAccountPageSteps {

    MainPage mainPage = new MainPage();
    CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
    LogPage logPage = new LogPage();
    NewAccountPage newAccountPage = new NewAccountPage();

    public void clickOnSignInButton() {
        mainPage.clickOnSignInButton();

    }

    public void clickOnNoAccountButton() {
        logPage.clickOnNoAccountButton();

    }

    public void clickOnMrWindow() {
        createNewAccountPage.clickOnMrWindow();

    }

    public void enterFirstName(String firstName) {
        createNewAccountPage.clickOnFirstNameField(firstName);

    }

    public void enterLastName(String lastName) {
        createNewAccountPage.clickOnLastNameField(lastName);

    }

    public void enterEmail(String email) {
        createNewAccountPage.clickOnEmailField(email);

    }

    public void enterPassword(String password) {
        createNewAccountPage.clickPasswordField(password);

    }

    public void enterBirthdayDate(String birthday) {
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

    public void getTextFromNewAccountField() {
        newAccountPage.getTextFromNewAccountField();
    }
}
