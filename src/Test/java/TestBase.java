import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;



public class TestBase {

    RegPage regPage = new RegPage();
    @BeforeAll
    static void Setup(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }
}
