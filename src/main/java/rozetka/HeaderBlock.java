package rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderBlock {
    private static final String SEARCH_INPUT ="";

    protected WebDriver driver;
    protected String  uniqyeParentLocator;

    public HeaderBlock(WebDriver driver, String uniqyeParentLocator) {
        this.driver = driver;
        this.uniqyeParentLocator = uniqyeParentLocator;
    }

    public HeaderBlock search(String searchQuery){
        driver.findElement(By.xpath(uniqyeParentLocator + SEARCH_INPUT)).clear();
        driver.findElement(By.xpath(uniqyeParentLocator + SEARCH_INPUT)).sendKeys(searchQuery);
        return this;
    }

    public HeaderBlock goToAccountPage() {
       return this;
    }

    public HeaderBlock goToHowTo() {
        return this;
    }
}
