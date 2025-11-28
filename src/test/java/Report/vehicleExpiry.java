package Report;


	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

	 class vehicleExpiryReport extends baseLoginTest{ 
	@Test
		 public void vehicleExpiry() throws InterruptedException

			{
			 Login loginPage = new Login(driver);
		     loginPage.loginTest("Admin", "Admin@123$");
		     WebElement Report = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_Reportmenu")));
		     Report.click();
		
		     WebElement scroll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleOverSpeedR")));
		JavascriptExecutor scrollup =(JavascriptExecutor)driver;
		scrollup.executeScript("arguments[0].scrollIntoView({ behavior:'auto', block:'center' });",scroll);

		     WebElement vehicleExpiry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_liVehicleExpiryReport")));
		     vehicleExpiry.click();	
		
		     WebElement vendoreName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
		/*   Select dropdownvendoreName = new Select(vendoreName);
		     int dropdownvName =dropdownvendoreName.getOptions(). size();
		     for(int i=0; i<dropdownvName;i++)
		     {
		   	  
		   	      vendoreName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlVendorName")));
		   	      dropdownvendoreName = new Select(vendoreName);
		   	      dropdownvendoreName.selectByIndex(i);
		     }*/
		     
		
		     WebElement BranchName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
		      /*  Select dropdownBranchName = new Select(BranchName);
		        int dropdownvName =dropdownBranchName.getOptions(). size();
		        for(int i=0; i<dropdownvName;i++)
		        {
		      	  
		       	  BranchName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
		       	   dropdownBranchName = new Select(BranchName);
		       	     dropdownBranchName.selectByIndex(i);
		       }*/
		          	
		
		
		     

		     WebElement vendorname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_ddlBranchName")));
		    Select dropdownvendorname = new Select(vendorname);
		      int dropdownvname =dropdownvendorname.getOptions().size();
		      Thread.sleep(1000);
		      for(int i=0; i<dropdownvname ;i++)
		      {
		    	   vendorname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbVehicleName")));
		     	    dropdownvendorname = new Select(vendorname);
		     	    Thread.sleep(1000);
		     	    dropdownvendorname.selectByIndex(i);
		   	}
		      
		      
		 	

		 	 
		     WebElement reportbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnReport")));
		     reportbtn.click();	
		     
		     
		     
		     
		     
		   
		
		
			}
		
		
		
	}


