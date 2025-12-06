package baseData;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class baseLoginTest {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void setUp()
    {
    	
    	
       driver = new ChromeDriver();
    
    	//WebDriverManager.firefoxdriver().setup();
    	//driver=new FirefoxDriver();
    	
        driver.manage().window().maximize();
        driver.get("https://vtsodishav2.m-techinnovations.com/VTSGPSLogin.aspx");  
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        /* driver.findElement(By.id("txtUserName1")).sendKeys("Admin");

            WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@type='password'][1]")));
           password.sendKeys("Admin@123$");
           driver.findElement(By.id("btnLogin")).click(); */
    }
    
 /*@Test
  public void testLogin() throws InterruptedException {
                Login loginPage = new Login(driver);
                loginPage.loginTest("Admin", "Admin@123$");
                
            }*/
            
    	
   
@AfterMethod
	public void logout() throws InterruptedException {

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
		   

		
	
} //method


}// end the class



