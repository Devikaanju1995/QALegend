package testscript;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation_core.Base;
import utilities.Excel_Utility;



public class Login_Page_Test extends Base
{
	@Test
	public void verify_Loginwith_Valid_Credentials()
	{
		String username=Excel_Utility.get_StringData(0, 0, "loginpage");
		WebElement username_field=driver.findElement(By.xpath("//input[@id='username']"));
		username_field.sendKeys(username);
		
	    String user_password=Excel_Utility.get_StringData(0, 1, "loginpage");
		WebElement password_field=driver.findElement(By.xpath("//input[@id='password' and @class='form-control']"));
		password_field.sendKeys(user_password);
		
		WebElement login_button=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		login_button.click();
		
		WebElement alert_application_tour=driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm']"));
		alert_application_tour.click();
	}
	
	public void verify_Errormessage_Whileloginwith_InvalidCredentials()
	{
		
	}
}
