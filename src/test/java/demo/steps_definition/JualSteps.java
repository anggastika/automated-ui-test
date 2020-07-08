package demo.steps_definition;

import demo.pages.bibit.LandingPage;
import demo.pages.bibit.LoginPage;
import demo.pages.bibit.MainPage;
import demo.pages.bibit.PortofolioPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

//class JualSteps

public class JualSteps {

    PortofolioPage portofolioPage = new PortofolioPage();

    @When("User click jual")
    public void userClickJual() {
        portofolioPage.clickJual();
    }

    @When("User click saya mengerti")
    public void userClickSayaMengerti() {
        portofolioPage.clickMengerti();
    }

    @When("User input jumlah penjualan")
    public void userInputJumlahPenjualan() {
        portofolioPage.inputJmlPenjualan();
    }

    @When("User click jual2")
    public void userClickJual2(){
        portofolioPage.clickJual2();
    }

    @When("User click approve")
    public void userClickApprove() {
        portofolioPage.clickApprove();
    }

    @When("User click jual3")
    public void userClickJual3() {
        portofolioPage.clickJual3();
    }

    @When("User insert PIN")
    public void userInserPin(){
        portofolioPage.insertPin();
    }


}
