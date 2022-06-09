import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFor {

    @Test
    public void cart(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://epicentrk.ua/");
        driver.findElement(By.xpath("//*[contains(text(),'інший')]")).click();
        driver.findElement(By.xpath("//div[@data-test='search-open']")).click();
        driver.findElement(By.xpath("//input[@data-test='search-city']")).sendKeys("Вінниця\n");


    }
}
