package Foxtrot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void waitUntilTitleContainsText(String title){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.titleContains(title));
    }

    public WebElement getElementByXpath(String locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return driver.findElement(By.xpath(locator));
    }

    public List<WebElement> getElementsByXpath(String locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }

    public void moveCursor(String locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(getElementByXpath(locator)).perform();
    }
}
