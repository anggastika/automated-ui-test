package demo.steps_definition;

import demo.pages.bibit.LandingPage;
import demo.pages.bibit.LoginPage;
import demo.pages.bibit.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

// class SearchSteps
public class SearchSteps {
    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @When("User click loup icon")
    public void userClickLoupIcon() {
        mainPage.clickLoupIcon();
    }

    @When("User click search bar")
    public void userClickSearchBar() {mainPage.clickSearchBar();}

    @When("User input search value")
    public void userInputSearchValue() {mainPage.inputSearchValue("Pasar Uang");}

    @When("get search result contain '(.*?)'$")
    public void getSearchResult(String containResult) {
//            boolean result = mainPage.searchResult();
//            Assert.assertTrue(result);
        assertThat(mainPage.searchResult().toLowerCase(),containsString(containResult.toLowerCase()));
    }
}
