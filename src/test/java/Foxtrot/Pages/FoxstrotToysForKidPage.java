package Foxtrot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxstrotToysForKidPage extends BasePage {
    public FoxstrotToysForKidPage(WebDriver driver) {
        super(driver);
    }

    private static final String LEGO_CATEGORIE = "//div[@class='category__item-title js-toggle-accordion-portal2']//a[contains(@href,'lego')]";

    public WebElement legoConstructor(){
        return getElementByXpath(LEGO_CATEGORIE);
    }
}
