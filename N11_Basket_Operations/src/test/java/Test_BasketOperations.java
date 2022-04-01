import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_BasketOperations extends BaseTest {

    HomePage HomePage;
    ProductsPage ProductsPage;
    ProductDetailPage ProductDetailPage;
    CardPage CardPage;

    @Test
    @Order(1)
    public void Search_Product() {
        HomePage = new HomePage(Driver);
        HomePage.SearchProduct.Search("Laptop");
        ProductsPage = new ProductsPage(Driver);
        Assertions.assertTrue(ProductsPage.IsOnProductsPage(),
                "Not On Products Page");
    }

    @Test
    @Order(2)
    public void Select_Product() {
        ProductsPage.SelectProduct();
        ProductDetailPage = new ProductDetailPage(Driver);
        Assertions.assertTrue(ProductDetailPage.IsOnDetailPage(),
                "Not Detail Page");
    }

    @Test
    @Order(3)
    public void Add_To_Card() {
        ProductDetailPage.AddToCard();
//        Assertions.assertTrue(ProductDetailPage.IsAddToCard(),
//                "Card wasn't Increased");
    }

    @Test
    @Order(4)
    public void Go_To_Card() {
        CardPage = new CardPage(Driver);
        CardPage.RemoveProduct();
//        Assertions.assertTrue(CardPage.IsCheckIfAdded(),
//                "Not Added");
    }


}
