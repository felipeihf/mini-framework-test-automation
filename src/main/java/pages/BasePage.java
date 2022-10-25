package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {


    protected WebDriver webDriver;

    @FindBy(xpath = "//span[text()='Flights']")
    private WebElement flightButton;
    @FindBy(xpath = "//button[@data-stid='location-field-leg1-origin-menu-trigger']")
    private WebElement leavingFromButton;

    @FindBy(id="location-field-leg1-origin-menu-input")
    private WebElement leavingFromInput;

    @FindBy(xpath = "//div[contains(@class, \"truncate\")]/child::div[1]//strong")
    private WebElement inputResult;

    @FindBy(xpath = "//button[@data-stid='location-field-leg1-destination-menu-trigger']")
    private WebElement goingToBar;

    @FindBy(id="location-field-leg1-destination-menu-input")
    private WebElement goingToInput;

    @FindBy(id="d1-btn")
    private WebElement setDates;

    @FindBy(xpath="//button[@data-stid='date-picker-paging']")
    private WebElement changeMonthButton;

    @FindBy(xpath = "//button[@data-day='15']")
    private WebElement departureDate;

    @FindBy(xpath = "//button[@data-day='16']")
    private WebElement arrivalDate;

    @FindBy(xpath="//button[@data-stid='apply-date-picker']")
    private WebElement doneButton;


    public BasePage(WebDriver webDriver) {

        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);

        }
    public String getPageURL() {

        String getURL = webDriver.getCurrentUrl();

        return getURL; }


    public void bookFlight() {

        WebDriverWait wait = new WebDriverWait(webDriver,15);

        new WebDriverWait(webDriver, 10).until(ExpectedConditions.elementToBeClickable(flightButton));
        flightButton.click();

        try {
            leavingFromButton.click();
            new WebDriverWait(webDriver, 15).until(ExpectedConditions.elementToBeClickable(leavingFromInput));
            leavingFromInput.clear();
            leavingFromInput.click();
            leavingFromInput.sendKeys("LAS", Keys.ENTER);

            //TODO: solve sendkeys not doing input on the searchbar

            // goingToBar.click();
            // new WebDriverWait(webDriver, 15).until(ExpectedConditions.elementToBeClickable(goingToInput));
            // leavingFromInput.sendKeys("LAX", Keys.ENTER);


        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable");
        }





    }

}
