package Foxtrot.Tests;

import Foxtrot.Pages.FoxtrotForGamerCategoriePage;
import Foxtrot.Pages.FoxtrotHomePage;
import Foxtrot.Pages.FoxtrotPsFivePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FoxtrotPSFive extends TestInit{
    @Test
    public void playStationQuantity(){
        FoxtrotHomePage foxtrotHomePage = new FoxtrotHomePage(driver);
        FoxtrotPsFivePage foxtrotPsFivePage = new FoxtrotPsFivePage(driver);
        FoxtrotForGamerCategoriePage foxtrotForGamerCategoriePage = new FoxtrotForGamerCategoriePage(driver);
        foxtrotHomePage.openFoxStore();
        fullWindow();
        foxtrotHomePage.forGamerCategorie().click();
        foxtrotForGamerCategoriePage.psFiveCategoriePegeBtn().click();
        Assert.assertTrue(foxtrotPsFivePage.PsQuantity().size() > 0);
        System.out.println(foxtrotPsFivePage.PsQuantity().size());
    }
}
