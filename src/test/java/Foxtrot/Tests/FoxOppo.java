package Foxtrot.Tests;

import Foxtrot.Pages.CatalogView;
import Foxtrot.Pages.FoxtrorSearchResult;
import Foxtrot.Pages.FoxtrotHomePage;
import Foxtrot.Pages.OppoCategoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FoxOppo extends TestInit {
    @Test
    public void test(){
        FoxtrotHomePage foxtrotHomePage = new FoxtrotHomePage(driver);
        CatalogView catalogView = new CatalogView(driver);
        FoxtrorSearchResult foxtrorSearchResult = new FoxtrorSearchResult(driver);
        OppoCategoryPage oppoCategoryPage = new OppoCategoryPage(driver);
        foxtrotHomePage.openFoxStore();
        fullWindow();
        foxtrotHomePage.moveToPhones();
        catalogView.oppo().click();
        foxtrorSearchResult.setCountTextForOppo("Смартфони Oppo");
        System.out.println(foxtrorSearchResult.getCountTextForOppo());
        System.out.println(oppoCategoryPage.getOppoPhones().size());
        Assert.assertEquals(Integer.parseInt(foxtrorSearchResult.getCountTextForOppo()), oppoCategoryPage.getOppoPhones().size());
    }
}
