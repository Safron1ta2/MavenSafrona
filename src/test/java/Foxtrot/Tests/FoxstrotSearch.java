package Foxtrot.Tests;
import Foxtrot.Pages.FoxstrotProductPage;
import Foxtrot.Pages.FoxtrorSearchResult;
import Foxtrot.Pages.FoxtrotHomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class FoxstrotSearch extends TestInit{



    @Test
    public void testWievElement(){
        FoxtrotHomePage foxtrotHomePage = new FoxtrotHomePage(driver);
        FoxtrorSearchResult foxtrorSearchResult = new FoxtrorSearchResult(driver);
        FoxstrotProductPage foxstrotProductPage = new FoxstrotProductPage(driver);
        foxtrotHomePage.openFoxStore();
        fullWindow();
        foxtrotHomePage.searchSpace().sendKeys("Пральна Машина\n");
        String productPriceSearchPage = foxtrorSearchResult.getPrice();
        String productPriceProductPage = foxstrotProductPage.getPrice();
        //FoxtrorSearchResult foxtrorSearchResult = foxtrotHomePage.search("Пральна машина");
        Assert.assertTrue(foxtrorSearchResult.getProducts().size()>10);
        foxtrorSearchResult.getPriceText();
        foxtrorSearchResult.wash3676().click();
        foxstrotProductPage.getPriceText();
        Assert.assertEquals(productPriceProductPage, productPriceSearchPage);

    }
}
