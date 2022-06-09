package WedTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazEkoBuy extends WaterMelonPage{
    public ZakazEkoBuy(WebDriver driver) {
        super(driver);
    }

    public WebElement adressBtn(){
        return driver.findElement(By.xpath("//div[@data-marker-store-id='default']//span[contains(@class,'label')]"));
    }

    public WebElement deliveryTypePickup(){
        return driver.findElement(By.xpath("//li[@data-testid='deliveryType_pickup']"));
    }

    public WebElement pickupLocation(){
        return  driver.findElement(By.xpath("//div[@data-marker='Locality']"));
    }

    public WebElement chooseLocationKyiv(){
        return driver.findElement(By.xpath("//div[@id='react-select-3-option-3']"));
    }

    public WebElement chooseMarketKyivJulianska(){
        return driver.findElement(By.xpath("//input[@id='pickup-city-store-48280187']"));
    }

    public WebElement backToShop(){
        return driver.findElement(By.xpath("//button[@data-testid='To shopping']"));
    }
}
