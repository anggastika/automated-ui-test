package demo.steps_definition;

import demo.pages.bibit.TipsUntukKamuPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TipsUntukKamuSteps {
    TipsUntukKamuPage tipsUntukKamuPage = new TipsUntukKamuPage();


    @When("User click one of the tips untuk in the main page")
    public void userClickOneOfTheTipsUntukInTheMainPage() {
        tipsUntukKamuPage.clickOneOfTipsInMainPage();
    }

    @Then("User see the article regarding the tips")
    public void userSeeTheArticleRegardingTheTips() {
        tipsUntukKamuPage.seeTheDisplayedTips();
    }

    @When("User click see all in the tips untuk kamu component")
    public void userClickSeeAllInTheTipsUntukKamuComponent() {
        tipsUntukKamuPage.clickSeeAllTipsUntukKamu();
    }

    @Then("User see list of tips untuk kamu")
    public void userSeeListOfTipsUntukKamu() {
        tipsUntukKamuPage.seeDisplayedAllTipsUntukKamu();

    }

    @When("User click education category")
    public void userClickEducationCategory() {
        tipsUntukKamuPage.clickEducationCategory();
    }

    @When("User see list of tips untuk kamu categoried as education")
    public void userSeeListOfTipsUntukKamuCategoriedAsEducation() {
        tipsUntukKamuPage.seeDisplayedTipsEducationCategory();
    }

    @When("User click one of the tips untuk kamu in the education category")
    public void userClickOneOfTheTipsUntukKamuInTheEducationCategory() {
        tipsUntukKamuPage.clickTipsEducationCategory();
    }
}
