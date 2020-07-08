package demo.steps_definition;

import demo.pages.bibit.LandingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CobaAjaSteps {

    LandingPage landingPage = new LandingPage();

    @When("User click coba aja dulu")
    public void userClickCobaAjaDulu() {
        landingPage.cobaajaClick();
    }

    @When("User answer all the questions in the register page")
    public void userAnswerAllTheQuestionsInTheRegisterPage() throws InterruptedException {
        landingPage.aswerQuestion();
    }

    @When("User click simulasikan rekomendasi robo")
    public void userClickSimulasikanRekomendasiRobo() {
        landingPage.clickSimulasiRobo();
    }

    @When("User input investasi awal")
    public void userInputInvestasiAwal() throws InterruptedException {
        landingPage.inputInvestPertama("250000");
    }

    @When("User input investasi bulanan")
    public void userInputInvestasiBulanan() throws InterruptedException {
        landingPage.inputInvestBulanan("2000000");
    }

    @Then("check perkiraan Nilai Investasi")
    public void checkPerkiraanNilaiInvestasi() {
        landingPage.verifikasiNilai();
    }
}
