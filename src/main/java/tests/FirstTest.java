package tests;

import org.testng.annotations.Test;
import pages.BasePage;

public class FirstTest extends BaseTest {

    @Test

    public void homePageTest() {

        BaseTest.homePage = new BasePage(BaseTest.getWebdriver());
        getWebdriver().manage().window().maximize();
        BaseTest.homePage.bookFlight();

        // String currentURL = homePage.getPageURL();

        // Assert.assertTrue(currentURL.contains(BOOKING_PAGE));





    }

}
