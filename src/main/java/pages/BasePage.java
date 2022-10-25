package pages;


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

    @FindBy(xpath = "//div[text()='Leaving from']")
    private WebElement leavingFromInput;

    @FindBy(xpath = "//div[text()='Going to']")
    private WebElement goingToInput;

    @FindBy(xpath = "//div[contains(@class, \"truncate\")]/child::div[1]//strong")
    private WebElement inputResult;

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

        try {
            new WebDriverWait(webDriver, 10).until(ExpectedConditions.elementToBeClickable(flightButton));
            System.out.println("Element is clickable");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable");
        }

    }

}
