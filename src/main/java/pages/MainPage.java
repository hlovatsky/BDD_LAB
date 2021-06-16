package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MainPage extends BasePage {

    @FindBy(xpath = "//div[@class='user-info']//span[@class='hidden-sm-down']")
    private WebElement signInButton;

    @FindBy(xpath = "//button[@aria-label='Language dropdown']//span")
    private WebElement languageButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu hidden-sm-down']//li")
    private List<WebElement> languagesInDropDownList;

    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clickOnSignInButton() {
        log.info("I click on signInButton");
        signInButton.click();
    }

    public void clickOnLanguageDropdown() {
        log.info("I click on Language dropdown");
        languageButton.click();
    }

    public void getAllLanguagesInDropdownList() {
        log.info("I get numbers of languages");
        languagesInDropDownList.size();
    }

    public void languagesInDropList() {
        log.info("I get names of all languages");
        List<String> languages = new ArrayList<>();
        for (WebElement language : languagesInDropDownList) {
            languages.add(language.getText());
        }
    }
}
