package demo.steps_definition;

import demo.pages.bibit.LandingPage;
import demo.pages.bibit.LoginPage;
import demo.pages.bibit.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

//class LoginSteps

public class LoginSteps {
    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Given("User is on bibit screen")
    public void userIsOnBibitScreen() {
        boolean result = landingPage.isOnPage();
        Assert.assertTrue(result);
        landingPage.clickGradArrow();
    }

    @When("User swipe up")
    public void userSwipeUp() {
        landingPage.swipeUp();
    }

    @When("User click button login")
    public void userClickButtonLogin() {
        landingPage.clickButtonLandingPageLogin();
    }

    @When("User insert correct phone number")
    public void userInsertCorrectPhoneNumber() {
        loginPage.inputPhoneNumber("089912341234");
        loginPage.clickSmsButton();
        loginPage.clickButtonLogin();
    }

    @And("User input correct OTP")
    public void userInputcorrectOTP() {
        loginPage.inputOTP();
        //loginPage.clickButtonLanjutkan();
    }

    @Then("successfully login with splash screen")
    public void successfullyLoginToHomePage() {
       boolean result = mainPage.isOnSplashScreen();
       Assert.assertTrue(result);
    }

    @Then("User is on bibit main page")
    public void userIsOnBibitMainPage() {
        boolean result = mainPage.isOnMainPage();
        Assert.assertTrue(result);
    }

    @Then("show bibit logo")
    public void showBibitLogo() {
        boolean result = mainPage.isShowBibitLogo();
        Assert.assertTrue(result);
    }

    @When("User insert phone number that have portofolio")
    public void userInsertPhoneNumberThatHavePortofolio() {
        loginPage.inputPhoneThatHavePortofolio();
        loginPage.clickSmsButton();
        loginPage.clickButtonLogin();
    }

    @When("User insert phone number {string}")
    public void userInsertPhoneNumber(String phone) {
        loginPage.inputPhone(phone);
        loginPage.clickSmsButton();
        loginPage.clickButtonLogin();
    }

    @Then("User get error message contain '(.*?)'$")
    public void userGetErrorMessageContain(String containResult){
        assertThat(loginPage.errMsg().toLowerCase(),containsString(containResult.toLowerCase()));
    }

    @When("User input wrong otp {string}")
    public void userInputWrongOtp(String otp){
        loginPage.inputWrongOtp(otp);
    }

    @Then("User get otp error message contain '(.*?)'$")
    public void userGetOtpErrorMessageContain(String containResult){
        assertThat(loginPage.otpErrMsg().toLowerCase(),containsString(containResult.toLowerCase()));
    }


//    @When("insert the phone number")
//    public void insertThePhoneNumber() {
//    }
//
//    @Then("display phone number not exist")
//    public void displayPhoneNumberNotExist() {
//    }
//
//    @And("click pendaftaran lanjutan")
//    public void clickPendaftaranLanjutan() {
//    }
//
//    @And("fill all the form")
//    public void fillAllTheForm() {
//    }




}

