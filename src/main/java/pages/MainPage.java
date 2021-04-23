package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class MainPage extends BasePage {

    @FindBy(xpath = "//div[@class='user-info']//span[@class='hidden-sm-down']")
    private WebElement signInButton;

    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clickOnSignInButton() {
        signInButton.click();
    }


}
