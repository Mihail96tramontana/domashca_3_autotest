package domashcka_3;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class domachka_3_autotest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";

        @Test
        void successfulTest() {
            open("/automation-practice-form");

            firstName lastName userEmail userNumber
        subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3
                    currentAddress




}
