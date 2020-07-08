package demo.steps_definition;

import demo.pages.bibit.MainPage;
import demo.pages.bibit.ProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//class ProfileMenuSteps
public class ProfileMenuSteps {

    ProfilePage profilePage = new ProfilePage();
    MainPage mainPage = new MainPage();

    @When("User click button profile")
    public void userClickButtonProfile() {
        profilePage.clickButtonProfil();
    }

    @When("User click Data Pribadi")
    public void userClickDataPribadi() {
        profilePage.clickDataPribadi();
    }

    @When("User Input Pin Number")
    public void userInputPinNumber() {
        profilePage.insertPin();
    }

    @When("User click Ubah data personal")
    public void userClickUbahDataPersonal() {
        mainPage.closerPopup();
        profilePage.clickUbahDataPersonal();
    }

    @When("User input New Alamat")
    public void userInputNewAlamat() {
        profilePage.inputNewAlamat();
    }

    @Then("User click Simpan Perubahan")
    public void userClickSimpanPerubahan() {
        profilePage.clickSimpanPerubahan();
    }

    @When("User input New City")
    public void userInputNewCity() {
    }

    @When("User click the suggested City")
    public void userClickTheSuggestedCity() {
    }

    @When("User input kodepos")
    public void userInputKodepos() {
    }


    @When("User click kode promo")
    public void userClickKodePromo() {
        profilePage.clickKodePromo();
    }

    @When("User input kode promo")
    public void userInputKodePromo() {
        profilePage.inputKodePromo();
    }

    @When("User click verifikasi kode promo")
    public void userClickVerifikasiKodePromo() {
        profilePage.clickVerifikasiKodePromo();
    }

    @When("User click Gunakan Voucher")
    public void userClickGunakanVoucher() {

    }

    @Then("successfully use voucher kode promo")
    public void successfullyUseVoucherKodePromo() {
    }

    @When("User input invalid kode promo")
    public void userInputInvalidKodePromo() {
        profilePage.inputInvalidKodePromo();
    }

    @Then("Voucher tidak ditemukan is Displayed")
    public void voucherTidakDitemukanIsDisplayed() {
        profilePage.displayInvalidKodePromo();
    }

    @Then("Voucher sudah digunakan is Displayed")
    public void voucherSudahDigunakanIsDisplayed() {
        profilePage.displayKodePromoUsed();
    }

    @When("User click voucher saya")
    public void userClickVoucherSaya() {
        profilePage.clickVoucherSaya();
    }

    @Then("User see a or some vouchers")
    public void userSeeAOrSomeVouchers() {
        profilePage.displayVoucher();
    }

    @Then("belum ada voucher is displayed")
    public void belumAdaVoucherIsDisplayed() {
    }

    @When("User click kamus investasi")
    public void userClickKamusInvestasi() {
        profilePage.clickKamusInvestasi();
    }

    @When("User input saham in search bar")
    public void userInputSahamInSearchBar() {
        profilePage.inputInSearchBar("Saham");
    }

    @Then("show result article contain saham")
    public void showResultArticleContainSaham() {
        profilePage.displayResultSearch();
    }

    @When("User input kode promo already used")
    public void userInputKodePromoAlreadyUsed() {
        profilePage.inputKodePromoAlreadyUsed();
    }

    @When("User click logout")
    public void userClickLogout() {
        profilePage.clickLogOut();
    }

    @Then("Successfully logout")
    public void successfullyLogout() {
        profilePage.displayMain();
    }
}
