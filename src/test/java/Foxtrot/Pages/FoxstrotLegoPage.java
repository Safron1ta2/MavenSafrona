package Foxtrot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxstrotLegoPage extends BasePage {
    public FoxstrotLegoPage(WebDriver driver) {
        super(driver);
    }

    private static final String GOODS_MARIO_LEGO = "//div[@data-id='638']//div[contains(@data-title,'LEGO Super Mario')]";

    public WebElement legoMario(){
        return getElementByXpath(GOODS_MARIO_LEGO);
    }
}
