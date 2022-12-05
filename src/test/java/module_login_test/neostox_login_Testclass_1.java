package module_login_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import module_login_pom.neostox_baseclass;
import module_login_pom.neostox_homepage_pom;
import module_login_pom.neostox_loginpage1_pom;
import module_login_pom.neostox_noticepage_pom;
import module_login_pom.neostx_loginpage2_pom;
import module_login_pom.utilityclass_1;

public class neostox_login_Testclass_1 extends neostox_baseclass
{

	neostox_loginpage1_pom login1;
	neostx_loginpage2_pom login2;
	neostox_noticepage_pom notice;
	 neostox_homepage_pom home;
	@BeforeClass
	public void openthebrowser()
	{
		initialisedbrowser();
		
		// to crete the object of  the every pom classes
		login1= new neostox_loginpage1_pom(driver);
		
		// second pom class object
		 login2 = new neostx_loginpage2_pom(driver);
		 
		//for the notice page
	   notice= new neostox_noticepage_pom(driver);
	   
	   // for the home page
	    home=new neostox_homepage_pom(driver);
		
	}
	@BeforeMethod
	public void opentheapp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		login1.entermobileno(utilityclass_1.TestData(0, 0));
	
	//	login1.entermobileno(utilityclass_1.PFfile("MO.NO")); 
		
		// to click the btn
		login1.loginbtn();
		
		// to entre the pass from the second pom class
		login2.entrepass();
		login2.clickbtn();
		Thread.sleep(1000);
		login2.clickbtn();
		
		// to click the notice page
		Thread.sleep(1500);
		notice.noticepage();
		
	//	driver.switchTo().alert().dismiss();
		

	}
	@Test
	public void varifyuser()
	{
		  home.logovarify();
		
	}
	@AfterMethod
	public void logout(ITestResult s1) throws IOException
	{
		System.out.println("is it running");
		
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			utilityclass_1.screenshot(driver);
		}
		
	}
	@AfterClass
	public void closebrowser()
	{
		//driver.close();
	}
	
}
