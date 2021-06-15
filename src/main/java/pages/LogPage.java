package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class LogPage extends BasePage {
    @FindBy(xpath = "//a[contains(@href,'create_account')]")
    private WebElement noAccountLink;

    public LogPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clickOnNoAccountButton() {
        log.info("I click on noAccountLink");
        noAccountLink.click();
    }
}
