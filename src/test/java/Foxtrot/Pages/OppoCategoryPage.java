package Foxtrot.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OppoCategoryPage extends BasePage{
    public OppoCategoryPage(WebDriver driver) {
        super(driver);
    }

    private static final String OPPO_PHONES = "//div[@class='listing__body-wrap image-switch']//a[@class='card__title']";
    public List<WebElement> getOppoPhones() {
        return super.getElementsByXpath(OPPO_PHONES);
    }
}
