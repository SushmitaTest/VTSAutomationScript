package Transcation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class transcationVtsGetGeofences extends baseLoginTest{
@Test
	public void addgeofence()
	{
	 Login loginPage = new Login(driver);
     loginPage.loginTest("Admin", "Admin@123$");

		
     WebElement transaction = wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Transaction']")));
     transaction.click();

     WebElement geofence = wait.until(
ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='VTS Get Geofencing']")));
     geofence.click();
		
		

     WebElement route = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='RouteSelect']")));
     route.click();
     Select sl =new Select(route);
     sl.selectByIndex(25);
     

     WebElement routebtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='Get_Route']")));
     routebtn.click();
     
     WebElement vehicle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='VehicleSelect']")));
     vehicle.click();
     
     Select sl1 =new Select(vehicle);
     sl1.selectByIndex(9);
     
     
     WebElement Trackvehicle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='Track_Vehicle']")));
     Trackvehicle.click();
     
     
     
     
     
     
     
     
     
     
     
		
	}
		
}
