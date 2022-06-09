package WedTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazEkoStorePageMilkEggs extends WaterMelonPage {

    public ZakazEkoStorePageMilkEggs(WebDriver driver) {
        super(driver);
    }



    public WebElement yogurtPage(){
        return driver.findElement(By.xpath("//img[@alt='Йогурт']"));
    }
}
