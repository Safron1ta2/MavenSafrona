package WedTests;

import WedTests.Pages.ZakazHomePage;
import WedTests.Pages.ZakazNovusBuy;
import WedTests.Pages.ZakazNovusMainPage;
import WedTests.Pages.ZakazNovusResultSearchPage;
import org.testng.annotations.Test;

public class Opennovus extends TestInit {

    @Test
    public void runViski(){
        openZakaz();
        ZakazHomePage zakazHomePage = new ZakazHomePage(driver);
        ZakazNovusMainPage zakazNovusMainPage = new ZakazNovusMainPage(driver);
        ZakazNovusResultSearchPage zakazNovusResultSearch = new ZakazNovusResultSearchPage(driver);
        ZakazNovusBuy zakazNovusBuy = new ZakazNovusBuy(driver);
        zakazHomePage.openNovus().click();
        sleep(3);
        zakazNovusMainPage.getSearch().sendKeys(" Skyy Vodka  \n");
        sleep(3);
        zakazNovusResultSearch.acceptAge().click();
        sleep(3);
        zakazNovusResultSearch.skyVodka().click();
        sleep(3);
        zakazNovusBuy.deliveryByNP().click();
    }
}