package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private SelenideElement searchInputField = $("textarea[name='q']");

    @Step("Open Main page")
    public MainPage openPage(){
        open("https://google.com");
        return this;
    }

    @Step("Type text to the input field: {0}")
    public MainPage typeValueIntoSearchField(String value){
        searchInputField.setValue(value);
        return this;
    }

    @Step("Press enter")
    public MainPage pressEnter(){
        searchInputField.pressEnter();
        return this;
    }



}
