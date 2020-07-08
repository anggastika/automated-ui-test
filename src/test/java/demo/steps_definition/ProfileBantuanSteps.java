package demo.steps_definition;

import demo.pages.bibit.MainPage;
import demo.pages.bibit.ProfileBantuanPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileBantuanSteps {

    ProfileBantuanPage profileBantuanPage = new ProfileBantuanPage();
    MainPage mainPage = new MainPage();

    @When("User click button bantuan")
    public void userClickButtonBantuan() {
        profileBantuanPage.clickBantuanButton();
    }

    @When("User click chat support")
    public void userClickChatSupport() {
        mainPage.closerPopup();
        profileBantuanPage.clickSupportButton();
    }

    @Then("User redirect to Support page")
    public void userRedirectToSupportPage() {
        profileBantuanPage.displaySupportPage();
    }

    @When("User click wa")
    public void userClickWa() {
        mainPage.closerPopup();
        profileBantuanPage.clickWAButton();
    }



    @When("User click support via email")
    public void userClickSupportViaEmail() {
        mainPage.closerPopup();
        profileBantuanPage.clickEmailButton();
    }


}
