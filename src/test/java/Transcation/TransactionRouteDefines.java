package Transcation;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TransactionRouteDefines {

    WebDriver driver;
    WebDriverWait wait;

   
    By Rname = By.xpath("//input[@id='trip_title']");
    By StartLoc = By.xpath("//input[@id='txtStartLocation']");
   By addpot = By.xpath("//input[@id='addInputField']");
    By waypoint = By.xpath("//input[@placeholder='Search Waypoint Location']");
   By desLoc = By.xpath("//input[@id='txtDestinationLocation']");
   By saveroute = By.xpath("//button[@id='btnRouteNoSave']");

   
   
   
   
    public TransactionRouteDefines(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

   
    public void createRoute(String routeName, String startLocation, String waypointLoc, String destination) throws Exception {

        WebElement RnameField = wait.until(ExpectedConditions.visibilityOfElementLocated(Rname));
        RnameField.sendKeys(routeName);

        WebElement StartLocField = wait.until(ExpectedConditions.visibilityOfElementLocated(StartLoc));
    StartLocField.sendKeys(startLocation);
 StartLocField.click();

  WebElement addpotBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(addpot));
     addpotBtn.click();

        WebElement waypointField = wait.until(ExpectedConditions.visibilityOfElementLocated(waypoint));
        waypointField.sendKeys(waypointLoc);

        WebElement desLocField = wait.until(ExpectedConditions.visibilityOfElementLocated(desLoc));
    desLocField.sendKeys(destination);

        Thread.sleep(1000);

        StartLocField.click();
 StartLocField.sendKeys(Keys.ENTER);

        if (StartLocField.isSelected())
        
        {
            Thread.sleep(8000);
        }

        StartLocField.click();

        WebElement saveBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(saveroute));
        saveBtn.click();
        
        
        
    }
}

    	
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
  
    	 
    



