package rozetka;

import org.openqa.selenium.WebDriver;

public class MainPage extends CommonPage {
    private HeaderBlock headerBlock;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
        headerBlock = new HeaderBlock(webDriver, "mainPageLocator");
    }

    public MainPage goToCategory() {
        return this;
    }

    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }
}
