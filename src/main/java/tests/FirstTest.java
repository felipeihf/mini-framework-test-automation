package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import static utils.Links.*;

public class FirstTest extends BaseTest {

    @Test

    public void homePageTest() {

        BaseTest.homePage = new BasePage(BaseTest.getWebdriver());
        BaseTest.homePage.bookFlight();

        String currentURL = homePage.getPageURL();

        Assert.assertTrue(currentURL.contains(BOOKING_PAGE));





    }

}
