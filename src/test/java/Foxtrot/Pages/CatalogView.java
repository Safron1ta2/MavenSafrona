package Foxtrot.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogView extends BasePage {
    public CatalogView(WebDriver driver) {
        super(driver);
    }

    private static final String MONITOR = "//main[@id='main-page']//a[contains(@href,'monitory.html')]";

    public WebElement monitor(){
        return getElementByXpath(MONITOR);
    }
}
