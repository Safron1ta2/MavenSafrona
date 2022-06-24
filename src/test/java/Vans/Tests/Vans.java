package Vans.Tests;
import Vans.Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Vans extends TestInit {

    @Test
    public void vans() {
        HomePage homePage = new HomePage(driver);
        homePage.openVans();
        fullWindow();
        homePage.moveToWomenBtn();
        homePage.okCookieBtn().click();
        //homePage.moveToWomenBtn();
        //System.out.println(homePage.getColorBefore());
        //System.out.println(homePage.getColorAfter());
        //Assert.assertNotEquals(homePage.getColorBefore(), homePage.getColorAfter());
        ArrayList<String> headerBtnsColor = new ArrayList<>();
        for(WebElement element : homePage.getBtns()){
            homePage.moveCursorT(element);
            String bgc = element.getCssValue("background-color");
            String c = element.getCssValue("color");
            Assert.assertNotEquals(bgc, c);
        }
    }
}
