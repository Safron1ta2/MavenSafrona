package Foxtrot.Tests;

import Foxtrot.Pages.FoxtrotHomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FoxtrotTest extends TestInit {

    @Test
    public void test() {
        FoxtrotHomePage foxtrotHomePage = new FoxtrotHomePage(driver);
        foxtrotHomePage.openFoxStore();
        fullWindow();
        Assert.assertTrue(foxtrotHomePage.searchSpace().isDisplayed());
        Assert.assertTrue(foxtrotHomePage.searchBtn().isDisplayed());
        Assert.assertTrue(foxtrotHomePage.comparisonBtn().isDisplayed());
        Assert.assertTrue(foxtrotHomePage.headCatalogBtn().isDisplayed());

    }
}
