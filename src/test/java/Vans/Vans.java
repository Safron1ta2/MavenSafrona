package Vans;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.sql.DriverManager;

public class Vans {
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void vans() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vans.co.uk/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        //іду до вімен
        actions.moveToElement(driver.findElement(By.xpath("//a[@id='topnav-item-1342723']")));
        sleep(3);
        //ок кукі
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        //іду до вімен
        actions.moveToElement(driver.findElement(By.xpath("//a[@id='topnav-item-1342723']"))).perform();
        //беру колір до
        String bgc = driver.findElement(By.xpath("//*[text()='Women'][1]")).getCssValue("background-color");
        //беру колір після
        String c = driver.findElement(By.xpath("//*[text()='Women'][1]")).getCssValue("color");
        //виводжу колір до (ргба)
        System.out.println(bgc);
        //виводжу колір після (ргба)
        System.out.println(c);
        //колір до != колір після
        Assert.assertNotEquals(bgc, c);
        НАГАДУВАННЯ: System.out.println("РОЗКЛАСТИ ЗА ПЕЙДЖ ОБЖЕКТ ТА З НОРМАЛЬНИМ ВЕЙТЕРОМ");
    }
}
