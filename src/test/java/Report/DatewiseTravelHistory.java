package Report;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class DatewiseTravelHistory extends baseLoginTest{

	@Test
	 public void Overspeed() throws InterruptedException 
{
	 Login loginPage = new Login(driver);
    loginPage.loginTest("Admin", "Admin@123$");
    
    Thread.sleep(1000);
    WebElement Report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='ctl00_Reportmenu']")));
    Report.click();
    WebElement scrollup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleDatewiseHistroyR")));
    JavascriptExecutor scroll =(JavascriptExecutor)driver;
    scroll.executeScript("arguments[0].scrollIntoView({block:'center'});",scrollup);
    WebElement datewisemodule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleDatewiseHistroyR")));
    datewisemodule.click();
    WebElement VendorName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
  /*  Select dropdownVendorName = new Select(VendorName);
    int dropdownbName = dropdownVendorName.getOptions().size();
    for(int i=0; i<dropdownbName;i++)
    {
    	Thread.sleep(1000);
     VendorName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
    	dropdownVendorName = new Select(VendorName);
    	dropdownVendorName .selectByIndex(i);
    	
    }*/
    WebElement BranchName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
    Select dropdownBranchName = new Select(BranchName);
   int dropdownbName = dropdownBranchName.getOptions().size();
   for(int i=0; i<dropdownbName;i++)
   {
   	Thread.sleep(1000);
     BranchName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
      dropdownBranchName = new Select(BranchName);
        dropdownBranchName.selectByIndex(i);
   }  
	
	
	
	
	
	
	
	
}	
	
	
}
