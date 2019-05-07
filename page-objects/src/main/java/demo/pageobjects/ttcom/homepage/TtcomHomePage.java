package demo.pageobjects.ttcom.homepage;

import demo.framework.core.BasePage;
import org.openqa.selenium.WebDriver;

public class TtcomHomePage extends BasePage {

    public TtcomHomePage(WebDriver driver) {
        super(driver);
    }

    public String expectedTitle = "TurboTax® Official Site: File Taxes Online, Tax Filing Made Easy";
}
