package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.MainPageSteps;


public class MainPageStepDefs {
    MainPageSteps mainPageSteps = new MainPageSteps();

    @Given("that I am on the main page of site")
    public void that_i_am_on_the_main_page_of_site() {

    }
    @When("I click on Language dropdown in the top menu")
    public void i_click_on_language_dropdown_in_the_top_menu() {
        mainPageSteps.clickOnLanguageDropdown();
    }
    @Then("I will see {int} languages in dropdown list")
    public void i_will_see_languages_in_dropdown_list(Integer int1) {
       mainPageSteps.getAllLanguagesInDropdownList();

    }
    @Then("I will see {string} in dropdown list")
    public void i_will_see_in_dropdown_list(String string) {
        mainPageSteps.languagesInDropList();

    }
}
