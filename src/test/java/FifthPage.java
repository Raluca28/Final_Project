import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FifthPage extends PageObject {

    @FindBy(xpath = " /html/body/div[1]/div/div[1]/form/div/div[3]/div/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]")
    private WebElement cancelButton;

    @FindBy(xpath = "//*[@id=\"empty-cart\"]/div[3]/a[1]")
    private WebElement storeButton;


    public FifthPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCancel() {
        Utils.WaitForElement(3);
        this.cancelButton.click();
    }

    public void clickOnStore() {
        Utils.WaitForElement(3);
        this.storeButton.click();
    }
}
