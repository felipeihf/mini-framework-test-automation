package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    // luego de esto se haria un scroll
    // hacer un locator del boton de la fecha seleccionada para hacerle click
    // lo mismo para la segunda fecha
    // locator para el boton de "Done"
    // locator para search button

    // crear nueva pagina con resultados de vuelos, dentro de esta hacer lo siguiente:

    // localizar caja de filter by y validar su visibilidad con los contenidos minimos: price, departure, arrival y duration
    // localizar select buttons y validar presencia en dom
    // localizar textos de duraciones de viaje y validar presencias
    // localizar boton de detalles y precios de equipaje, validar que aparecen en todos los resultados






    public BasePage(WebDriver webDriver) {

        this.webDriver = webDriver;



    }



}
