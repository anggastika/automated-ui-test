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

//class TopupSteps
public class TopupSteps {
    MainPage mainPage = new MainPage();
    PortofolioPage portofolioPage = new PortofolioPage();

    @When("User click portofolio investasi")
    public void userClickPortInv(){
        mainPage.closerPopup();
        mainPage.clickPortofolio();
    }

    @When("User click topup")
    public void userClickTopup(){
        mainPage.closerPopup();
        portofolioPage.clickTopup();
    }

    @When("User click top up protofolio {string} on home page")
    public void userClickTopUpProtofolioOnHomePage(String portofolioName) {
        mainPage.clickTopUpOnPortofolio(portofolioName);
    }

    @When("User click investasi sekarang with portofolio {string} on home page")
    public void userClickInvestasiSekarangWithPortofolioOnHomePage(String portofolioName) {
        mainPage.clickInvestasiSekarang(portofolioName);
    }


}
