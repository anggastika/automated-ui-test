package demo.steps_definition;

import demo.pages.bibit.ProfileSubMenuPage;
import io.cucumber.java.en.When;

public class ProfileSubMenuSteps {

    ProfileSubMenuPage profileSubMenuPage = new ProfileSubMenuPage();
    @When("User click FAQ")
    public void userClickFAQ() {
        profileSubMenuPage.clickFAQ();

    }

    @When("User click Store")
    public void userClickStore() {
        profileSubMenuPage.clickStore();
    }

    @When("User click Rate bibit")
    public void userClickRateBibit() {
        profileSubMenuPage.clickRatebibit();
    }

    @When("User click bibit keren")
    public void userClickBibitKeren() {
        profileSubMenuPage.clickBibitKeren();
    }

    @When("User click berikan saran")
    public void userClickBerikanSaran() {
        profileSubMenuPage.clickBerikanSaran();
    }

    @When("User click kurang oke")
    public void userClickKurangOke() {
        profileSubMenuPage.clickKurangOke();
    }

    @When("User click Komunitas")
    public void userClickKomunitas() { profileSubMenuPage.clickKomunitas(); }
}
