package Foxtrot.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxtrotHomePage extends BasePage {

    public FoxtrotHomePage(WebDriver driver) {
        super(driver);
    }

    public void openFoxStore() {
        driver.get("https://www.foxtrot.com.ua/uk");
    }

    private static final String CATEGORIE_ALL_FOR_KIDS = "//main[@id='main-page']//li[@data-category='32029']";
    private static final String CART_ICON = "//i[@id='basket-icon']";
    private static final String SEARCH_SPACE = "//input[@type='search']";
    private static final String SEARCH_BTN = "//input[@class='header-search__button evinent-search-button']";
    private static final String HEAD_CATALOG_BTN = "//a[@class='js-hover-catalog']";
    private static final String HEAD_COMPARISON_BTN = "//div[@class='header-tooltip unselectable']";

    private static final String PС_CATEGORIE = "//div[@class='main-page-container']//li[@data-category='32021']";
    private static final String GAMER_CATEGORIE = "//div[@class='main-page-container']//li[@data-category='32111']";

    public WebElement categorieKids(){
        return driver.findElement(By.xpath(CATEGORIE_ALL_FOR_KIDS));
    }

    public WebElement cartBtn(){
        return driver.findElement(By.xpath(CART_ICON));
    }
    public WebElement searchSpace(){
        return driver.findElement(By.xpath(SEARCH_SPACE));
    }
    public WebElement searchBtn(){
        return driver.findElement(By.xpath(SEARCH_BTN));
    }
    public WebElement comparisonBtn(){
        return driver.findElement(By.xpath(HEAD_COMPARISON_BTN));
    }
    public WebElement headCatalogBtn(){
        return driver.findElement(By.xpath(HEAD_CATALOG_BTN));
    }

    public WebElement pсCategorie(){
        return getElementByXpath(PС_CATEGORIE);
    }
    public WebElement forGamerCategorie(){
        return getElementByXpath(GAMER_CATEGORIE);
    }

    public void moveToPС(){
        moveCursor(PС_CATEGORIE);
    }

    public FoxtrorSearchResult search(String objectForSearch){
        searchSpace().sendKeys(objectForSearch);
        searchBtn().click();
        return new FoxtrorSearchResult(driver);

    }
}


