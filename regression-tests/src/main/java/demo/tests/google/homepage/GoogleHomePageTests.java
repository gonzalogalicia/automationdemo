package demo.tests.google.homepage;

import org.testng.annotations.Test;
import demo.framework.core.BaseTest;
import demo.pageobjects.google.homepage.GoogleHomePage;

public class GoogleHomePageTests extends BaseTest {

    @Test
    public void homePageTests() {
        GoogleHomePage googleHomePage = new GoogleHomePage(getDriver());
    }
}
