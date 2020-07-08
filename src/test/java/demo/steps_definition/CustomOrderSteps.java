package demo.steps_definition;

import demo.pages.bibit.LandingPage;
import demo.pages.bibit.LoginPage;
import demo.pages.bibit.MainPage;
import demo.pages.bibit.MoneymarketPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

//class CustomOrderSteps

public class CustomOrderSteps {
    MainPage mainPage = new MainPage();
    MoneymarketPage moneymarketPage = new MoneymarketPage();

    @When("User click custom order option Pasar Uang")
    public void userClickCustomOrder(){
        mainPage.closerPopup();
        moneymarketPage.clickPasarUang();
    }

    @When("User click company")
    public void userClickCompany() {
        mainPage.closerPopup();
        moneymarketPage.clickCompany();
    }

    @When("User click beli1")
    public void userClickBeli1() {
        moneymarketPage.clickBeli1();
    }

    @When("User input min pembelian")
    public void userInputMinPembelian() {
        moneymarketPage.inputMinBuy();
    }

    @When("User click beli2")
    public void userClickBeli2(){
        moneymarketPage.clickBeli2();
    }




}
