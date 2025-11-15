package Transcation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TranscationRouteDefines {

    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators
    private By routeNameInput = By.xpath("//input[@id='trip_title']");
    private By startLocInput = By.xpath("//input[@id='txtStartLocation']");
    private By addPointInput = By.xpath("//input[@id='addInputField']");
    private By waypointInput = By.xpath("//input[@placeholder='Search Waypoint Location']");
    private By destLocInput = By.xpath("//input[@id='txtDestinationLocation']");

    public TranscationRouteDefines(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void routeAdd(String routeName, String startLocation, String addPoint, String waypointData, String destLocation) throws InterruptedException {
      
        WebElement routeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(routeNameInput));
        routeElement.sendKeys(routeName);

      
        WebElement startElement = wait.until(ExpectedConditions.visibilityOfElementLocated(startLocInput));
        startElement.sendKeys(startLocation);
        startElement.click();

       
        WebElement addPointElement = wait.until(ExpectedConditions.elementToBeClickable(addPointInput));
        addPointElement.click();

        WebElement waypointElement = wait.until(ExpectedConditions.visibilityOfElementLocated(waypointInput));
        waypointElement.sendKeys(waypointData);

   
        WebElement destElement = wait.until(ExpectedConditions.visibilityOfElementLocated(destLocInput));
        destElement.sendKeys(destLocation);

      
        Thread.sleep(1000);

        startElement.sendKeys(Keys.ENTER);

        if (startElement.isSelected()) {
            Thread.sleep(8000);
        }

     
        startElement.click();
    }
}
