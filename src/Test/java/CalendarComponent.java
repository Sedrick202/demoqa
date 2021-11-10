import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.selector.ByText;


public class CalendarComponent {
    SelenideElement dateInput = $("#dateOfBirthInput"),
                    monthInput = $(".react-datepicker__month-select"),
                    yearInput = $(".react-datepicker__year-select");
    public void setDate(String month,String year){
        dateInput.click();
        monthInput.selectOption(month);
        yearInput.selectOption(year);
        $(new ByText("16")).click();


    }
}


   // $("#dateOfBirthInput").click();
       // $(".react-datepicker__year-select").selectOption("1994");
       // $(".react-datepicker__month-select").selectOption("April");
       // $(new ByText("16")).click();