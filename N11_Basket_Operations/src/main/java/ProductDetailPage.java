import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By ShippingIconLocator = By.className("shipping-icon");
    By AddToCardLocator = By.className("product-add-cart");
    By CardProductCountLocator = By.className("basketTotalNum");
    By CardHolderLocator = By.className("myBasketHolder");

    public ProductDetailPage(WebDriver Driver) {
        super(Driver);
    }

    public boolean IsOnDetailPage() {
        Waiting(ShippingIconLocator, 5);
        return IsDisplayed(ShippingIconLocator);
    }

    public void AddToCard() {
        Click(AddToCardLocator);
        Waiting(CardProductCountLocator, 5);
        Click(CardHolderLocator);
    }

//    public boolean IsAddToCard() {
//        Waiting(CardProductCountLocator, 5);
//        return IsDisplayed(CardProductCountLocator);
//    }
}
