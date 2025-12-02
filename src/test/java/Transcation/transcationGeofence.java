package Transcation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class transcationGeofence extends baseLoginTest{
	@Test
	public void addgeofence() throws InterruptedException
	{
	Login loginPage = new Login(driver);
    loginPage.loginTest("Admin", "Admin@123$");
    
    
    wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement transmod = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
	transmod.click();
    WebElement geofence = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Geofence Create']")));
    
    JavascriptExecutor js=(JavascriptExecutor)driver;
  js.executeScript("arguments[0].scrollIntoView({ block: 'center' });",geofence);
   
  Thread.sleep(3000);
    geofence.click();
    WebElement vname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='VendorNameSelect']")));
    vname.click();
    /* Select ddvname =new Select(vname);
    ddvname.selectByIndex(3);  */


    Thread.sleep(3000);
    vname.click();
    
    WebElement Bname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='BranchNameSelect']")));
    Bname.click();   
   /* Select ddBname =new Select(Bname);
    ddBname.selectByIndex(1);*/
    
    Thread.sleep(3000);
    Bname.click();
    
    WebElement Geoname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtGeofenceName']")));
    Geoname.sendKeys("pune geofence");

    
    WebElement category = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='CategorySelect']")));
    category.click(); 
    Select ddcategory =new Select(category);
    ddcategory.selectByIndex(1);
    
    WebElement description = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtDescription']")));
    description.sendKeys("Pune geofence area has added");   
    
    WebElement Tolerance = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtTolerance']")));
    Tolerance.sendKeys("10");   
    

    WebElement svehicle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='VehicleSelect']")));
    svehicle.click();
    Select vehicleselect =new Select(svehicle);
    vehicleselect.selectByIndex(7);
    svehicle.click();
    
    WebElement showgefo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@tabindex='8']")));
    showgefo.click(); 
    
    WebElement search1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pac-input']")));
    search1.sendKeys("phase1 ,pune");
    
    WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@tabindex='10']")));
    btn.click();
    

 
    
	}

}//class
