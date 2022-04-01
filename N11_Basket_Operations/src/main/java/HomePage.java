import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    SearchProduct SearchProduct;

    public HomePage(WebDriver Driver) {
        super(Driver);
        SearchProduct = new SearchProduct(Driver);
    }

    public void SearchProduct(){
        this.SearchProduct = SearchProduct;
    }

}
