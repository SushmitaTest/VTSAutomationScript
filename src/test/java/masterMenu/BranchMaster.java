package masterMenu;

	
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

	public class BranchMaster extends baseLoginTest 
	{

	    @Test
	    public void addBranch() throws InterruptedException, IOException {

	        FileInputStream fi = new FileInputStream("D:\\Sushmita.Project_Data\\1TestProjects\\3.vts\\LoginData.xlsx");
	        Workbook wb = WorkbookFactory.create(fi);
	        Sheet sheet = wb.getSheet("login");
	        Row row = sheet.getRow(2);
	        Cell cell = row.getCell(0);
	        String emailFromExcel = cell.getStringCellValue();
	        wb.close();
	        fi.close();

	        Login loginPage = new Login(driver);
	        loginPage.loginTest("Admin", "Admin@123$");
	        Thread.sleep(3000);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        WebElement masterMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Master Menu']")));
	        masterMenu.click();

	        Thread.sleep(3000);
	        WebElement branchMaster = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Branch Master']")));
	        branchMaster.click();
	        Thread.sleep(3000);
	        WebElement vendorDropdown = wait.until(ExpectedConditions
	 .visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_CmbVendorName")));
	        Select ddvname = new Select(vendorDropdown);
	        ddvname.selectByIndex(3);
	        Thread.sleep(3000);
WebElement branchCode = wait.until(ExpectedConditions .visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_txtBranchCode")));
	        branchCode.sendKeys("BNTest00011");

	        WebElement branchName = wait.until(ExpectedConditions
	                .visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_txtBranchN")));
	        branchName.sendKeys("BNTestMaharashtra");

	        WebElement emailField = wait.until(ExpectedConditions
	                .visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_email")));
	        emailField.sendKeys(emailFromExcel);  // Use Excel value

	        WebElement mobileNo = wait.until(ExpectedConditions
	                .visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_txtMobileNo")));
	        mobileNo.sendKeys("9090898990");

	        WebElement city = wait.until(ExpectedConditions .visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_txtCity")));
 city.sendKeys("Nagpur");

	        WebElement branchAddress = wait.until(ExpectedConditions
	                .visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_txtAddress")));
	        branchAddress.sendKeys("Nagpur City 886/A");

WebElement activeCheckbox = wait.until(ExpectedConditions
	    .visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_chkActive")));
	        activeCheckbox.click();

	        WebElement saveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnSave")));
	        saveButton.click();

	 
	        
	        Thread.sleep(3000);
	        
	        
	        
	        
	    }
	}

