package Foxtrot.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class FoxtrorSearchResult extends BasePage{
    public FoxtrorSearchResult(WebDriver driver) {
        super(driver);
    }

    private static final String WASH3676 = "//div[@data-id='3676']//a[@class='card__title']";

    private static final String PRODUCTS = "//div[contains(@class,'card js-card sc-product')]";

    private static final String PRICE = "//div[@data-id='3676']//div[@class='card-price']";

    private String price;

    public String getPrice(){
        return this.price;
    }

    public void getPriceText(){
        price = getElementByXpath(PRICE).getText();
    }

    public static final String PRODUCT_COUNT_MASAGE = "//label[@id='product-count-message']";

    public WebElement productCountMasage(){
        return getElementByXpath(PRODUCT_COUNT_MASAGE);
    }

    public WebElement wash3676(){
        return getElementByXpath(WASH3676);
    }

    private String count;
    private String countOfOppo;

    public String getCount(){
        return this.count;
    }

    public String getCountTextForOppo(){
        String[] count = getElementByXpath(PRODUCT_COUNT_MASAGE).getText().split(" ");
        return count[0];
    }

    public void setCountText(String filterName){
        waitUntilTitleContainsText(filterName);
        count = getElementByXpath(PRODUCT_COUNT_MASAGE).getText().substring(0,2);
    }

    public void setCountTextForOppo(String filterCount){
        waitUntilTitleContainsText(filterCount);
    }






    public List<WebElement> getProducts() {
        return getElementsByXpath(PRODUCTS);
    }


}
