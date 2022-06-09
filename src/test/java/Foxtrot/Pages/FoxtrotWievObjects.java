package Foxtrot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxtrotWievObjects extends BasePage {
    public FoxtrotWievObjects(WebDriver driver) {
        super(driver);
    }

    private static final String GO_CART_BTN = "//div[@class='header-tooltip-footer__col']//a[contains(@href,'cart.html')]";
    private static final String CLOSE_CART_BTN = "//i[@id='cartTooltipClose']";


    public WebElement closeCartWindowF() {
        return getElementByXpath(CLOSE_CART_BTN);
    }

    public WebElement goCart(){
        return getElementByXpath(GO_CART_BTN);
    }
}