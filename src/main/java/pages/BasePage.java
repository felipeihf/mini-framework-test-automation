package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    // flecha para adelantar meses
    // botones de fecha ida y vuelta

    @FindBy(xpath="//button[@data-stid='apply-date-picker']")
    private WebElement doneButton;







    @FindBy(id="d2-btn")
    private WebElement setSecondDate;



    // hacer un locator del boton de la fecha seleccionada para hacerle click
    // lo mismo para la segunda fecha
    // locator para el boton de "Done"
    // locator para search button


    public BasePage(WebDriver webDriver) {



        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);



    }



}
