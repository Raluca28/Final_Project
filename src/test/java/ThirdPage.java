import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage extends PageObject {

    @FindBy(css = ".page-skin-inner > div > div:nth-child(2) > div > div > div:nth-child(2) > form > div:last-of-type > button:last-of-type")
    private WebElement favoritesButton;

    @FindBy(xpath = "//*[@id=\"my_wishlist\"]")
    private WebElement favoritesList;


    public ThirdPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnFavorites() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", this.favoritesButton);
        Utils.WaitForElement(3);
        this.favoritesButton.click();
    }

    public void clickOnFavoritesList() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", this.favoritesList);
        Utils.WaitForElement(3);
        this.favoritesList.click();
    }


}