package WedTests;

import WedTests.Pages.ZakazHomePage;
import WedTests.Pages.ZakazNovusBuy;
import WedTests.Pages.ZakazNovusMainPage;
import WedTests.Pages.ZakazNovusResultSearchPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ZakazNovus extends TestInit {

    @Test
    public void buyVodka(){
        openZakaz();
        ZakazHomePage zakazHomePage = new ZakazHomePage(driver);
        ZakazNovusMainPage zakazNovusMainPage = new ZakazNovusMainPage(driver);
        ZakazNovusResultSearchPage zakazNovusResultSearch = new ZakazNovusResultSearchPage(driver);
        ZakazNovusBuy zakazNovusBuy = new ZakazNovusBuy(driver);
        zakazHomePage.openNovus().click();
        zakazNovusMainPage.getSearch().sendKeys("Nemiroff\n");
        sleep(3);
        zakazNovusResultSearch.acceptAge().click();
        zakazNovusResultSearch.nemiroffDelikat().click();
        sleep(2);
        zakazNovusBuy.buyNemiroffDelikat().click();
        sleep(3);
        zakazNovusBuy.deliveryByNP().click();
    }
}
