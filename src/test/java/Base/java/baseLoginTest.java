package Base.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class baseLoginTest {

	public WebDriver driver;
@BeforeMethod
	public void setUp() {

		// -----login btn----------------------------------------

		driver = new ChromeDriver();
		driver.get("https://vtsodishav2.m-techinnovations.com/VTSGPSLogin.aspx");
		driver.manage().window().maximize();

		// ----- login process----------------------------------------
		driver.findElement(By.id("txtUserName1")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password'][1]")).sendKeys("Admin@123$");
		driver.findElement(By.id("btnLogin")).click();
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
