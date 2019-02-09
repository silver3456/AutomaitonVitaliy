package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebDriverWorker {

    public static void clickElement(WebElement webElement, String elementName) {
        try {
            webElement.click();
        } catch (NoSuchElementException e) {
            Assert.fail("Test failed due to not found element with name" + elementName);
        }

    }
}
