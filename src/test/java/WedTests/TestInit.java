package WedTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    WebDriver driver;



    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    @BeforeMethod
    public void openChrome (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void fullWindow() {
        driver.manage().window().maximize();
    }

    public void openZakaz(){
        driver.get("https://zakaz.ua/uk/");
        fullWindow();
    }

    public void openFoxStore() {
        driver.get("https://www.foxtrot.com.ua/uk");
    }


}
