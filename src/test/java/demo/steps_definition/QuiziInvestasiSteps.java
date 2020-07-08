package demo.steps_definition;

import demo.pages.bibit.QuizInvestasiPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QuiziInvestasiSteps {

    QuizInvestasiPage quizInvestasiPage = new QuizInvestasiPage();
    @When("User click Quiz Apa sih Reksa dana")
    public void userClickQuizApaSihReksaDana() {
    quizInvestasiPage.clickQuizApaSihReksaDana();
    }

    @When("User click Mulai Kuis")
    public void userClickMulaiKuis() {
        quizInvestasiPage.clickMulaiKuis();

    }

    @When("User Answer Quiz Apa sih reksa dana  with all correct answers")
    public void userAnswerQuizApaSihReksaDanaWithAllCorrectAnswers() {
        quizInvestasiPage.AllRightAnswerKenalReksaDana();
    }
}
