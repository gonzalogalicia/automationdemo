package demo.tests.ttcom.homepage;

import org.testng.Assert;
import org.testng.annotations.Test;
import demo.framework.core.BaseTest;
import demo.pageobjects.ttcom.homepage.TtcomHomePage;

public class TtcomHomePageTests extends BaseTest {

    @Test
    public void homePageTests() {
        TtcomHomePage ttcomHomePage = new TtcomHomePage(getDriver());
    }

    @Test
    public void checkTitle() {
        try {
            String actualTitle = driver.getTitle();
            String expectedTitle = "TurboTax® Official Site: File Taxes Online, Tax Filing Made Easy";
            Assert.assertEquals(actualTitle, expectedTitle);
            System.out.println("Test Passed");
        }
        catch (Throwable e) {
            System.out.println("Test Failed");
        }
    }
}
