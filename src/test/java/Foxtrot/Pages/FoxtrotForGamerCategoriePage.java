package Foxtrot.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxtrotForGamerCategoriePage extends BasePage{
    public FoxtrotForGamerCategoriePage(WebDriver driver) {
        super(driver);
    }

    private static final String PS5 = "//div[@class='category__item-title js-toggle-accordion']//a[contains(@href,'ps5')]";

    public WebElement psFiveCategoriePegeBtn(){
        return getElementByXpath(PS5);
    }
}
