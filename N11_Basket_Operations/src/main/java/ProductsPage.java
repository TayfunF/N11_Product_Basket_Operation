import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    By FreeShippingLocator = By.id("freeShippingOption");
    By PaginationLocator = By.className("pagination");
    By PaginationNumberFourLocator = By.xpath(".//*[@class='pagination']/a[4]");
    By ProductNameLocator = By.className("productName");

    public ProductsPage(WebDriver Driver) {
        super(Driver);
    }

    public boolean IsOnProductsPage() {
        return IsDisplayed(FreeShippingLocator);
    }

    public void SelectProduct() {
        ScrollOnPage(0, 5500);
        Waiting(PaginationLocator, 5);
        Click(PaginationNumberFourLocator);
        Waiting(ProductNameLocator, 5);
        Click(ProductNameLocator);
    }
}
