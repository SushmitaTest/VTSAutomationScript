package Base.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class baseLoginTest {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
     
    	try
    	{
            driver = new ChromeDriver();
            driver.get("https://vtsodishav2.m-techinnovations.com/VTSGPSLogin.aspx");
            driver.manage().window().maximize();

           
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            driver.findElement(By.id("txtUserName1")).sendKeys("Admin");

            WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@type='password'][1]")));
           password.sendKeys("Admin@123$");
           driver.findElement(By.id("btnLogin")).click();
    	}
           
           
     catch (Exception e) {

        System.err.println("Exception diaplay setUp: " + e.getMessage());
      
     
    }
    


       
	
    }
//@AfterMethod
	/*public void logout() throws InterruptedException {

		// -----logout btn----------------------------------------

		Thread.sleep(3000);
		WebDriverWait wait17 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement logoutp = wait17.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@data-toggle='dropdown'])[2]")));
		logoutp.click();
		Thread.sleep(3000);
		WebDriverWait wait18 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement logbtn = wait18.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Logout']")));
		logbtn.click();

		// -----browser close----------------------------------------
		Thread.sleep(3000);
		driver.quit();

		
	}*/

}// end the class
