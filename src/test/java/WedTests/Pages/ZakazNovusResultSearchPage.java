package WedTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazNovusResultSearchPage extends WaterMelonPage {
    public ZakazNovusResultSearchPage(WebDriver driver) {
        super(driver);

    }

    public WebElement acceptAge(){
        return driver.findElement(By.xpath("//button[@data-testid='buttonYes']"));
    }

    public WebElement nemiroffDelikat(){
        return driver.findElement(By.xpath("//img[@alt='Горілка Nemiroff Delikat 40% 200мл']"));
    }

    public WebElement skyVodka(){
        return driver.findElement(By.xpath("//img[@alt='Горілка Skyy Vodka 0.7л']"));
    }
}
