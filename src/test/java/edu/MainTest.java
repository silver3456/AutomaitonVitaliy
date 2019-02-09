package edu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SearchPage;

import java.util.concurrent.TimeUnit;

public class MainTest {
    private WebDriver driver;
    private SearchPage searchPage;

    @BeforeClass
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        searchPage = new SearchPage(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        driver.get("https://www.goeuro.com/");
        searchPage.enterFrom("Ber");
        searchPage.pickUpFromDropDown("Berlin");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
