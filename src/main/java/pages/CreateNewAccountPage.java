package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPage extends BasePage {
    @FindBy(xpath = "//span[@class='custom-radio']//input[@value='1']")
    private WebElement mrFieldWindow;

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

    public void clickOnMrFieldWindow() {
        mrFieldWindow.click();
    }

    public void clickOnFirstNameField(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void clickOnLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void clickOnEmailField(String email) {
        emailField.sendKeys(email);
    }

    public void clickPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickOnBirthdayField(String email) {
        birthdayField.sendKeys(email);
    }

    public void clickOnReceiveOffersWindow() {
        receiveOffersWindow.click();
    }

    public void clickOnCustomerDataPrivacyWindow() {
        customerDataPrivacyWindow.click();
    }

    public void clickOnSignUpForOurNewsletterWindow() {
        signUpForOurNewsletterWindow.click();
    }

    public void clickOnAgreeWindow() {
        agreeWindow.click();
    }

    public void clickOnSaveButton() {
        saveButton.click();
    }

}