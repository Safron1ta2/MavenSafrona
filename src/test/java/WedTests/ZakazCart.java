package WedTests;
import WedTests.Pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ZakazCart  extends TestInit {

    @Test
    public void buySomething(){
        openZakaz();
        ZakazHomePage zakazHomePage = new ZakazHomePage(driver);
        ZakazEkoMainPage zakazEkoMainPage = new ZakazEkoMainPage(driver);
        ZakazEkoStorePageMilkEggs zakazEkoMilkEggs = new ZakazEkoStorePageMilkEggs(driver);
        ZakazEkoBuy zakazEkoBuy = new ZakazEkoBuy(driver);
        ZakazEkoStorePageMilkEgsYogurt zakazEkoYogurt = new ZakazEkoStorePageMilkEgsYogurt(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        zakazHomePage.openEko().click();
        zakazEkoMainPage.storePageMilkEggsBtn().click();
        sleep(3);
        zakazEkoMilkEggs.yogurtPage().click();
        sleep(4);
        zakazEkoBuy.adressBtn().click();
        sleep(1);
        zakazEkoBuy.deliveryTypePickup().click();
        zakazEkoBuy.pickupLocation().click();
        zakazEkoBuy.chooseLocationKyiv().click();
        zakazEkoBuy.chooseMarketKyivJulianska().click();
        zakazEkoBuy.backToShop().click();
        js.executeScript("window.scrollBy(0,400)", "");

    }


}
