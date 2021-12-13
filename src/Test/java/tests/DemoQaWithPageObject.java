package tests;

import org.junit.jupiter.api.Test;
import page.RegPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQaWithPageObject extends TestBase {
    RegPage regPage = new RegPage();

     @Test
     void TestDemoQa(){
        regPage.openPage();
        regPage.setFirstName(TestData.firstName)
                .setLastName(TestData.lastName)
                .setEmail(TestData.email)
                .setGender(TestData.gander);
        regPage.setPhone(TestData.phone)
               .calendarComponent.setDate("April","1994");
        regPage.setSubject(TestData.subject)
                .setHobbyOne()
                .setHobbyTwo()
                .setFile(TestData.fileName)
                .setAddress(TestData.address)
                .setState(TestData.state)
                .setCity(TestData.city)
                .clickSubmit();


        regPage.checkResult(TestData.firstName)
                .checkResult(TestData.lastName)
                .checkResult(TestData.email)
                .checkResult(TestData.gander)
                .checkResult(TestData.phone)
                .checkResult("16 April,1994")
                .checkResult(TestData.subject)
                .checkResult(TestData.hobby)
                .checkResult(TestData.fileName)
                .checkResult(TestData.address)
                .checkResult(TestData.state +" "+ TestData.city);
        System.out.println("two");



     }




}

