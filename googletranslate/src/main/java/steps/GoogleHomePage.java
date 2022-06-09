package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.HomePage;

public class GoogleHomePage {

    HomePage homePage;

    @Step
    public void openGoogleTranslatePage(){
        homePage.open();
    }
    @Step
    public void enterTheWordToTranslate(String englishWord){
         homePage.enterTheWordToTranslate(englishWord);
         homePage.clickOnEnglishSourceButton();
    }
    @Step
    public void validationTheWordToTranslate(String resultWord){
          Assert.assertEquals(homePage.resultWordToTranslate(),resultWord);
    }
}
