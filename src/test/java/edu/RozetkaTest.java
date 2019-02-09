package edu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import rozetka.ItemPage;
import rozetka.MainPage;

public class RozetkaTest {
    WebDriver webDriver = new ChromeDriver();
    MainPage mainPage = new MainPage(webDriver);
    ItemPage itemPage = new ItemPage(webDriver);

    @Test
    public void test() {
        mainPage
                .goToCategory()
                .goToCategory()
                .goToCategory()
                .getHeaderBlock().search("");

        mainPage
                .goToCategory();

        itemPage
                .getHeaderBlock()
                .search("");

    }
}
