package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

import static utils.Links.BOOKING_PAGE;

public class FirstTest extends BaseTest {

    @Test

    public void homePageTest() {

        BaseTest.homePage = new BasePage(BaseTest.getWebdriver());
        getWebdriver().manage().window().maximize();
        BaseTest.homePage.bookFlight();

        String currentURL = homePage.getPageURL();
        Assert.assertTrue(currentURL.contains(BOOKING_PAGE));





    }

}
