package module_login_pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class neostox_loginpage1_pom
{
	// use the encapsulation concept for the to create the pom classes
	//1- make variabe private
	//2-make constructor public
	//3-used it in the method 
	
	@FindBy(xpath = "//input[@type='number']") private WebElement mobileno;
	
	@FindBy(xpath = "(//a[text()='Sign Up'])[2]") private WebElement loginbtn;
	
	public neostox_loginpage1_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entermobileno(String mono) throws EncryptedDocumentException, IOException
	{
		mobileno.click();
		mobileno.sendKeys(mono);
	}
	
	public void loginbtn()
	{
		loginbtn.click();
	}
	

}
