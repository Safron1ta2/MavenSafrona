package Foxtrot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FoxtrotPsFivePage extends BasePage{
    public FoxtrotPsFivePage(WebDriver driver) {
        super(driver);
    }

    private static final String PS_FIVES = "//*[contains(text(),'PS5')]";

    public List<WebElement> PsQuantity(){
        return getElementsByXpath(PS_FIVES);
    }
}
