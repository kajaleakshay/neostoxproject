package module_login_pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.collections4.Get;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass_1 
{
	// for the excel sheet
	public static String TestData(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
//		FileInputStream file = new FileInputStream("C:\\Users\\GEEK\\eclipse-workspace\\neostox_build04\\TestData\\neostoxdetails.xlsx");
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\neostoxdetails.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("neostox");
		String mobileno = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		
		return mobileno;
	}
	
	// for the screenshot of the failtestcase
	public static void screenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\GEEK\\eclipse-workspace\\neostox_build04\\failtestcasescreenshot//no.jpg");
		
		FileHandler.copy(src, dest);
	}
	
	public static String PFfile(String key) throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\propertyfile.properties");
		
		Properties p = new Properties();
		p.load(file);
		
		 String value = p.getProperty(key);
		
		return value;
	}
	

}
