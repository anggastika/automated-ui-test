package demo.steps_definition;

import demo.pages.bibit.HistoryFilterPage;
import demo.pages.bibit.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HistoryFilterSteps {

    HistoryFilterPage historyFilterPage = new HistoryFilterPage();
    MainPage mainPage = new MainPage();

    @When("User click  history filter button")
    public void userClickHistoryFilterButton() {
        mainPage.closerPopup();
        historyFilterPage.clickFilter();
    }

    @When("User choose pembelian at transaction")
    public void userChoosePembelianAtTransaction() {
        historyFilterPage.clickPembelianTransaction();
    }

    @When("User choose semua at status")
    public void userChooseSemuaAtStatus() {
        historyFilterPage.clickAllStatus();
    }


    @When("User choose six months period")
    public void userChooseSixMonthsPeriod() {
        historyFilterPage.clickSixMonthsPeriod();
    }

    @Then("Display all buying transaction between past six months")
    public void displayAllBuyingTransactionBetweenPastSixMonths() {
        historyFilterPage.displayAllBuyingTransaction();
    }

    @When("User choose three months period")
    public void userChooseThreeMonthsPeriod() {
        historyFilterPage.clickThreeMonthsPeriod();
    }

    @Then("Display all buying transaction between past three months")
    public void displayAllBuyingTransactionBetweenPastThreeMonths() {
        historyFilterPage.displayAllSellingTransaction();
    }

    @When("click button terapkan")
    public void clickButtonTerapkan() {
        historyFilterPage.clickTerapkanButton();
    }
}
