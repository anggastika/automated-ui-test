package demo.steps_definition;


import demo.api.bibit.auth.login.BaseApi;
import demo.api.bibit.portofolio.get_portofolio.PortofolioApi;
import demo.api.bibit.robo.CheckRoboResultApi;
import demo.helper.PMTCalc;
import demo.models.portofolio.get_portofolio.GetPortofolioResponse;
import demo.models.portofolio.get_portofolio.Result;
import demo.pages.bibit.LoginPage;
import demo.pages.bibit.MainPage;
import demo.pages.bibit.PortofolioPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

//class PortofolioSteps
public class PortofolioSteps {

    PortofolioPage portofolioPage = new PortofolioPage();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    BaseApi baseApi = new BaseApi();
    PortofolioApi portofolioApi = new PortofolioApi();
    CheckRoboResultApi checkRoboResultApi = new CheckRoboResultApi();

    int targetAmount;
    int targetMonth;
    int targetYear;

    @When("User click button portofolio")
    public void userClickButtonPortofolio() {
        mainPage.closerPopup();
        portofolioPage.clickPortofolioButton();
    }

//    @When("User insert phone number that have portofolio")
//    public void userInsertPhoneNumberThatHavePortofolio() {
//        portofolioPage.inputPhoneThatHavePortofolio();
//        loginPage.clickButtonLogin();
//    }

    @Then("Belum ada portofolio is displayed")
    public void belumAdaPortofolioIsDisplayed() {
        portofolioPage.dontHavePortofolio();
    }

    @Then("User see one or some portofolios is displayed")
    public void userSeeOneOrSomePortofoliosIsDisplayed() {
        portofolioPage.displayedPortofolio();
        portofolioPage.checkNilaiPortofolio();
    }

    @Then("The Portofolio Data from UI is Same with API Data")
    public void thePortofolioDataFromUIIsSameWithAPIData() {
        mainPage.closerPopup();
        //get from API
        Response getPortofolioResponse = portofolioApi.getPortofolio();
        GetPortofolioResponse apiResponseBody = getPortofolioResponse
                .as(GetPortofolioResponse.class);

//        List<String> apiData2 = new ArrayList<>();
//        List<Result> results = apiResponseBody.getData().getResult();
//        for(int i = 0; i < results.size();i++){
//            apiData2.add(results.get(i).getName());
//        }

        List<String> apidata = apiResponseBody.getData().getResult().stream()
                .map(Result::getName).collect(Collectors.toList());

        //get from UI
        List<String> uidata = portofolioPage.getPortofolioName();

        //compare
        Assert.assertEquals(apidata, uidata);
    }

    @When("User click button tambah portofolio")
    public void userClickButtonTambahPortofolio() {
        mainPage.closerPopup();
        portofolioPage.clickTambahPortofolio();
    }



    @When("User click terapkan")
    public void userClickTerapkan(){
        mainPage.closerPopup();
        portofolioPage.clickBtnTerapkan();
    }

    @When("User input portofolio name {string}")
    public void userInputPortofolioName(String name){
        mainPage.closerPopup();
        portofolioPage.inputRencana(name);
    }

    @When("User input target money {int} rupiah")
    public void userInputTargetMoney(int amount){
        mainPage.closerPopup();
        targetAmount = amount;
        portofolioPage.inputJumlahUang(amount);
    }

    @When("User select investment purpose {string}")
    public void userSelectInvestmentPurpose(String purpose) {
        portofolioPage.selectInvestmentPurpose(purpose);
    }

    @When("User select portofolio investment due date {int} {int}")
    public void userSelectPortofolioInvestmentDueDate(int month, int year) {
        targetMonth = month;
        targetYear = year;
        mainPage.closerPopup();
        portofolioPage.selectMonthYear(month, year);
    }

    @When("User click lanjut")
    public void userClickButtonLanjut(){
        mainPage.closerPopup();
        portofolioPage.clickBtnLanjut();
    }

    @Then("^Jumlah yang harus terkumpul '(.*?)'$")
    public void jmlYgHarusTerkumpul(String containResult) {
        mainPage.closerPopup();
        assertThat(portofolioPage.jumlahTerkumpul().toLowerCase(),containsString(containResult.toLowerCase()));
    }

    @And("Target Tanggal Pencapaian {string}")
    public void targetTanggalPencapaian(String dateResult) {
        mainPage.closerPopup();
        assertThat(portofolioPage.targetTanggal().toLowerCase(),containsString(dateResult.toLowerCase()));
    }

    @And("Jumlah yang Harus Kamu Tabung Tiap Bulan matches with calculation")
    public void jumlahYangHarusKamuTabungTiapBulanMatchesWithCalculation() {
        mainPage.closerPopup();
        long displayedPMT = Long.parseLong(portofolioPage.displayedPMT());
        // get robo id from API
//        Response getLoginOTPResponse = baseApi.login();
//        LoginOtpResponse loginResponseBody = getLoginOTPResponse
//                .as(LoginOtpResponse.class);
//        String roboId = loginResponseBody.getData().getRoboid();
//
//        // use obtained roboId to get risk score
//        Response getCheckRoboResultResponse = checkRoboResultApi.getRoboResult(roboId);
//        RoboResultResponse roboResponseBody = getCheckRoboResultResponse.as(RoboResultResponse.class);
//        String riskScore = roboResponseBody.getData().getResult().getScore();
//
//        System.out.print("Risk: ");
//        System.out.println(riskScore);

        String riskScoreStr = "2";
        long calculatedPMT = PMTCalc.calculatePMT(0, targetAmount, targetMonth, targetYear, riskScoreStr);

        Assert.assertEquals(calculatedPMT, displayedPMT);
    }

    @And("User click simpan")
    public void userClickSimpan() {
        portofolioPage.clickBtnSimpan();
    }

    @Then("Show error message '(.*?)'$")
    public void showErrorMsg(String containResult) {
//            boolean result = mainPage.searchResult();
//            Assert.assertTrue(result);
        assertThat(portofolioPage.errorMinBuy().toLowerCase(),containsString(containResult.toLowerCase()));
    }

}
