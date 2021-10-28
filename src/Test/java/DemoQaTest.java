import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DemoQaTest {


    @BeforeAll
    static void Setup(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }

     @Test
     void TestDemoQa(){
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Nikita");
        $("#lastName").setValue("Eltsov");
        $("#userEmail").setValue("Elcc12354c@mail.ru");
        $(new ByText("Male")).click();
        $("#userNumber").setValue("9167838450");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1994");
        $(".react-datepicker__month-select").selectOption("April");
        $(new ByText("16")).click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label").click();
        $("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(3) > label").click();
        $("#uploadPicture").uploadFromClasspath("test.png");
        $("#currentAddress").setValue("some adress");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").click();

        $("body > div.fade.modal.show").shouldHave(text("Nikita Eltsov"));
        $("body > div.fade.modal.show").shouldHave(text("Elcc12354c@mail.ru"));
        $("body > div.fade.modal.show").shouldHave(text("Male"));
        $("body > div.fade.modal.show").shouldHave(text("9167838450"));
        $("body > div.fade.modal.show").shouldHave(text("16 April,1994"));
        $("body > div.fade.modal.show").shouldHave(text("English"));
        $("body > div.fade.modal.show").shouldHave(text("Reading, Music"));
        $("body > div.fade.modal.show").shouldHave(text("test.png"));
        $("body > div.fade.modal.show").shouldHave(text("some adress"));
        $("body > div.fade.modal.show").shouldHave(text("NCR Delhi"));











     }




}

