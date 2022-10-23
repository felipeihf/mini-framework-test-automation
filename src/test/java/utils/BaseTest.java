package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;


public class BaseTest {


    private static WebDriver webdriver;
    protected static BasePage homePage;

    @BeforeClass
    public static void setupDriver() {

        WebDriverManager.chromedriver().setup();

    }

    @BeforeMethod
    public static void launchBrowser() {

        webdriver = new ChromeDriver();
        webdriver.get(Links.HOMEPAGE);
    }

    public static WebDriver getWebdriver() {
        return webdriver;
    }

    @AfterClass
    public static void closeBrowser() {
        webdriver.quit();
    }

}
