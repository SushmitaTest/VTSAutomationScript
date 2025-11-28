package Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.java.Login;
import Base.java.baseLoginTest;

public class DriverReport extends baseLoginTest {
	
	public void driverreport()
	{
	Login loginPage = new Login(driver);
    loginPage.loginTest("Admin", "Admin@123$");
	
    
    WebElement Report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_Reportmenu")));
    Report .click();
   
    WebElement devicemaster = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liDeviceMReport")));
    devicemaster.click(); 
    
    
    
    
    
    
    
	}
}
