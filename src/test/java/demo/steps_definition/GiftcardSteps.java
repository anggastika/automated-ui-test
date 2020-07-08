package demo.steps_definition;

import demo.pages.bibit.GiftcardPage;
import demo.pages.bibit.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class GiftcardSteps {
    MainPage mainPage = new MainPage();
    GiftcardPage giftcardPage = new GiftcardPage();

    @When("User click giftcard menu")
    public void userClickGiftcardMenu() {
        mainPage.closerPopup();
        giftcardPage.clickGiftcardMenu();
    }

    @And("User select giftcard theme {string}")
    public void userSelectGiftcardTheme(String type) {
        mainPage.closerPopup();
        giftcardPage.clickGiftType(type);
    }


    @And("User select themes on slick slide")
    public void userSelectThemesOnSlickSlide() {
        mainPage.closerPopup();
        giftcardPage.clickBirthdayTheme();
    }

    @And("User click pilih desain")
    public void userClickPilihDesain() {
        mainPage.closerPopup();
        giftcardPage.clickBtnPilihDesign();
    }

    @And("User select nominal {string}")
    public void userSelectNominal(String nominal) {
        mainPage.closerPopup();
        giftcardPage.clickBtnNominalSuggest(nominal);
    }

    @And("User input message {string}")
    public void userInputMessage(String message) {
        mainPage.closerPopup();
        giftcardPage.inputGiftMessage(message);
    }

    @And("User click selanjutnya")
    public void userClickSelanjutnya() {
        mainPage.closerPopup();
        giftcardPage.clickBtnSelanjutnya();
    }

    @And("User click lanjutkan pembayaran")
    public void userClickLanjutkanPembayaran() {
        mainPage.closerPopup();
        giftcardPage.clickBtnLanjutkanPembayaran();
    }

    @Then("User get gojek popup")
    public void userGetGojekPopup() {
        assertThat("user not able to gojek popup",
                giftcardPage.isGopayVisible(), equalTo(true));
    }
}
