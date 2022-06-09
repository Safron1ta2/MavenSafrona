package Foxtrot.Tests;

import Foxtrot.Pages.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Fox extends TestInit {

    @Test
    public void buySomething() {
        FoxtrotHomePage foxtrotHomePage = new FoxtrotHomePage(driver);
        FoxtrotWievObjects wievObjects = new FoxtrotWievObjects(driver);
        FoxtrotPhoneCategoriePage foxtrotPhoneCategoriePage = new FoxtrotPhoneCategoriePage(driver);
        PlanhetyPage planhetyPage = new PlanhetyPage(driver);
        FoxtrotCartPage foxtrotCartPage = new FoxtrotCartPage(driver);
        foxtrotHomePage.openFoxStore();
        fullWindow();
        foxtrotHomePage.pсCategorie().click();
        foxtrotPhoneCategoriePage.planshetyPage().click();
        planhetyPage.planshet1886BuyBtn().click();
        wievObjects.closeCartWindowF().click();
        planhetyPage.planshet1955Buy_Btn().click();
        wievObjects.closeCartWindowF().click();
        planhetyPage.planshet2080BuyBtn().click();
        wievObjects.goCart().click();
        for (int i = 0; i < 4; i++) {
            foxtrotCartPage.plusBtnPlanshet1955().click();
        }
        for (int i = 0; i < 4; i++) {
            foxtrotCartPage.plusBtnPlanshet2080().click();
        }
        for (int i = 0; i < 4; i++) {
            foxtrotCartPage.plusBtnPlanshet1886().click();
        }

    }



}
