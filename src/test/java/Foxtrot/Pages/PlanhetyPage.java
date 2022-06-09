package Foxtrot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlanhetyPage extends BasePage{
    public PlanhetyPage(WebDriver driver) {
        super(driver);
    }

    private static final String PLANSHET1886_BUY_BTN = "//div[@class='card__buttons']//div[@data-id='1886']";
    private static final String PLANSHET1955_BUY_BTN = "//div[@class='card__buttons']//div[@data-id='1893']";
    private static final String PLANSHET2080_BUY_BTN = "//div[@class='card__buttons']//div[@data-id='2080']";

    public WebElement planshet1886BuyBtn(){
        return getElementByXpath(PLANSHET1886_BUY_BTN);
    }
    public WebElement planshet1955Buy_Btn(){
       return getElementByXpath(PLANSHET1955_BUY_BTN);
    }
    public WebElement planshet2080BuyBtn(){
        return getElementByXpath(PLANSHET2080_BUY_BTN);
    }
}
