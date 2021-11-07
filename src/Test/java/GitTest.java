import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GitTest {
    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
    }
    @Test
    void testGit() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $$(".markdown-body ul li").get(6).$("a").click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));


        sleep(5000);

    }
}
