package demo.steps_definition;

import demo.pages.bibit.MainPage;
import demo.pages.bibit.NabungRutinPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NabungRutinSteps {

    NabungRutinPage nabungRutinPage = new NabungRutinPage();
    MainPage mainPage = new MainPage();

    @When("User click Sekarang kamu bisa Nabung Rutin")
    public void userClickSekarangKamuBisaNabungRutin() {
        nabungRutinPage.clickNabungRutin();
    }

    @When("User click tambah Pembelian Rutin")
    public void userClickTambahPembelianRutin() {
        nabungRutinPage.clickTambahPembelianRutin();
    }

    @When("User Choose Portofolio")
    public void userChoosePortofolio() {
        nabungRutinPage.clickPilihPortofolio();
    }

    @When("User input Nilai investasi")
    public void userInputNilaiInvestasi() {
        nabungRutinPage.insertNilaiInvest("2000000");
    }

    @When("User click button Confirm")
    public void userClickButtonConfirm() {
        nabungRutinPage.clickConfirm();

    }

    @Then("User see error message")
    public void userSeeErrorMessage() {
        nabungRutinPage.displayError();
    }

    @When("User Choose Product")
    public void userChooseProduct() {
        nabungRutinPage.clickPilihProduct();
    }

    @When("User Choose Gopay as Method payment")
    public void userChooseGopayAsMethodPayment() {

        nabungRutinPage.gopayAsPayment();
    }


    @Then("User see Successfully make the schedule")
    public void userSeeSuccessfullyMakeTheSchedule() {
        nabungRutinPage.displaySuccessMessage();
    }

    @When("User Choose Portofolio that still not have schedule")
    public void userChoosePortofolioThatStillNotHaveSchedule() {
        nabungRutinPage.clickPortofolioNotSchedule();
    }
}
