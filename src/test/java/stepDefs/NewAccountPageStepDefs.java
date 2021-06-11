package stepDefs;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateNewAccountPage;
import pages.LogPage;
import pages.MainPage;
import pages.NewAccountPage;

public class NewAccountPageStepDefs {
    MainPage mainPage = new MainPage();
    LogPage logPage = new LogPage();
    CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
    NewAccountPage newAccountPage = new NewAccountPage();

    @Given("I am on the main page of site")
    public void i_am_on_the_main_page_of_site() {

    }

    @When("I click on Sign in button in the right top corner of the page")
    public void i_click_on_sign_in_button_in_the_right_top_corner_of_the_page() {
        mainPage.clickOnSignInButton();
    }

    @When("I click on No account button in the bottom of the page")
    public void i_click_on_no_account_button_in_the_bottom_of_the_page() {
        logPage.clickOnNoAccountButton();
    }

    @When("I click on Mr window")
    public void i_click_on_mr_window() {
        createNewAccountPage.clickOnMrWindow();
    }

    @When("I enter {string} into First name field")
    public void i_enter_into_first_name_field(String firstName) {
        createNewAccountPage.clickOnFirstNameField(firstName);
    }

    @When("I enter {string} into Last name field")
    public void i_enter_into_last_name_field(String lastName) {
        createNewAccountPage.clickOnLastNameField(lastName);
    }

    @When("I enter {string} into Password field")
    public void i_enter_into_password_field(String password) {
        createNewAccountPage.clickPasswordField(password);
    }

    @When("I enter {string} into Email field")
    public void i_enter_into_email_field(String email) {
        createNewAccountPage.clickOnEmailField(email);
    }

    @When("I enter {string} into Birthdate field")
    public void i_enter_into_birthdate_field(String birthdayDate) {
        createNewAccountPage.clickOnBirthdayField(birthdayDate);
    }

    @When("I click on Receive offers from our partners window")
    public void i_click_on_receive_offers_from_our_partners_window() {
        createNewAccountPage.clickOnReceiveOffersWindow();
    }

    @When("I click on Customer data privacy window")
    public void i_click_on_customer_data_privacy_window() {
        createNewAccountPage.clickOnCustomerDataPrivacyWindow();
    }

    @When("I click on Sign up for our newsletter window")
    public void i_click_on_sign_up_for_our_newsletter_window() {
        createNewAccountPage.clickOnSignUpForOurNewsletterWindow();
    }

    @When("I click Agree field")
    public void i_click_agree_field() {
        createNewAccountPage.clickOnAgreeWindow();
    }

    @When("I click Save button")
    public void i_click_save_button() {
        createNewAccountPage.clickOnSaveButton();
    }

    @Then("I see Peter Johns in the right top corner of the page")
    public void i_see_peter_johns_in_the_right_top_corner_of_the_page() {
        newAccountPage.getTextFromNewAccountField();
    }
}
