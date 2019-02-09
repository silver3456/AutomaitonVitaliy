package rozetka;

import org.openqa.selenium.WebDriver;

public class ItemPage extends CommonPage {
    private static final String UNIQUE = "ItemPageLocator";
    private HeaderBlock headerBlock;

    public ItemPage(WebDriver webDriver) {
        super(webDriver);
        headerBlock = new HeaderBlock(webDriver, UNIQUE);
    }

    public ItemPage order(){
        return this;
    }

    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }
}
