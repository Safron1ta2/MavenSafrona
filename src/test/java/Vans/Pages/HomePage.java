package Vans.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private String bgc;
    private String c;
    private String btnsColor;

    private static final String WOMEN_BTN = "//a[@id='topnav-item-1342723']";
    private static final String OK_COOKIE = "//button[@id='onetrust-accept-btn-handler']";
    private static final String HEADER_BTNS = "//ul[@role='menubar']/li";


    public WebElement okCookieBtn(){
        return getElementByXpath(OK_COOKIE);
    }


    public void openVans(){
        driver.get("https://www.vans.co.uk/");
    }

    public void moveToWomenBtn(){
        moveCursor(WOMEN_BTN);
    }
    public void moveToEveryBtns(int locator){
        moveCursor(String.valueOf(getBtns().get(locator)));
    }

    public String getBtnsColorBefore(int locator){
        return btnsColor = String.valueOf(getElementsByXpath(HEADER_BTNS));
    }

    public String getColorBefore(){
        return bgc = getElementByXpath(WOMEN_BTN).getCssValue("background-color");
    }
    public String getColorAfter(){
        return c = getElementByXpath(WOMEN_BTN).getCssValue("color");
    }


    public List<WebElement> getBtns() {
        return getElementsByXpath(HEADER_BTNS);
    }




}

