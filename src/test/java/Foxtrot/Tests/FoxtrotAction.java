package Foxtrot.Tests;
import Foxtrot.Pages.CatalogView;
import Foxtrot.Pages.FoxtrorSearchResult;
import Foxtrot.Pages.FoxtrotHomePage;
import Foxtrot.Pages.FoxtrotMonitorPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import javax.swing.*;

public class FoxtrotAction extends TestInit{

    @Test
    public void testAction(){
        FoxtrotHomePage foxtrotHomePage = new FoxtrotHomePage(driver);
        FoxtrorSearchResult foxtrorSearchResult = new FoxtrorSearchResult(driver);
        CatalogView catalogView = new CatalogView(driver);
        FoxtrotMonitorPage foxtrotMonitorPage = new FoxtrotMonitorPage(driver);
        foxtrotHomePage.openFoxStore();
        fullWindow();
        foxtrotHomePage.moveToPС();
        catalogView.monitor().click();
        foxtrotMonitorPage.filtrBtnSamsung().click();
        foxtrotMonitorPage.okBtn().click();
        foxtrorSearchResult.getCountText("SAMSUNG");
        foxtrotMonitorPage.getMonitors().size();
        Assert.assertEquals(Integer.parseInt(foxtrorSearchResult.getCount()), foxtrotMonitorPage.getMonitors().size());

        System.out.println(foxtrorSearchResult.getCount());
        System.out.println(foxtrotMonitorPage.getMonitors().size());







    }

}
