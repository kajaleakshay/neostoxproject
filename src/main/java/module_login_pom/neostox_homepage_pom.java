package module_login_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class neostox_homepage_pom 
{
	@FindBy(xpath = "//img[@alt='logo']") private WebElement logo;
	
	public neostox_homepage_pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void logovarify()
	{
		boolean reslut = logo.isDisplayed();
	
	}
	
}
