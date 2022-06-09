package Foxtrot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxtrotCartPage extends BasePage{
    public FoxtrotCartPage(WebDriver driver) {
        super(driver);
    }

    private static final String PLUS_BTN_MARIO_LEGO = "//div[@data-id='638']//span[@data-type='plus']";
    private static final String PLUS_BTN_PLANSHET2080 = "//div[@data-id='2080']//span[@data-type='plus']";
    private static final String PLUS_BTN_PLANSHET1955 = "//div[@data-id='1893']//span[@data-type='plus']";
    private static final String PLUS_BTN_PLANSHET1886 = "//div[@data-id='1886']//span[@data-type='plus']";

    public WebElement plusBtnLegoMario(){
        return getElementByXpath(PLUS_BTN_MARIO_LEGO);
    }
    public WebElement plusBtnPlanshet1886(){
        return getElementByXpath(PLUS_BTN_PLANSHET1886);
    }
    public WebElement plusBtnPlanshet1955(){
        return getElementByXpath(PLUS_BTN_PLANSHET1955);
    }
    public WebElement plusBtnPlanshet2080(){
        return getElementByXpath(PLUS_BTN_PLANSHET2080);
    }
}
