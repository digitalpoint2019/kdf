package testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import utilities.browserEngine;
import utilities.elementLocators;
import utilities.testData;

public class T02_loginpageValidation {
	
	public static WebDriver driver;
	

	
	  public static void openBrowser() throws MalformedURLException {
		 
		 //Code for TS_001 - Open the Browser
		 
        driver=browserEngine.browserConfig();
		  
		 // driver=gridEngine.browsetup();
    
	  }
			 
			 
   public static void loadloginPage() {
		 
		 // TS_002 - Navigate to Website
		 
		 driver.get(testData.loginpageURL);
}

	 
	 public static void validateTitle1()
	 
	 //TS-003 -Validate login page Title 
	 
	 {
		String loginpageaTitle=driver.getTitle();
		
		Assert.assertEquals(loginpageaTitle, testData.loginpageexpectedTitle);
	 }
	 
	 
	 
	 public static void loginFunctionality ()
	 
	 {
		 
				
				driver.findElement(elementLocators.loginUID).sendKeys(testData.loginUID);
				
				driver.findElement(elementLocators.loginPW).sendKeys(testData.loginPW);
				
				//TS_007 Click the login button 
				driver.findElement(elementLocators.loginButton).click();
				
		 }
	 
		 
		 
	
		 
		 //TS_007 -Validate After login page Title 
		 
		 public static void validateTitle2()
		 
	 {
			 String afterloginatitle =driver.getTitle();
			 
			 Assert.assertEquals(afterloginatitle,testData.afterloginexpectedtitle);
			 
			 //Assert.assertTrue(false);
			 
			 
			 
					 
		 }
		 
		 
	
		 
		 // TS_008 - Click on Drop Down
		 public static void logoutFunctionality ()
		 
		 {
			 driver.findElement(elementLocators.logoutdropdownButton).click();
			 
			 // TS_009 -Click on Logout 
			 
			 driver.findElement(elementLocators.logoutButton).click();
			 
		 }
		
@AfterMethod
public static void tearDown() {
	  
	  //TS_010 -Close the Browser 
	  
	 driver.close();
}


}
