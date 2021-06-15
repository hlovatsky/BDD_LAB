package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class CreateNewAccountPage extends BasePage {
    @FindBy(xpath = "//span[@class='custom-radio']//input[@value='1']")
    private WebElement mrWindow;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//div[@class='col-md-6']//input[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@name='birthday']")
    private WebElement birthdayField;

    @FindBy(xpath = "//input[@name='optin']")
    private WebElement receiveOffersWindow;

    @FindBy(xpath = "//input[@name='customer_privacy']")
    private WebElement customerDataPrivacyWindow;

    @FindBy(xpath = "//input[@name='newsletter']")
    private WebElement signUpForOurNewsletterWindow;

    @FindBy(xpath = "//input[@name='psgdpr']")
    private WebElement agreeWindow;

    @FindBy(xpath = "//button[contains(@class,'submit')]")
    private WebElement saveButton;

    public CreateNewAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clickOnMrWindow() {
        log.info("I click on mrWindow");
        mrWindow.click();
    }

    public void clickOnFirstNameField(String firstName) {
        log.info("I enter a first name in the firstNameField");
        firstNameField.sendKeys(firstName);
    }

    public void clickOnLastNameField(String lastName) {
        log.info("I enter a last name in the lastNameField");
        lastNameField.sendKeys(lastName);
    }

    public void clickOnEmailField(String email) {
        log.info("I enter an email in the emailField");
        emailField.sendKeys(email);
    }

    public void clickPasswordField(String password) {
        log.info("I enter a password in the passwordField");
        passwordField.sendKeys(password);
    }

    public void clickOnBirthdayField(String birthday) {
        log.info("I enter a birthday date in the birthdayField");
        birthdayField.sendKeys(birthday);
    }

    public void clickOnReceiveOffersWindow() {
        log.info("I click on the receiveOffersWindow");
        receiveOffersWindow.click();
    }

    public void clickOnCustomerDataPrivacyWindow() {
        log.info("I click on the customerDataPrivacyWindow");
        customerDataPrivacyWindow.click();
    }

    public void clickOnSignUpForOurNewsletterWindow() {
        log.info("I click on the signUpForOurNewsletterWindow");
        signUpForOurNewsletterWindow.click();
    }

    public void clickOnAgreeWindow() {
        log.info("I click on the agreeButton");
        agreeWindow.click();
    }

    public void clickOnSaveButton() {
        log.info("I click on the saveButton");
        saveButton.click();
    }
}