package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.wordreference.com/")
public class HomePage  extends PageObject {

    @FindBy(id = "si")
    WebElement txtBoxSourceLanguage;
    @FindBy(xpath ="//*[@id='text_form']/input[2]")
    WebElement btnSearch;
    @FindBy (xpath = "//*[@id=\"enes:7174\"]/td[3]")
    WebElement txtResultLanguage;

    public void enterTheWordToTranslate(String englishWord){
        txtBoxSourceLanguage.sendKeys(englishWord);
    }
    public void clickOnEnglishSourceButton(){
        btnSearch.click();
    }
    public String resultWordToTranslate (){
        return txtResultLanguage.getText();
    }

}
