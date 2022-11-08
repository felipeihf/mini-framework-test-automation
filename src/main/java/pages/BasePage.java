package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {


    protected WebDriver webDriver;
    private WebDriverWait wait;

    @FindBy(xpath = "//span[text()='Flights']")
    private WebElement flightButton;

    @FindBy(xpath="//*[@data-testid=\"location-field-leg1-origin-container\"]")
    private WebElement leavingButton;

    @FindBy(xpath="//*[@id=\"location-field-leg1-origin\" and @placeholder=\"Where are you leaving from?\"]")
    private WebElement leavingFromInput;

    @FindBy(xpath="//*[@data-testid=\"location-field-leg1-destination-container\"]")
    private WebElement destinationButton;

    @FindBy(xpath="//*[@id=\"location-field-leg1-destination\" and @placeholder=\"Where are you going to?\"]")
    private WebElement destinationInput;

    @FindBy(id="d1-btn")
    private WebElement departureDateBtn;

    @FindBy(id="d2-btn")
    private WebElement returnDateBtn;

    @FindBy(xpath = "//*[@data-stid='date-picker-paging'][2]")
    private WebElement nextMonthBtn;

    @FindBy(xpath = "//button[@aria-label='Jan 13, 2023']")
    private WebElement departureDate;

    @FindBy(xpath="//button[@data-stid='apply-date-picker']")
    private WebElement confirmDatesBtn;

    @FindBy(xpath="//button[@data-testid='submit-button']")
    private WebElement submitBtn;


    public BasePage(WebDriver webDriver) {

        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        wait = new WebDriverWait(webDriver, 15);
        }


    public String getPageURL() {

        String getURL = webDriver.getCurrentUrl();
        return getURL;
    }

    public void verifyResultPage() {

    }

    /** This test only works in a full-screen desktop browser **/
    public void bookFlight() {

        /** Set origin **/
        flightButton.click();
        leavingButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(leavingFromInput));
        leavingFromInput.sendKeys("LAS");
        leavingFromInput.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(destinationButton));

        /** Set destination **/

        destinationButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(destinationInput));
        destinationInput.sendKeys("LAX");
        destinationInput.sendKeys(Keys.ENTER);

        /** Set departure date **/
        departureDateBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(nextMonthBtn));
        nextMonthBtn.click();
        departureDate.click();
        confirmDatesBtn.click();
        submitBtn.click();


        }




    }


