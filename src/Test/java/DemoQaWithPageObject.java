import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQaWithPageObject extends TestBase{

     @Test
     void TestDemoQa(){
        regPage.openPage();
        regPage.firstName(TestDate.firstName)
                .lastName(TestDate.lastName)
                .email(TestDate.email);
        $(new ByText(TestDate.gander)).click();
        regPage.phone(TestDate.phone)
               .calendarComponent.setDate("April","1994");
        regPage.subject(TestDate.subject)
                .hobbiOne()
                .hobbiTwo()
                .file(TestDate.fileName)
                .address(TestDate.address)
                .state(TestDate.state)
                .city(TestDate.city);


        $("#submit").click();


        regPage.checkResult(TestDate.firstName)
                .checkResult(TestDate.lastName)
                .checkResult(TestDate.email)
                .checkResult(TestDate.gander)
                .checkResult(TestDate.phone)
                .checkResult("16 April,1994")
                .checkResult(TestDate.subject)
                .checkResult(TestDate.hobbi)
                .checkResult(TestDate.fileName)
                .checkResult(TestDate.address)
                .checkResult(TestDate.state +" "+ TestDate.city);



///









     }




}

