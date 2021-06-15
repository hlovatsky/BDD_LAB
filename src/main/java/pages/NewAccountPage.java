package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class NewAccountPage extends BasePage {
    @FindBy(xpath = "//a[@class='account']//span[@class='hidden-sm-down']")
    private WebElement newAccountField;

    public NewAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public String getTextFromNewAccountField() {
        log.info("I see text from newAccountField");
        return newAccountField.getText();
    }
}
