package WedTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazEkoStorePageMilkEgsYogurt extends WaterMelonPage{
    public ZakazEkoStorePageMilkEgsYogurt(WebDriver driver) {
        super(driver);
    }


    public WebElement chooseYogurtLocoMocoAP(){
        return driver.findElement(By.xpath("//a[@data-productkey='04823065711027']"));
    }

}
