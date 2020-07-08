package demo.steps_definition;

import demo.pages.bibit.AktifasiAtPofilePage;
import io.cucumber.java.en.When;

public class AktifasiAProfileSteps {
    AktifasiAtPofilePage aktifasiAtPofilePage = new AktifasiAtPofilePage();

    @When("User click aktifasi preferensi syariah")
    public void userClickAktifasiPreferensiSyariah() {
        aktifasiAtPofilePage.clickAktifasiPreferensiSyariah();
    }

    @When("User click aktifasi pin login")
    public void userClickAktifasiPinLogin() {
        aktifasiAtPofilePage.clickAktifasiPinLogin();
    }

    @When("User click aktifasi Sembunyikan nominal")
    public void userClickAktifasiSembunyikanNominal() {
        aktifasiAtPofilePage.clickAktifasiSembunyikanNominal();
    }

    @When("User click home")
    public void userClickHome() {
        aktifasiAtPofilePage.clickHome();
    }

    @When("User see displayed had hidden nominal")
    public void userSeeDisplayedHadHiddenNominal() {
        aktifasiAtPofilePage.displayHiddenNominal();
    }
}
