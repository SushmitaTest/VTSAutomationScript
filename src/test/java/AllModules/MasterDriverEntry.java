package AllModules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class MasterDriverEntry extends baseLoginTest {

	@Test(enabled=true)
	public void driverAdd() throws InterruptedException {

		 Login loginPage = new Login(driver);
	        loginPage.loginTest("Admin", "Admin@123$");
		// -----open the master menu module----------------------------------------------
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement mMenu = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master Menu']")));
		mMenu.click();
		
	
		// -----Driver submodule(Add process) --------------------------------------------------------------------------
		Thread.sleep(3000);
		WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vehicleMod = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Driver Entry Master']")));
		vehicleMod.click();
		
		
		//-----device vendor name ---------------------------------------------
		/*Thread.sleep(3000);
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vname = wait53.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlVendorName']")));
		vname.click();

		Select ddvname = new Select(vname);
		ddvname.selectByIndex(2);*/

		 //-----Branch name ---------------------------------------------
			/*Thread.sleep(3000);
			WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement Bname = wait54.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='2']")));
			Bname.click();
			Select ddBname = new Select(Bname);
			ddBname.selectByIndex(0);*/

			
		Thread.sleep(3000);
		WebDriverWait wait4= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement drivercode = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='3']")));
		drivercode.sendKeys("0000011");
		
		Thread.sleep(3000);
		WebDriverWait wait5= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement drivername = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtDriverN']")));
		drivername.sendKeys("PARTH");
		
		Thread.sleep(3000);
		WebDriverWait wait6= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement licencNo = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='5']")));
		licencNo.sendKeys("MH20 20000000008");
		
		Thread.sleep(3000);
		WebDriverWait wait7= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Mobno = wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='6']")));
		Mobno.sendKeys("9090909090");
			
			
		Thread.sleep(3000);
		WebDriverWait wait8= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement city = wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='7']")));
		city.sendKeys("jaipur");
		
			
		Thread.sleep(3000);
		WebDriverWait wait9= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement driverADD= wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='ctl00_ContentPlaceHolder2_txtAddress']")));
		driverADD.sendKeys("JAIPUR/001TEST");
		
		Thread.sleep(3000);
		WebDriverWait wait10= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement DOj= wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='9']")));
		DOj.click();
		DOj.sendKeys("01/01/2001");
		
		WebElement chbox= wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_chkActive']")));
		chbox.click();
		
		WebElement savebtn= wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnSave']")));
		savebtn.click();
		
		WebElement clearbtn= wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ID='ctl00_ContentPlaceHolder2_btnClear']")));
		clearbtn.click();
		Thread.sleep(3000);

		
		}	

