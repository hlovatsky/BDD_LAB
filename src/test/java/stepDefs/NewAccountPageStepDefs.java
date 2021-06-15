package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import steps.CreateNewAccountPageSteps;

public class NewAccountPageStepDefs {
    CreateNewAccountPageSteps createNewAccountPageSteps = new CreateNewAccountPageSteps();

    @Given("I am on the main page of site")
    public void i_am_on_the_main_page_of_site() {

    }

    @When("I click on Sign in button in the right top corner of the page I will move on LogPage")
    public void i_click_on_sign_in_button_in_the_right_top_corner_of_the_page_I_will_move_on_LogPage() {
        createNewAccountPageSteps.clickOnSignInButton();

    }

    @When("I click on No account button in the bottom of the page and I will move on the CreateNewAccountPage")
    public void i_click_on_no_account_button_in_the_bottom_of_the_page_and_I_will_move_on_the_CreateNewAccountPage() {
        createNewAccountPageSteps.clickOnNoAccountButton();

    }

    @When("I click on Mr window")
    public void i_click_on_mr_window() {
        createNewAccountPageSteps.clickOnMrWindow();

    }

    @When("I enter {string} into First name field")
    public void i_enter_into_first_name_field(String firstName) {
        createNewAccountPageSteps.enterFirstName(firstName);

    }

    @When("I enter {string} into Last name field")
    public void i_enter_into_last_name_field(String lastName) {
        createNewAccountPageSteps.enterLastName(lastName);

    }

    @When("I enter {string} into Password field")
    public void i_enter_into_password_field(String password) {
        createNewAccountPageSteps.enterPassword(password);

    }

    @When("I enter {string} into Email field")
    public void i_enter_into_email_field(String email) {
        createNewAccountPageSteps.enterEmail(email);

    }

    @When("I enter {string} into Birthdate field")
    public void i_enter_into_birthdate_field(String birthdayDate) {
        createNewAccountPageSteps.enterBirthdayDate(birthdayDate);

    }

    @When("I click on Receive offers from our partners window")
    public void i_click_on_receive_offers_from_our_partners_window() {
        createNewAccountPageSteps.clickOnReceiveOffersWindow();

    }

    @When("I click on Customer data privacy window")
    public void i_click_on_customer_data_privacy_window() {
        createNewAccountPageSteps.clickOnCustomerDataPrivacyWindow();

    }

    @When("I click on Sign up for our newsletter window")
    public void i_click_on_sign_up_for_our_newsletter_window() {
        createNewAccountPageSteps.clickOnSignUpForOurNewsletterWindow();

    }

    @When("I click Agree field")
    public void i_click_agree_field() {
        createNewAccountPageSteps.clickOnAgreeWindow();

    }

    @When("I click Save button and I will move on NewAccountPage")
    public void i_click_save_button_and_I_will_move_on_NewAccountPage() {
        createNewAccountPageSteps.clickOnSaveButton();

    }

    @Then("I will see Peter Johns in the right top corner of the page")
    public void i_will_see_peter_johns_in_the_right_top_corner_of_the_page() {
       createNewAccountPageSteps.getTextFromNewAccountField();

    }
}
