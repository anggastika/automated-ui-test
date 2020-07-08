package demo.steps_definition;

import demo.pages.bibit.MainPage;
import demo.pages.bibit.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//class RegisterSteps
public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();
    MainPage mainPage = new MainPage();

    @When("User click button Register")
    public void userClickButtonRegister() {
        registerPage.clickButtonRegister();
    }

    @When("User answer all the questions")
    public void userAnswerAllTheQuestions() throws InterruptedException {
        registerPage.fillAllQuestions();
    }

    @When("User input Unregistered Phone Number")
    public void userInputUnregisteredPhoneNumber() {
        registerPage.inputUnregisteredPhoneNumber("085555555501");
    }

    @Then("successfully Register Phone Number")
    public void successfullyRegisterPhoneNumber() {
    }


    @When("insert phone number wrong phone number format")
    public void insertPhoneNumberWrongPhoneNumberFormat() throws InterruptedException {
        Thread.sleep(1000);
        registerPage.inputIncorrectPhoneNumber("1234567890"); }

    @When("insert phone number registered")
    public void insertPhoneNumberRegistered() throws InterruptedException {
        Thread.sleep(1000);
    registerPage.inputRegisteredPhoneNumber("085555555564");
    }

    @Then("display phone number wrong phone number")
    public void displayPhoneNumberWrongPhoneNumber() {
        registerPage.displayErrorMessage();
    }

    @Then("display phone number already existed")
    public void displayPhoneNumberAlreadyExisted() {
        registerPage.displayErrorMessage();
    }

    @And("insert phone number")
    public void insertPhoneNumber() throws InterruptedException {
        Thread.sleep(1000);
        registerPage.inputUnregisteredPhoneNumber("085555555325");
    }

    @And("insert OTP for five times")
    public void insertOTPForFiveTimes() {
        registerPage.insertOTPforFiveTimes();
    }

    @Then("display to many OTPs")
    public void displayToManyOTPs() {
        registerPage.displayErrorMessage();
    }

    @When("User input pendidikan {string} on register page")
    public void userInputPendidikanOnRegisterPage(String education) {
        registerPage.selectEducation(education);
    }

    @When("User input pendapatan pertahun {string} on register page")
    public void userInputPendapatanPertahunOnRegisterPage(String salary) {
        registerPage.selectAnnualSalary(salary);
    }

    @When("User input sumber penghasilan {string} on register page")
    public void userInputSumberPenghasilanOnRegisterPage(String source) {
        registerPage.selectSalarySource(source);
    }

    @When("User nama bank {string} on register page")
    public void userNamaBankOnRegisterPage(String bankName) {
        registerPage.selectBankName(bankName);
    }

    @When("User input nomor rekening {string} on register page")
    public void userInputNomorRekeningOnRegisterPage(String backAccountNumber) {
        registerPage.inputBankAccountNumber(backAccountNumber);
    }

    @When("User input nama pemilik rekening {string}")
    public void userInputNamaPemilikRekening(String bankAccountName) {
        registerPage.inputBankAccountName(bankAccountName);
    }

    @When("User sign on registration on register page")
    public void userSignOnRegistrationOnRegisterPage() {
        registerPage.writeSignIn();
    }

    @And("User upload ktp on register page")
    public void userUploadKtpOnRegisterPage() {
        registerPage.uploadKTP();

    }

    @When("User click button lanjutkan registrasi on home page")
    public void userClickButtonLanjutkanRegistrasiOnHomePage() {
        mainPage.clickLanjutkanRegistrasi();
    }


}
