import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FourthPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"list-of-favorites\"]/div/div[2]/div[2]/div[2]/div[4]/div[1]/form/button")
    private WebElement cartButton;

    @FindBy(xpath = "//*[@id=\"my_cart\"]")
    private WebElement shoppingList;


    public FourthPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCart() {
        Utils.WaitForElement(3);
        this.cartButton.click();
    }

    public void clickOnShoppingList() {
        Utils.WaitForElement(3);
        this.shoppingList.click();
    }

}

