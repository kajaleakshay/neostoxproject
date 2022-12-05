package module_login_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class neostox_noticepage_pom 
{
	
	@FindBy(xpath = "(//span[@aria-hidden='true'])[21]")private WebElement cancelbtn;
	
	@FindBy(xpath = "(//a[@data-dismiss='modal'])[25]") private WebElement closebtn;
	
	
	public neostox_noticepage_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void noticepage()
	{
	
		cancelbtn.click();
		
		closebtn.click();
		
		
	}
	

}
