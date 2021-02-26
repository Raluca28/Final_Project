import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageObject {
    private final String SEARCH_STRING = "samsung" ;

    @FindBy(css = ".searchbox-input div input:nth-child(2)" )
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"masthead\"]/div/div/div[2]/div/form/div[1]/div[2]/button[2]/i")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id='auxiliary']/div/div/ul[2]/li[1]/a")
    private WebElement geniusButton;

    @FindBy(xpath = "//*[@id=\"main-container\"]/div[2]/div")
    private WebElement mottoHeader;

    @FindBy(xpath = "//*[@id=\"masthead\"]/div/div/div[1]/a/img")
    private WebElement emagButton;


    public SearchPage(WebDriver driver) {

        super(driver);
    }

    public void populateSearchField() {
        Utils.WaitForElement(3);
        this.searchField.sendKeys(SEARCH_STRING);
    }

    public void searchItemUsingButton() {
        Utils.WaitForElement(3);
        this.searchButton.click();
    }

    public void geniusButton() {
        Utils.WaitForElement(3);
        this.geniusButton.click();
    }

    public String getMottoHeader() {
        Utils.WaitForElement(3);
        return this.mottoHeader.getText();
    }

    public void emagButton() {
        Utils.WaitForElement(3);
        this.emagButton.click();
    }
}
