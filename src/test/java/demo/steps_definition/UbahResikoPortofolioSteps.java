package demo.steps_definition;

import demo.pages.base.BasePageObject;
import demo.pages.bibit.MainPage;
import demo.pages.bibit.UbahResikoPortofolioPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class UbahResikoPortofolioSteps  {

    UbahResikoPortofolioPage ubahResikoPortofolioPage = new UbahResikoPortofolioPage();
    MainPage mainPage = new MainPage();
    @When("User click Ubah in the portofolio component at the main page")
    public void userClickUbahInThePortofolioComponentAtTheMainPage() {
        ubahResikoPortofolioPage.clickUbah();
    }

    @When("User click the decrease button until portofolio show portofolio konservatif")
    public void userClickTheDecreaseButtonUntilPortofolioShowPortofolioKonservatif() {
        mainPage.closerPopup();
        ubahResikoPortofolioPage.clickUntilPortofolioKonservatif();
    }

    @When("User click the decrease button until portofolio show portofolio moderat")
    public void userClickTheDecreaseButtonUntilPortofolioShowPortofolioModerat() {
        mainPage.closerPopup();
        ubahResikoPortofolioPage.clickUntilPortofolioModerat();
    }


    @Then("display portofolio changed to konservatif")
    public void displayPortofolioChangedToKonservatif() {
        ubahResikoPortofolioPage.displayPortofolioKonservatif();
    }

    @And("User click simpan hasil")
    public void userClickSimpanHasil() {
        ubahResikoPortofolioPage.clickSimpanHasil();
    }



    @Then("display portofolio changed to moderat")
    public void displayPortofolioChangedToModerat() {
        ubahResikoPortofolioPage.displayPortofolioModerat();
    }


}
