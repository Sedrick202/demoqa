package tests;

import page.RegPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;



public class TestBase {


    @BeforeAll
    static void Setup(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }
}
