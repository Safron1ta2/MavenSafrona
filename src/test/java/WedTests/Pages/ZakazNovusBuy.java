package WedTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazNovusBuy extends WaterMelonPage{
    public ZakazNovusBuy(WebDriver driver) {
        super(driver);
    }

    public WebElement buyNemiroffDelikat(){
        return driver.findElement(By.xpath("//div[@class='jsx-3985834530 BigProductCardTopInfo__addToCartButtons']//button"));
    }

    public WebElement deliveryByNP(){
        return driver.findElement(By.xpath("//li[@data-testid='deliveryType_novaPoshta']"));
    }


}
