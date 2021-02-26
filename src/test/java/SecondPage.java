import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends PageObject {

    @FindBy(css = "#card_grid > div:nth-child(1) .thumbnail-wrapper")
    private WebElement searchProduct;



    public SecondPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnProduct() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", this.searchProduct);
        Utils.WaitForElement(3);
        this.searchProduct.click();
    }



}
