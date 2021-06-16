package steps;

import pages.MainPage;

public class MainPageSteps {
    MainPage mainPage = new MainPage();

    public void clickOnLanguageDropdown() {
        mainPage.clickOnLanguageDropdown();

    }

    public void getAllLanguagesInDropdownList() {
        mainPage.getAllLanguagesInDropdownList();

    }

    public void languagesInDropList() {
      mainPage.languagesInDropList();
    }
}
