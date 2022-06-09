package Foxtrot.Tests;
import Foxtrot.Pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestForiInCart extends TestInit {

    @Test
    public void testCart(){
        FoxtrotHomePage foxtrotHomePage = new FoxtrotHomePage(driver);
        FoxstrotKidCategoriePage foxstrotKidCategoriePage = new FoxstrotKidCategoriePage(driver);
        FoxstrotToysForKidPage foxstrotToysForKidPage = new FoxstrotToysForKidPage(driver);
        FoxstrotLegoPage foxstrotLegoPage = new FoxstrotLegoPage(driver);
        FoxstrotProductPage foxstrotProductPage = new FoxstrotProductPage(driver);
        FoxtrotWievObjects foxtrotWievObjects = new FoxtrotWievObjects(driver);
        FoxtrotCartPage foxtrotCartPage = new FoxtrotCartPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        foxtrotHomePage.openFoxStore();
        fullWindow();
        foxtrotHomePage.categorieKids().click();
        foxstrotKidCategoriePage.toysForKid().click();
        foxstrotToysForKidPage.legoConstructor().click();
        foxstrotLegoPage.legoMario().click();
        js.executeScript("window.scrollBy(0,200)","");
        foxstrotProductPage.buyBtnHead().click();
        foxtrotWievObjects.goCart().click();
        for (int i = 0; i < 2; i++) {
            foxtrotCartPage.plusBtnLegoMario().click();
        }
    }
}
