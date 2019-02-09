package rozetka;

import org.openqa.selenium.WebDriver;

public abstract class CommonPage {
    private WebDriver webDriver;

    public CommonPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
