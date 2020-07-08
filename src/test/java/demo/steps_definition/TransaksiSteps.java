package demo.steps_definition;

import demo.pages.bibit.LoginPage;
import demo.pages.bibit.TransaksiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//class TransaksiSteps
public class TransaksiSteps {

    TransaksiPage transaksiPage = new TransaksiPage();
    LoginPage loginPage = new LoginPage();

    @When("User click button transaksi")
    public void userClickButtonTransaksi() {
        transaksiPage.clickTransaksiButton();
    }

    @Then("Belum ada transaksi is displayed")
    public void belumAdaTransaksiIsDisplayed() {
        transaksiPage.donthaveTransaksi();
    }

    @When("User insert phone number that have transaksi")
    public void userInsertPhoneNumberThatHaveTransaksi() {
        transaksiPage.inputPhoneThatHaveTransaksi();
        loginPage.clickSmsButton();
        loginPage.clickButtonLogin();
    }

    @Then("User see one or some transaksi is displayed")
    public void userSeeOneOrSomeTransaksiIsDisplayed() {
        transaksiPage.displayedTransaksi();
    }

    @When("User click history tab")
    public void userClickHistoryTab() {
        transaksiPage.clickHistoryTab();
        
    }

    @Then("User see one or some history is displayed")
    public void userSeeOneOrSomeHistoryIsDisplayed() {
        transaksiPage.displayedHistory();
    }

    @Then("Belum ada history is displayed")
    public void belumAdaHistoryIsDisplayed() {
        transaksiPage.donthaveHistory();
    }
}
