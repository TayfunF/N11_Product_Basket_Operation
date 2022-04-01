import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardPage extends BasePage {

    By ModalLocator = By.xpath(".//*[@id='userKvkkModal']/div[1]/div[2]/span");
    By RemoveProductLocator = By.className("removeProd");
    By CardEmptyTextLocator = By.className("cartEmptyText");

    public CardPage(WebDriver Driver) {
        super(Driver);
    }

    public void RemoveProduct() {
        Waiting(ModalLocator, 5);
        Click(ModalLocator);
        Waiting(RemoveProductLocator, 5);
        Click(RemoveProductLocator);

    }
//
//    public boolean IsCheckIfAdded() {
//        return IsDisplayed(CardEmptyTextLocator);
//    }
}
