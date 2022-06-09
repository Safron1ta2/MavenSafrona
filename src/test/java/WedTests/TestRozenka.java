package WedTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestRozenka extends TestInit {
    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void buy(){
        driver.get("https://rozetka.com.ua/ua/");
        driver.findElement(By.xpath("//div[@class='fat-wrap']//*[contains(text(),'Смартфони, ТВ і електроніка')]")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@class='tile-cats']//a[contains(@href, 'all-tv')]")).click();
        driver.findElement(By.xpath("//app-buy-button[@goods_id='297615798']")).click();
        driver.findElement(By.xpath("//app-buy-button[@goods_id='289010833']")).click();
        driver.findElement(By.xpath("//app-buy-button[@goods_id='259024991']")).click();
        driver.findElement(By.xpath("//button[@class='header__button ng-star-inserted header__button--active']")).click();
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.xpath("//button[@data-testid='cart-counter-increment-button']")).click();
        }


    }
}
