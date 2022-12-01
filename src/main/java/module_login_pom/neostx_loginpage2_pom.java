package module_login_pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class neostx_loginpage2_pom 
{
	// used the encapsulation concept here to create the pom classes
	
	@FindBy(xpath = "//input[@id='txt_accesspin']") private WebElement pass;
	
	@FindBy(xpath = "//a[text()='Submit']") private WebElement submit;
	
	public neostx_loginpage2_pom(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
	}
	
	public void entrepass() throws EncryptedDocumentException, IOException
	{
		pass.sendKeys(utilityclass_1.TestData(0,1));
	}
	
	public void clickbtn()
	{
		submit.click();
	}

}
