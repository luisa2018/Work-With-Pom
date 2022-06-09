package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.GoogleHomePage;

public class GoogleTranslateStepDefinitions {

    @Steps
    GoogleHomePage translate;
    @Given("that Susan wants to translate a word")
    public void thatSusanWantsToTranslateAWord() {
        translate.openGoogleTranslatePage();
    }
    @When("she translates the word {string} from English to Spanish")
    public void sheTranslatesTheWordCheeseFromEnglishToSpanish(String englishWord) {
         translate.enterTheWordToTranslate(englishWord);
    }
    @Then("she should see the word  {string} in the screen")
    public void sheShouldSeeTheWordQuesoInTheScreen(String resultWord) {
        translate.validationTheWordToTranslate(resultWord);
    }

}
