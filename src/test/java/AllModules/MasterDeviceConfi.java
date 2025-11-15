package AllModules;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class MasterDeviceConfi extends baseLoginTest {
	@Test(priority = 2)
	public void deviceAdd () throws InterruptedException
	{
		 Login loginPage = new Login(driver);
	        loginPage.loginTest("Admin", "Admin@123$");
		//-----open the  master menu module----------------------------------------------
		WebDriverWait wait51 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement mMenu = wait51.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master Menu']")));
		mMenu.click();

		// -----device configuration module(Add process)------------------------------------------------------------------------
		Thread.sleep(3000);
		WebDriverWait wait52 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement device = wait52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@style='display: inline-block; float: none;'])[4]")));
		device.click();
		
		
		//-----device vendor name ---------------------------------------------
		/*Thread.sleep(3000);
		WebDriverWait wait53 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement vname= wait53.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlVendorName']")));
		vname.click();
		
		
		Select ddvname =new Select(vname);
		ddvname.selectByIndex(2);*/
		
		 //-----Branch name ---------------------------------------------
		/*Thread.sleep(3000);
		WebDriverWait wait54 = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	WebElement Bname = wait54.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='2']")));
	 	Bname.click();
	 	Select ddBname =new Select(Bname);
	 	ddBname.selectByIndex(0) ;*/
		
		 //-----device serial no ---------------------------------------------
		WebDriverWait wait55 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement devSerial= wait55.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtDeviceSrNo']")));
		devSerial.sendKeys("TestS06");
		
		//-----Model Name ---------------------------------------------
		WebDriverWait wait57 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Modelno= wait57.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtModelNo']")));
		Modelno.sendKeys("TestSP06");
		
		//-----Simno1 ---------------------------------------------
		WebDriverWait wait56 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement simno= wait56.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtSimNo1']")));
		simno.sendKeys("200000000000006");
		
		//-----Simno2 ---------------------------------------------
		WebDriverWait wait58 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement simno2= wait58.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtSimNo2']")));
		simno2.sendKeys("200000000000007");
		
		//-----device name ---------------------------------------------
		WebDriverWait wait59 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement dNAME= wait59.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtDeviceName']")));
		dNAME.sendKeys("Testdev6");
		
		//-----IEIANo ---------------------------------------------
		WebDriverWait wait60 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement IEIANo= wait60.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtIMEINO']")));
		IEIANo.sendKeys("20000000000016");
		
		//-----portNo---------------------------------------------
		WebDriverWait wait61 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement portNo= wait61.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtPortNumber']")));
		portNo.sendKeys("2000");
		
	
		WebDriverWait wait62 =new WebDriverWait(driver, Duration.ofSeconds(30));
		//-----Dropdown arai--------------------------------------------
		//WebElement radibtn= wait62.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_rdoARAI']")));
		//radibtn.click();
		//-----Dropdown Nonarai--------------------------------------------
		WebElement radibtn2= wait62.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_rdoNONARAI']")));
		radibtn2.click();
		
		//-----checkbox--------------------------------------------
		WebElement chbox= wait62.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_chkActive']")));
		chbox.click();
		
		WebDriverWait wait63 =new WebDriverWait(driver, Duration.ofSeconds(30));
		//-----save btn--------------------------------------------
		WebElement savebtn= wait63.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnSave']")));
		savebtn.click();
		Thread.sleep(4000);
		//-----clear btn--------------------------------------------
		/*WebElement clearbtn= wait63.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnClear']")));
		clearbtn.click();*/
		Thread.sleep(3000);
		//-----close btn--------------------------------------------
		/*WebElement closebtn= wait63.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnClose']")));
		closebtn.click();
		Thread.sleep(3000);  */
		
	}
	
@Test(priority = 1)
public void deviEdit() throws InterruptedException
	{
		
	 //-----edit process-----------------------------------------------------------------------------------
		
	 //-----open the  master menu module----------------------------------------------
		WebDriverWait wait51 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement mMenu = wait51.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master Menu']")));
		mMenu.click();

		// -----open the device configuration submodule---------------------------------------------
		Thread.sleep(3000);
		WebDriverWait wait52 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement device = wait52.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@style='display: inline-block; float: none;'])[4]")));
		device.click();
	
		WebDriverWait wait64 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement edit=wait64.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@value='196'] "))); //change webelements
		edit.click();
		
		WebElement editbtn=wait64.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnEdit']")));
		editbtn.click();
		
		WebDriverWait wait65 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Evname= wait65.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlVendorName']")));
		Evname.click();
		Select ddvname1 =new Select(Evname);
		ddvname1.selectByIndex(16);
		
		
		WebDriverWait wait66 = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	WebElement EBname = wait66.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@tabindex='2']")));
	 	EBname.click();
	 	Select ddBname1 =new Select(EBname);
	 	ddBname1.selectByIndex(1);
		
	 	 //-----device serial no edit process---------------------------------------------
		WebDriverWait wait67 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement EdevSerial= wait67.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtDeviceSrNo']")));
		EdevSerial.clear();
		EdevSerial.sendKeys("Test100");
		
		//-----Model Name edit process ---------------------------------------------
		WebDriverWait wait68 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement EModelno= wait68.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtModelNo']")));
		EModelno.clear();
		EModelno.sendKeys("TestS100");
		
		//-----Simno1 edit process---------------------------------------------
		WebDriverWait wait69 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Esimno= wait69.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtSimNo1']")));
		Esimno.sendKeys("300000000000005");
		
		
		//-----Simno2 edit process ---------------------------------------------
		WebDriverWait wait70 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Esimno2= wait70.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtSimNo2']")));
		Esimno2.clear();
		Esimno2.sendKeys("300000000000006");		
		
		
		//-----device name edit process---------------------------------------------
		WebDriverWait wait71 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement EdNAME= wait71.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtDeviceName']")));
		EdNAME.clear();
		EdNAME.sendKeys("Testdev2");
				
		//-----IEIANo edit process---------------------------------------------
		WebDriverWait wait72 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement EIEIANo= wait72.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtIMEINO']")));
		EIEIANo.clear();
		EIEIANo.sendKeys("20000000000015");		
		
		
		//-----portNo edit process---------------------------------------------
		WebDriverWait wait73 =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement EportNo= wait73.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtPortNumber']")));
		EportNo.sendKeys("3000");
		
		WebDriverWait wait74 =new WebDriverWait(driver, Duration.ofSeconds(30));
		//-----Dropdown arai edit process--------------------------------------------
		WebElement Eradibtn= wait74.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_rdoARAI']")));
		Eradibtn.click();
		//-----Dropdown Nonarai--------------------------------------------
		/*WebElement Eradibtn2= wait74.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_rdoNONARAI']")));
		Eradibtn2.click();*/
		
		//-----checkbox edit process--------------------------------------------
		WebElement Echbox= wait74.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_chkActive']")));
		if(Echbox.isSelected()) //unchecked
		{
			Echbox.click();
			
		}
		Thread.sleep(3000);
		
		//-----update button process--------------------------------------------
		
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
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	

}
