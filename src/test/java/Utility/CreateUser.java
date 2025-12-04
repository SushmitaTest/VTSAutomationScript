package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseData.Login;
import baseData.baseLoginTest;

public class CreateUser extends baseLoginTest {

    @Test
    public void createUser() throws Exception {
   
        Login loginPage = new Login(driver);
        loginPage.loginTest("Admin", "Admin@123$");

        WebElement utility = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Utility']")));
        utility.click();
        WebElement createUser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create User']")));
        createUser.click();

        WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtUserName']")));
        Username.sendKeys("Admin");
        Thread.sleep(1000);

        WebElement UserType = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ContentPlaceHolder2_ddlUserType']")));
        Select ddUserType = new Select(UserType);
        ddUserType.selectByIndex(1);

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtEmailID']")));
        email.sendKeys("admin@mailinator.com");

        WebElement statuscheck = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_chkActive']")));
        statuscheck.click();

        WebElement datepicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtSubscriptionValidFrom']")));
        datepicker.clear();
        datepicker.sendKeys("25/11/2025");
        datepicker.sendKeys(Keys.ENTER);

        WebElement datepicker1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtSubscriptionValidTill']")));
        datepicker1.clear();
        datepicker1.sendKeys("29/11/2025");
        datepicker1.sendKeys(Keys.ENTER);

        WebElement selectvehicle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='OD15SP2052']")));
        selectvehicle.click();

        WebElement menutoAssign = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_chklistMenu_0']")));
        menutoAssign.click();

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtUserPWD']")));
        password.sendKeys("Testing@123$");

    
        WebElement confpassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_txtConfPWD']")));
        confpassword.sendKeys("Testing@123$");
        
        Thread.sleep(1000);

        WebElement profileimg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_FileUpload_ProfileImage']")));
        String filePath = "C:\\Users\\cd03184\\Pictures\\Screenshots\\Screenshot (23).png";
        profileimg.sendKeys(filePath);

        WebElement upload1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnUpload']")));
        upload1.click();


        TakesScreenshot takes1 = (TakesScreenshot) driver;
     File src =takes1.getScreenshotAs(OutputType.FILE);
 File dir = new File("D:\\Sushmita.Project_Data\\1TestProjects\\3.vts\\AutomationScriptsData\\screenshot");
    
 if (!dir.exists()) {
          dir.mkdirs();
      }

      File name1 = new File(dir, "bug23.png");
     FileUtils.copyFile(src,name1);
      
      Thread.sleep(3000)
;
      WebElement savevbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_btnSave']")));
      savevbtn.click();
        
       
      Thread.sleep(3000)
      ;
   
      TakesScreenshot takes2 = (TakesScreenshot) driver;
      File srcFile = takes2.getScreenshotAs(OutputType.FILE);
         File dir3  =new File("D:\\Sushmita.Project_Data\\1TestProjects\\3.vts\\AutomationScriptsData\\screenshot");
    
         if (!dir3.exists())
         {
             dir3.mkdirs();
         }
        
         File destFile = new File(dir3, "emptypasswordfeild.png");
         FileUtils.copyFile(srcFile, destFile);
   
         
      
      

      
        
    }

}



