package domashcka_3;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeworkThreeTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successfulTest() {
        open("/automation-practice-form");
        //executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        //шаги
        $("#firstName").setValue("Mihail");
        $("#lastName").setValue("Lubeznow");
        $("#userEmail").setValue("mihail@mail.ru");
        $("#userNumber").setValue("user123");
        $("#currentAddress").setValue("Miami");
        $(byText("Male")).click();
        $(byText("Music")).click();
        //(календарь)
        $("#dateOfBirthInput").click();
        $("#react-datepicker__month-select").click();
        $(byText("Aprill")).click();
        $("#react-datepicker__year-select").click();
        $(byText("2020")).click();
        $(byText("10")).click();
        //(календарь)
        $("#submit").click();
    }
}



