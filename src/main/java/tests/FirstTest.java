package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

public class FirstTest extends BaseTest {

    @Test

    public void homePageTest() {

        BaseTest.homePage = new BasePage(BaseTest.getWebdriver());
        BaseTest.homePage.bookFlight();

        String currentURL = homePage.getPageURL();
        String bookFlightURL = "https://www.travelocity.com/Flights-Search";

        Assert.assertTrue(currentURL.contains(bookFlightURL));





    }

}
