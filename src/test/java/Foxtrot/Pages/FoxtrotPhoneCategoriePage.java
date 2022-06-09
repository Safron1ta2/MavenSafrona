package Foxtrot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxtrotPhoneCategoriePage extends BasePage {
    public FoxtrotPhoneCategoriePage(WebDriver driver) {
        super(driver);
    }

    private static final String PLANSHETY_PAGE = "//div[@class='category__item-title js-toggle-accordion']//a[contains(@href, 'planshety')]";

    public WebElement planshetyPage(){
        return getElementByXpath(PLANSHETY_PAGE);
    }
}
