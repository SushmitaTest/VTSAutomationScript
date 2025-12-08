package transcation;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TransactionRouteDefines {

    WebDriver driver;
    WebDriverWait wait;

   
    By Rname = By.xpath("//input[@id='trip_title']");
    By StartLoc = By.xpath("//input[@id='txtStartLocation']");
  // By addpot = By.xpath("//input[@tabindex='7']");
  //  By waypoint = By.xpath("//input[@type='text']");
   By desLoc =  By.id("txtDestinationLocation");
   By saveroute =  By.id("btnRouteNoSave");

   
    public TransactionRouteDefines(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

   
    public void createRoute(String routeName, String startLocation, String waypointLoc, String destination) throws Exception {

        WebElement RnameField = wait.until(ExpectedConditions.visibilityOfElementLocated(Rname));
        RnameField.sendKeys(routeName);
        Thread.sleep(3000);
        WebElement StartLocField = wait.until(ExpectedConditions.visibilityOfElementLocated(StartLoc));
    StartLocField.sendKeys(startLocation);
    Thread.sleep(1000);
    StartLocField.click();
  

   /*  WebDriverWait wait2 =new WebDriverWait(driver, Duration.ofSeconds(30));
       WebElement addpotBtn = wait2.until(ExpectedConditions.visibilityOfElementLocated(addpot));
       
       Actions actions = new Actions(driver);
       actions.moveToElement(addpotBtn).click().perform();
       
     Thread.sleep(3000);
       WebElement waypointField = wait.until(ExpectedConditions.visibilityOfElementLocated(waypoint));
        waypointField.sendKeys(waypointLoc);*/
        Thread.sleep(3000);
        wait =new WebDriverWait(driver, Duration.ofSeconds(30, 01));
       WebElement desLocField = wait.until(ExpectedConditions.visibilityOfElementLocated(desLoc));
      desLocField.sendKeys(destination);
        StartLocField.click();
      
       /*  if (StartLocField.isSelected())
        
        {
            Thread.sleep(5000); 
              
            
        }*/
        Thread.sleep(5000); 
        WebElement saveBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(saveroute));
        saveBtn.click();
        
       
    }
}

    	
    	 
    	 
    	 
    	 
    	 
    	 
    	 /*
    	 
    	 
    	 
  public void createRoute(String routeName,
                        String startLocation,
                        String waypointLoc,
                        String destination) throws Exception {

    WebElement RnameField = wait.until(
        ExpectedConditions.visibilityOfElementLocated(Rname)
    );
    RnameField.clear();
    RnameField.sendKeys(routeName);

    WebElement StartLocField = wait.until(
        ExpectedConditions.elementToBeClickable(StartLoc)
    );
    StartLocField.clear();
    StartLocField.sendKeys(startLocation);

    // wait until suggestion list appears
    List<WebElement> suggestions = wait.until(
        ExpectedConditions.visibilityOfAllElementsLocatedBy(
            // adjust this locator according to actual suggestion items in DOM
            By.cssSelector("div.pac‑item, div.pac-item")  
        )
    );

    // click first suggestion or specific one
    if (suggestions.size() > 0) {
        suggestions.get(0).click();
    } else {
        throw new RuntimeException("No suggestions found for start location: " + startLocation);
    }

    // now do destination similarly
    WebElement desLocField = wait.until(
        ExpectedConditions.elementToBeClickable(desLoc)
    );
    desLocField.clear();
    desLocField.sendKeys(destination);

    // wait & click suggestion for destination (optional, if needed)
    List<WebElement> destSuggestions = wait.until(
        ExpectedConditions.visibilityOfAllElementsLocatedBy(
            By.cssSelector("div.pac‑item, div.pac-item")
        )
    );
    if (!destSuggestions.isEmpty()) {
        destSuggestions.get(0).click();
    }

    // finally click save
    WebElement saveBtn = wait.until(
        ExpectedConditions.elementToBeClickable(saveroute)
    );
    saveBtn.click();
}

    	 
    


*/