@Test(enabled=false)
public void driverEdit() throws InterruptedException
{
		 //-----edit process-----------------------------------------------------------------------------------
	    // -----open the master menu module----------------------------------------------
			WebDriverWait wait100 = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement EmMenu = wait100.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master Menu']")));
			EmMenu.click();
		
			
			// -----Driver submodule(edit process) --------------------------------------------------------------------------
			
			Thread.sleep(3000);
			WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement vehicleMod = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Driver Entry Master']")));
			vehicleMod.click();
			
			Thread.sleep(3000);
			WebDriverWait wait31= new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement EvehicleMod = wait31.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@value='152']")));
			EvehicleMod.click();
			WebElement editbtn=wait31.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnEdit']")));
			editbtn.click();
			
			//-----device vendor name ---------------------------------------------
			Thread.sleep(3000);
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement vname = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlVendorName']")));
			vname.click();

			Select ddvname = new Select(vname);
			ddvname.selectByIndex(16);

			 //-----Branch name ---------------------------------------------
			Thread.sleep(3000);
			WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement Bname = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='2']")));
			Bname.click();
			Select ddBname = new Select(Bname);
			ddBname.selectByIndex(1);
		 
			Thread.sleep(3000);
			WebDriverWait wait5= new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement Edrivercode = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='3']")));
			Edrivercode.clear();
			Edrivercode.sendKeys("0000011");
			
			
			Thread.sleep(3000);
			WebDriverWait wait6= new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement Edrivername = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtDriverN']")));
			Edrivername.clear();
			Edrivername.sendKeys("hiNA");
			
			
			Thread.sleep(3000);
			WebDriverWait wait7= new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement ElicencNo = wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='5']")));
			ElicencNo.clear();
			ElicencNo.sendKeys("MH20 20000000004");
			
			
			Thread.sleep(3000);
			WebDriverWait wait71= new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement EMobno = wait71.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='6']")));
			EMobno.clear();
			EMobno.sendKeys("9090909091");
			
			Thread.sleep(3000);
			WebDriverWait wait81= new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement Ecity = wait81.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='7']")));
			Ecity.clear();
			Ecity.sendKeys("PATNA");
			
				
			Thread.sleep(3000);
			WebDriverWait wait9= new WebDriverWait(driver, Duration.ofSeconds(30));
	    	WebElement dateField = wait9.until(
	            ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='9']"))
	        );
	        dateField.click();
	        dateField.clear();
	        dateField.sendKeys("12/02/2002");
			
			
			/*Thread.sleep(3000);
			WebDriverWait wait10= new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement DOj= wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='9']")));
			DOj.click();
			DOj.clear();
			DOj.sendKeys("01/02/2001");*/
			
			
			 WebDriverWait wait10= new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement chbox= wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_chkActive']")));
			if(chbox.isSelected())
			{
				chbox.click();
				
			}
			
			WebDriverWait wait75 =new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement Eupdateb= wait75.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnSave']")));
			Eupdateb.click();
			Thread.sleep(5000);
			
			
			//-----clear button process-------------------------------------------
			/*WebElement Eclearb= wait75.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnClear']")));
			Eclearb.click();
			Thread.sleep(3000);*/
			
			//-----delete button process--------------------------------------------------------------------------------
			/*WebElement deleteb= wait75.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnDelete']")));
			deleteb.click();
			Thread.sleep(3000); //popoup handle in delete function
			
			WebElement delCancel= wait75.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Cancel']")));
			delCancel.click();
			Thread.sleep(5000);
			
			WebElement canOk= wait75.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='OK']")));
			canOk.click();
			Thread.sleep(5000);*/
			
			
			//-----close button process--------------------------------------------
		    WebElement Ucloseb= wait75.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnClose']")));
			Ucloseb.click();
			Thread.sleep(3000); 
						
			
	}

@DataProvider(name="Date")

public Object[][] getDate() {
    return new Object[][] {
        { "01/02/2001",   "Valid date" },
        { "2001/02/01",   "Invalid format" },
        { "10/11/2026",    "Future date" }
    };
}

@Test(dataProvider="Date")
public void vehicleEditDate(String Date,  String description) throws InterruptedException
{
	if (Date =="2001/02/01" ) {
     
        throw new SkipException("Skipping test for data: " + Date + " " + description);
    }
		
	
		 //-----edit process-----------------------------------------------------------------------------------
	    // -----open the master menu module----------------------------------------------
			WebDriverWait wait100 = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement EmMenu = wait100.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master Menu']")));
			EmMenu.click();
		
			
			// -----Driver submodule(edit process) --------------------------------------------------------------------------
			
			Thread.sleep(3000);
			WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement vehicleMod = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Driver Entry Master']")));
			vehicleMod.click();
			
			Thread.sleep(3000);
			WebDriverWait wait31= new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement EvehicleMod = wait31.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@value='152']")));
			EvehicleMod.click();
			WebElement editbtn=wait31.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnEdit']")));
			editbtn.click();
			
			//date sceanrios	
			Thread.sleep(3000);
			WebDriverWait wait9= new WebDriverWait(driver, Duration.ofSeconds(30));
	    	WebElement dateField = wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@tabindex='9']")));
	        dateField.click();
	        dateField.clear();
	        dateField.sendKeys(Date);
				
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
