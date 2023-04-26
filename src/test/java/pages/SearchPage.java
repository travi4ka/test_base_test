package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    private SelenideElement searchInputField = $("textarea[name='q']");
    private SelenideElement picturesLink = $x("//a[text()='Картинки']");
    private SelenideElement picturesLink_2 = $$("a").findBy(Condition.text("Картинки"));

    @Step("Verify that page is open")
    public SearchPage verifyThatPageIsOpen() {
        picturesLink.shouldBe(visible);
        picturesLink_2.shouldBe(visible);
        return this;
    }

    @Step("Verify that input field has value: {0}")
    public SearchPage verifyThatSearchInputFieldHasValue(String value) {
        searchInputField.shouldHave(exactTextCaseSensitive(value));
        return this;
    }


}
