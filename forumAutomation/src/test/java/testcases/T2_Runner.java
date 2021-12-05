package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import utilities.logCollection;
import utilities.readextData;
import utilities.testData;

public class T2_Runner {
	
	@Test(groups = {"smokeTest"}, priority=1)
	
	
	public static void userlogin() throws Exception
	{
		//Declaring location of the external excel data file 
	String sPath = testData.externalData;
	 //Here we are passing the Excel path and SheetName as arguments to connect with Excel file
	
	 readextData.readexcelData(sPath,"loginpage");
	 
	 for (int iRow=1;iRow<=7; iRow++)
	 {
	 String keywords = readextData.readcellData(iRow, 3); 
	 //Comparing the value of Excel cell with all the keywords in the "Actions" class
	 if(keywords.equals("openBrowser"))
	 { 
		 T02_loginpageValidation.openBrowser();
		 
		 logCollection.info("Browser is opened");
		 
		 System.out.println("Browser is opened");
	 }
	 else if(keywords.equals("loadloginPage"))
	 {
		 T02_loginpageValidation.loadloginPage();
		 
		 logCollection.info("Application under test is loaded");
	 }
	 else if(keywords.equals("validateloginTitle"))
	 {
		 T02_loginpageValidation.validateTitle1();
	 logCollection.info("Validate the login page title");
		 
		 System.out.println("Validate the login page title");
	}
	 else if(keywords.equals("loginFunctionality"))
	 {
		 T02_loginpageValidation.loginFunctionality ();
	 }
	 else if(keywords.equals("validateafterloginTitle"))
	 {
		 T02_loginpageValidation.validateTitle2();
	 } 
	 
		 
	 else if
	 ( keywords.equals("logoutFunctionality")) {
		 
		 T02_loginpageValidation.logoutFunctionality();
		 
	 }
	 
	 
	 else if(keywords.equals("tearDown"))
	 {
		 T02_loginpageValidation.tearDown();
	 } 
            
	 
	}

	}
}


