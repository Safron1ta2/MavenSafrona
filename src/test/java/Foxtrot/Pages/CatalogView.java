package Foxtrot.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatalogView extends BasePage {
    public CatalogView(WebDriver driver) {
        super(driver);
    }

    private static final String MONITOR = "//main[@id='main-page']//a[contains(@href,'monitory.html')]";
    private static final String OPPO = "//div[@class='main-page-container']//a[contains(@href,'oppo.html')]";

    public WebElement monitor(){
        return getElementByXpath(MONITOR);
    }

    public WebElement oppo(){
        return getElementByXpath(OPPO);
    }

}
