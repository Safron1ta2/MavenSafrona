package Foxtrot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxstrotKidCategoriePage extends BasePage {

    public FoxstrotKidCategoriePage(WebDriver driver) {
        super(driver);
    }

    public static final String TOYS_CATEGORIE_BTN = "//div[@class='category__item-title js-toggle-accordion']//a[contains(@href,'igrushki')]";

    public WebElement toysForKid(){
        return getElementByXpath(TOYS_CATEGORIE_BTN);
    }
}
