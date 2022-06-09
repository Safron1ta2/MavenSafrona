package WedTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazHomePage extends WaterMelonPage {


    public ZakazHomePage (WebDriver driver) {
        super(driver);
    }

    public WebElement openNovus() {
        return driver.findElement(By.xpath("//img[@alt='NOVUS']"));
    }

    public WebElement openEko(){
       return driver.findElement(By.xpath("//img[@alt='EKO']"));
    }

}
