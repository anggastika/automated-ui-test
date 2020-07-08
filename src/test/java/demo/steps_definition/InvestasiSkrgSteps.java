package demo.steps_definition;

import demo.pages.bibit.LandingPage;
import demo.pages.bibit.LoginPage;
import demo.pages.bibit.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

//class InvestasiSkrgSteps

public class InvestasiSkrgSteps {
    MainPage mainPage = new MainPage();

    @When("User click investasi sekarang")
    public void userClickInvestasiSekarang() {
        mainPage.closerPopup();
        mainPage.clickButtonInvestasiSekarang();
    }

    @And("User wait for {int} seconds")
    public void userWaitForSeconds(int seconds) throws InterruptedException {
        mainPage.closerPopup();
        mainPage.waitABit(seconds);
        mainPage.closerPopup();
    }

    @And("User wait for {int} seconds and click reload if bad connection")
    public void userWaitForSecondsAndReloadIfBadCon(int seconds) throws InterruptedException {
        mainPage.waitABit(seconds);
        mainPage.reloadCon();
    }

//    @Then("User get warning message")
//    public void userGetWarningMessage() {
//        boolean result = mainPage.isWarningReg();
//        Assert.assertTrue(result);
//    }

    @Then("User get warning message '(.*?)'$")
    public void userGetWarningMessage(String containResult) {
        assertThat(mainPage.warningPopup().toLowerCase(), containsString(containResult.toLowerCase()));
    }

    @Then("User get terms permata '(.*?)'$")
    public void userGetPetunjukPembayaran(String containResult) {
        assertThat(mainPage.VaPermata().toLowerCase(), containsString(containResult.toLowerCase()));
    }

    @Then("User get terms CIMB '(.*?)'$")
    public void userGetTerms(String containResult){
        assertThat(mainPage.termCimbNiaga().toLowerCase(), containsString(containResult.toLowerCase()));
    }

    @Then("User get terms BRI '(.*?)'$")
    public void userGetTermsBri(String containResult) {
        assertThat(mainPage.termBri().toLowerCase(),containsString(containResult));
    }

    @Then("User get terms BNI '(.*?)'$")
    public void userGetTermsBni(String containResult){
        assertThat(mainPage.termBni().toLowerCase(), containsString(containResult.toLowerCase()));
    }

    @When("User input minimal pembelian")
    public void userInputMinPembelian(){
        mainPage.closerPopup();
        mainPage.inputMinBuy();
    }

    @When("User click button beli")
    public void userClickButtonBeli(){
        mainPage.closerPopup();
        mainPage.clickButtonBeli();
    }

    @When("User click setuju")
    public void userClickSetuju(){
        mainPage.closerPopup();
        mainPage.clickSetuju();
    }

    @When("User click bayar sekarang")
    public void userClickBayarSkrg(){
        mainPage.closerPopup();
        mainPage.clickBayarSkrg();
    }

    @When("User click transfer manual")
    public void userClickTransferManual(){
        mainPage.clickTrfManual();
    }

    @When("User click VA Permata")
    public void userClickVaPermata(){
        mainPage.clickVaPermata();
    }

    @When("User choose VA")
    public void userChooseVa(){
        mainPage.clickOtherVa();
    }

    @When("User choose BNI")
    public void userChooseBNI(){
        mainPage.clickVaBNI();
    }

    @When("User choose Mandiri BP")
    public void userChooseMandiri() {
        mainPage.clickMandiriBp();
    }

    @When("User choose CIMB Niaga")
    public void userChooseCimbNiaga() {
        mainPage.clickVaCimbNiaga();
    }

    @When("User choose BRI")
    public void userChooserBRI(){
        mainPage.clickVaBRI();
    }

    @And("User click bayar via VA")
    public void userBayarViaVA(){
        mainPage.clickButtonBayarViaVa();
    }

    @And("User select payment method {string}")
    public void userSelectPaymentMethod(String payment){
        mainPage.selectPaymentMethod(payment);
    }

    @And("User click bayar")
    public void userClickBayar(){
        mainPage.clickBayarLast();
    }

    @When("User click bank")
    public void userClickBank(){
        mainPage.clickBankPilihan1();
    }

    @When("User click bayar bank")
    public void userClickBayarBank(){
        mainPage.clickBayarBank();
    }

    @Then("User get list of transaction")
    public void userGetListOfTrans() {mainPage.listOfTrans();}

    @Then("User get mandiri logo")
    public void userGetMandiriLogo() {
        assertThat("user not able to see mandiri logo",
                mainPage.isMandiriLogoVisible(), equalTo(true));
    }

    @Then("User get Gopay popup")
    public void userGetGopayPopup() {
        assertThat("user not able to see Gopay popup",mainPage.isGopayBoxVisible(), equalTo(true));
    }


    @And("User click bayar LinkAja")
    public void userClickBayarLinkAja(){
        mainPage.clickBayarLinkAja();
    }

    @Then("User is on LinkAja punchout page and contain '(.*?)'")
    public void userIsOnLinkAja(String containResult) {
        assertThat(mainPage.linkAjaPage().toLowerCase(), Matchers.containsString(containResult.toLowerCase()));
    }


}
