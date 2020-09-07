package pages;

import data.Data;
import org.openqa.selenium.By;

public class Page extends Data {

    // Links
    private final By header = By.cssSelector("#search-section > div > div.row > div > h1");

    public String header_text() {
        String h = driver.findElement(header).getText();
        return h;
    }
}
