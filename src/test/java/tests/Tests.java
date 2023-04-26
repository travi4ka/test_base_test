package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Tests extends TestBase {
    @Test
    @DisplayName("Check something")
    @Tag("Smoke")
    @Tag("TEST-123")
    void koko() {
        mainPage
                .openPage()
                .typeValueIntoSearchField("Hello world")
                .pressEnter();
        searchPage
                .verifyThatPageIsOpen()
                .verifyThatSearchInputFieldHasValue("Hello world");
    }
}
