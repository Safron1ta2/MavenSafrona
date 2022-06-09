package WedTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazEkoMainPage extends WaterMelonPage{
    public ZakazEkoMainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement storePageMilkEggsBtn(){
        return driver.findElement(By.xpath("//li[@title='Молочне і яйця']"));
    }
}
