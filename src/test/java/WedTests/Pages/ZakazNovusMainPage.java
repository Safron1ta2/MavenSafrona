package WedTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazNovusMainPage extends WaterMelonPage{
    public ZakazNovusMainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearch() {
        return driver.findElement(By.xpath("//input[@type='search']"));
    }
}
