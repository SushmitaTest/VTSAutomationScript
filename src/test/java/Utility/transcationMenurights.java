package Utility;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.java.Login;
import Base.java.baseLoginTest;

public class transcationMenurights extends baseLoginTest {
@Test 
	public void menurights()
	{
		
		 Login loginPage = new Login(driver);
	       loginPage.loginTest("Admin", "Admin@123$");
	
	       WebElement utility = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Utility']")));
	       utility.click();
	      WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Menu Rights']")));
	       menu.click();
		
	String[]allusername=
	{
		"ctl00_ContentPlaceHolder2_chklistUser_0",
		"ctl00_ContentPlaceHolder2_chklistUser_1",
		/*"ctl00_ContentPlaceHolder2_chklistUser_2",
		"ctl00_ContentPlaceHolder2_chklistUser_3",
		"ctl00_ContentPlaceHolder2_chklistUser_4",
		"ctl00_ContentPlaceHolder2_chklistUser_5",
		"ctl00_ContentPlaceHolder2_chklistUser_6",
		"ctl00_ContentPlaceHolder2_chklistUser_7",
		"ctl00_ContentPlaceHolder2_chklistUser_8",
		"ctl00_ContentPlaceHolder2_chklistUser_9",
		"ctl00_ContentPlaceHolder2_chklistUser_10",
		"ctl00_ContentPlaceHolder2_chklistUser_11",
		"ctl00_ContentPlaceHolder2_chklistUser_12",
		"ctl00_ContentPlaceHolder2_chklistUser_13",
		"ctl00_ContentPlaceHolder2_chklistUser_14",*/
		
	};	
	
	for(int i=0 ;i<allusername.length;i++)
	{
		
	       WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(allusername[i])));
	       Username.click();	
	}       
	String[] menurights=
		{
				"ctl00_ContentPlaceHolder2_chklistMenu_0",
				"ctl00_ContentPlaceHolder2_chklistMenu_1",
				"ctl00_ContentPlaceHolder2_chklistMenu_2",
				
				"ctl00_ContentPlaceHolder2_chklistMenu_3",
				"ctl00_ContentPlaceHolder2_chklistMenu_4",
				"ctl00_ContentPlaceHolder2_chklistMenu_5",
			
	};
	       
	  for(int j = 0;j<menurights.length;j++)
	  {
		  WebElement menu1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id( menurights[j])));
		  menu1.click();
		  
		  if(!menu1.isSelected())
		  {
			  menu1.isEnabled()  ;
			  	  
			  
		  }
		  
	  }
	       
	       
	  WebElement assignbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_btnAssign")));
	  assignbtn.click();	       
	  WebElement TEXTMESS= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder2_lblMsg")));
	  String messge=TEXTMESS.getText().trim();
		String expectsucces="Menu right assigned successfully......!";      
		System.out.println(messge);
		System.out.println("the meesaage is " +expectsucces);
		  
	  Assert.assertTrue(messge.equalsIgnoreCase(expectsucces));
	  
	  
		
		
	}
	
	
	
}
