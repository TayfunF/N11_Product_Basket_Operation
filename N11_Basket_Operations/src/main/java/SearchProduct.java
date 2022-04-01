import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProduct extends BasePage {

    By SearchProductLocator = By.id("searchData");
    By SearchButtonLocator = By.className("searchBtn");

    public SearchProduct(WebDriver Driver) {
        super(Driver);
    }

    public void Search(String Text) {
        FindAndWrite(SearchProductLocator, Text);
        Click(SearchButtonLocator);
    }
}
