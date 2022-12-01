package module_login_pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class neostox_baseclass 
{
	 public WebDriver driver;
	public void initialisedbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GEEK\\eclipse-workspace\\neostox_build04\\browserfile\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		 driver.get("https://neostox.com/"); // it is used in the utility class
		 
		 driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	}
	

}
