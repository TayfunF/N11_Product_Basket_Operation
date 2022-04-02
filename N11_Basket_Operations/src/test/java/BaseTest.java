import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//------------------------------------log4j------------------------------------
@ExtendWith(TestResultLog.class)
//------------------------------------5.Adım------------------------------------
public class BaseTest {

    WebDriver Driver;

    @BeforeAll
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        Driver = new ChromeDriver();
        Driver.get("https://www.n11.com");
        Driver.manage().window().maximize();
    }
}
