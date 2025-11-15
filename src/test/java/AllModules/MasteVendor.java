package AllModules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class MasteVendor extends baseLoginTest{

	@Test
	public void AddVendor() throws InterruptedException
	
	{  
		Login loginPage = new Login(driver);
    loginPage.loginTest("Admin", "Admin@123$");
		
		// -----open the master menu module----------------------------------------------
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement mMenu = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master Menu']")));
				mMenu.click();
				
			
				Thread.sleep(3000);
				WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement vendoreMod = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Vendor Master']")));
				vendoreMod.click();		
		
		
				Thread.sleep(3000);
				WebDriverWait wait3= new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement vname= wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtVendorN']")));
				vname.sendKeys("infotechreturn");	
				

				WebDriverWait wait4= new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement vemail= wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_email']")));
				vemail.sendKeys("info@gamil.com");	
							

				WebDriverWait wait41= new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement vcode= wait41.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtVendorCode']")));
				vcode.sendKeys("VVC002");	
							
	
				WebDriverWait wait5= new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement vMob= wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtMobileNo']")));
				vMob.sendKeys("9090898990");	
							
		
				WebDriverWait wait6= new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement city= wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtCity']")));
				city.sendKeys("nashik");
				

				WebDriverWait wait7= new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement compName= wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtCompanyName']")));
				 compName.sendKeys("ReturnCom");		
				
				
				 WebDriverWait wait8= new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement Vendaddr= wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@tabindex='7']")));
				Vendaddr.sendKeys("ReturnCom");	
				
				
				
				WebElement chbox= wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_chkActive']")));
				chbox.click();
				
				WebElement savebtn= wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnSave']")));
				savebtn.click();
				
				WebElement clearbtn= wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ID='ctl00_ContentPlaceHolder2_btnClear']")));
				clearbtn.click();
				Thread.sleep(3000);
				
		
		
	}
	

	
	
@DataProvider(name = "gmail")
public Object[][] getGmail() {
	        return new Object[][]{
	          
	            {"test@gmail.com", "valid format"},
	            {"testgmail.com", "invalid"},
	            {"testng@gmailcom", "invalid"   },
	            {"testng@test.com", "valid "}
	        };
	    }

		
	
	@Test(dataProvider="gmail")
	
	public void editVendor(String mail,String formats ) throws InterruptedException{
		
		 if(mail.equals("testgmail.com") || mail.equals("testng@gmailcom") || mail.equals("testng@test.com"))
		 {
	        throw new SkipException("Skipping test for data" );
		 
		 }
		 Login loginPage = new Login(driver);
	     loginPage.loginTest("Admin", "Admin@123$");
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement mMenu = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master Menu']")));
		mMenu.click();
		
	
		Thread.sleep(3000);
		WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vendoreMod = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Vendor Master']")));
		vendoreMod.click();		
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		WebDriverWait wait31= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement EvehicleMod = wait31.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@value='39']"))); //change value
		EvehicleMod.click();
	
		WebElement editbtn=wait31.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnEdit']")));
		editbtn.click();
		
		WebDriverWait wait4= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vemail= wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_email']")));
		vemail.clear();
		vemail.sendKeys("gmail");
		
		
		
		WebDriverWait wait75 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Eupdateb= wait75.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnSave']")));
		Eupdateb.click();
		Thread.sleep(5000);
		
		//-----close button process--------------------------------------------
	    WebElement Ucloseb= wait75.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnClose']")));
		Ucloseb.click();
		Thread.sleep(3000); 
		
		
	}

	
	
	

}
