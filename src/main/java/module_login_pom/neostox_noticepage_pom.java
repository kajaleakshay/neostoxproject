package module_login_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class neostox_noticepage_pom 
{
	
	
	
	
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement okbtn;
	
	@FindBy(xpath = "//a[@data-target='modal_buyplans']")private WebElement closebtn;
	
	public neostox_noticepage_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void noticepage()
	{
		
		okbtn.click();
		
		closebtn.click();
	}
	

}
