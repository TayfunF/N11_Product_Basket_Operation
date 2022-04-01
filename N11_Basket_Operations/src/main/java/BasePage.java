import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

    WebDriver Driver;

    public BasePage(WebDriver Driver) {
        this.Driver = Driver;
    }

    public WebElement Find(By Locator) {
        return Driver.findElement(Locator);
    }

    public List<WebElement> FindAll(By Locator) {
        return Driver.findElements(Locator);
    }

    public void Click(By Locator) {
        Find(Locator).click();
    }

    public void FindAndWrite(By Locator, String Text) {
        Find(Locator).sendKeys(Text);
    }

    public boolean IsDisplayed(By Locator) {
        return Find(Locator).isDisplayed();
    }

    public void ScrollOnPage(Integer x, Integer y) {
        JavascriptExecutor Js = (JavascriptExecutor) Driver;
        Js.executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    public void Waiting(By Locator, Integer Seconds) {
        WebDriverWait Wait = new WebDriverWait(Driver, Duration.ofSeconds(Seconds));
        Wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
    }
}
