package TestOn_The_internet_herokuapp_com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ContextMenu {
    @Test
    void rightClick(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/context_menu");
        actions.contextClick(driver.findElement(By.xpath("//div[@id='hot-spot']"))).perform();
    }
}
