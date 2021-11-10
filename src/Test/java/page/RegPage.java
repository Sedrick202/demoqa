package page;
import page.components.CalendarComponent;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegPage {
    public CalendarComponent calendarComponent = new CalendarComponent();

    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            PhoneInput = $("#userNumber"),
            resultTable = $("body > div.fade.modal.show"),
            emailImput = $("#userEmail"),
            subjectInput = $("#subjectsInput"),
            hobbyOneInput = $("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label"),
            hobbyTwoInput = $("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(3) > label"),
            fileInput = $("#uploadPicture"),
            addressImput = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input");


    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    public RegPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegPage checkResult(String value) {
        resultTable.shouldHave(Condition.text(value));
        return this;
    }
    public RegPage setPhone(String value) {
        PhoneInput.setValue(value);
        return this;
    }
    public RegPage setEmail(String value) {
        emailImput.setValue(value);

        return this;
    }
    public RegPage setSubject(String value) {
        subjectInput.setValue(value).pressEnter();

        return this;
    }
    public RegPage setHobbyOne() {
        hobbyOneInput.click();

        return this;
    }
    public RegPage setHobbyTwo() {
        hobbyTwoInput.click();

        return this;
    }
    public RegPage setFile (String value) {
        fileInput.uploadFromClasspath(value);

        return this;
    }

    public RegPage setAddress (String value) {
        addressImput.setValue(value);

        return this;
    }
    public RegPage setState (String value) {
        stateInput.setValue(value).pressEnter();

        return this;
    }
    public RegPage setCity (String value) {
        cityInput.setValue(value).pressEnter();

        return this;
    }

    public RegPage setGender (String value) {
        $(new ByText(value)).click();


        return this;
    }

}


