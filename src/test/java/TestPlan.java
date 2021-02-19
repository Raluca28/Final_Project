import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    private static void NavigateToSecondPage() {
        driver.get(Utils.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
    }

    private static void NavigateToThirdPage() {
        SecondPage secondPage = new SecondPage(driver);
        secondPage.clickOnProduct();
    }

    private static void NavigateToFourthPage() {
        ThirdPage thirdPage = new ThirdPage(driver);
        thirdPage.clickOnFavorites();
        thirdPage.clickOnFavoritesList();
    }

    private static void NavigateToFifthPage() {
        FourthPage fourthPage = new FourthPage(driver);
        fourthPage.clickOnCart();
        fourthPage.clickOnShoppingList();

    }


    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Click on a genius")
    public static void testClickOnGenius() {
        driver.get(Utils.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.geniusButton();
    }

    @Test(testName = "Click on a emag")
    public static void testClickOnEmag() {
        driver.get(Utils.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.geniusButton();
        webForm.emagButton();
    }

    @Test(testName = "Search a product")
    public static void searchForProduct() {
        driver.get(Utils.BASE_URL);
        SearchPage webForm = new SearchPage(driver);
        webForm.geniusButton();
        webForm.emagButton();
        webForm.populateSearchField();
        webForm.searchItemUsingButton();
    }

    @Test(testName = "Click on a product")
    public static void testClickOnProduct() {
        NavigateToSecondPage();
        SecondPage secondPage = new SecondPage(driver);
        secondPage.clickOnProduct();
    }

    @Test(testName = "Click on a favorites")
    public static void testClickOnFavorites() {
        NavigateToSecondPage();
        NavigateToThirdPage();
        ThirdPage thirdPage = new ThirdPage(driver);
        thirdPage.clickOnFavorites();
    }

    @Test(testName = "Click on a favorites list")
    public static void testClickOnFavoritesList() {
        NavigateToSecondPage();
        NavigateToThirdPage();
        ThirdPage thirdPage = new ThirdPage(driver);
        thirdPage.clickOnFavorites();
        thirdPage.clickOnFavoritesList();

    }

    @Test(testName = "Click on a cart")
    public static void testClickOnCart() {
        NavigateToSecondPage();
        NavigateToThirdPage();
        NavigateToFourthPage();
        FourthPage fourthPage = new FourthPage(driver);
        fourthPage.clickOnCart();
    }

    @Test(testName = "Click on a shopping list")
    public static void testClickOnSoppingList() {
        NavigateToSecondPage();
        NavigateToThirdPage();
        NavigateToFourthPage();
        FourthPage fourthPage = new FourthPage(driver);
        fourthPage.clickOnCart();
        fourthPage.clickOnShoppingList();
    }

    @Test(testName = "Click on cancel")
    public static void testClickOnCancel() {
        NavigateToSecondPage();
        NavigateToThirdPage();
        NavigateToFourthPage();
        NavigateToFifthPage();
        FifthPage fifthPage = new FifthPage(driver);
        fifthPage.clickOnCancel();
    }

    @Test(testName = "Click on store button")
    public static void testClickOnStoreButton() {
        NavigateToSecondPage();
        NavigateToThirdPage();
        NavigateToFourthPage();
        NavigateToFifthPage();
        FifthPage fifthPage = new FifthPage(driver);
        fifthPage.clickOnCancel();
        fifthPage.clickOnStore();
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }


}