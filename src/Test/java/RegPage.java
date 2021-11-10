import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegPage {
    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            PhoneInput = $("#userNumber"),
            resultTable = $("body > div.fade.modal.show"),
            emailImput = $("#userEmail"),
            subjectInput = $("#subjectsInput"),
            hobbiOneInput = $("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label"),
            hobbiTwoInput = $("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(3) > label"),
            fileInput = $("#uploadPicture"),
            addressImput = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input");


    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    public RegPage firstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegPage lastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegPage checkResult(String value) {
        resultTable.shouldHave(Condition.text(value));
        return this;
    }
    public RegPage phone(String value) {
        PhoneInput.setValue(value);
        return this;
    }
    public RegPage email(String value) {
        emailImput.setValue(value);

        return this;
    }
    public RegPage subject(String value) {
        subjectInput.setValue(value).pressEnter();

        return this;
    }
    public RegPage hobbiOne() {
        hobbiOneInput.click();

        return this;
    }
    public RegPage hobbiTwo() {
        hobbiTwoInput.click();

        return this;
    }
    public RegPage file (String value) {
        fileInput.uploadFromClasspath(value);

        return this;
    }

    public RegPage address (String value) {
        addressImput.setValue(value);

        return this;
    }
    public RegPage state (String value) {
        stateInput.setValue(value).pressEnter();

        return this;
    }
    public RegPage city (String value) {
        cityInput.setValue(value).pressEnter();

        return this;
    }
    CalendarComponent calendarComponent = new CalendarComponent();
}


    //$("body > div.fade.modal.show").shouldHave(text("Nikita Eltsov"));