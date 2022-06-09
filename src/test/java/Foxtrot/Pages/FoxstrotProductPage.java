package Foxtrot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxstrotProductPage extends BasePage{
    public FoxstrotProductPage(WebDriver driver) {
        super(driver);
    }

    private static final String PRICE = "//div[@class='product-box__main_price']";

    private String price;

    public String getPrice(){
        return this.price;
    }

    public void getPriceText(){
        price = getElementByXpath(PRICE).getText();
    }

    private static final String PRODUCT_MARiO_LEGO = "//div[@class='product-menu']//div[@data-id='638']";

    public WebElement buyBtnHead(){
        return getElementByXpath(PRODUCT_MARiO_LEGO);
    }
}
