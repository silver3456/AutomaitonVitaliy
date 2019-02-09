package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;
import static pages.WebDriverWorker.clickElement;

public class SearchPage {

    @FindBy
    @CacheLookup
    private WebElement webElement;

    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final String FROM_INPUT_LOCATOR = "//*[@data-id='departurePosition']";
    private static final String FROM_CITY_PATTERN = "//*[contains(@class, 'Suggestion__item')]//*[contains(text(), '%s')]";

    public void enterFromCity(String city) {
        driver.findElement(xpath(FROM_INPUT_LOCATOR)).clear();
        driver.findElement(xpath(FROM_INPUT_LOCATOR)).sendKeys(city);

        clickElement(driver.findElement(xpath(format(FROM_CITY_PATTERN, city))), "DropDown List from....");
    }

    public void enterFrom(String partOfCity) {
        driver.findElement(xpath(FROM_INPUT_LOCATOR)).clear();
        driver.findElement(xpath(FROM_INPUT_LOCATOR)).sendKeys(partOfCity);
    }

    public void pickUpFromDropDown(String city) {
        driver.findElement(xpath(format(FROM_CITY_PATTERN, city))).click();

    }


    private static final String PATTERN = "Insert value here: %s";
    public static void main(String... args) {
        System.out.println(String.format(PATTERN, "pasted value"));
        System.out.println(String.format(PATTERN, "2"));
        System.out.println(String.format(PATTERN, "3"));
    }
}
