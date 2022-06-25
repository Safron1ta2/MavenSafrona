import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ShadowRootHotline {

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");
        sleep(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String str = "return document.querySelector('#page-index > div.grv-dialog-host').shadowRoot.querySelector('div > div > div.buttons-wrapper > button.sub-dialog-btn.block_btn')";
        WebElement btn = (WebElement)((JavascriptExecutor) driver).executeScript(str);
        btn.click();
    }
}
