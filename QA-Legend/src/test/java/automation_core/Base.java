package automation_core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v120.runtime.Runtime;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
public	WebDriver driver;
public void intialise_browser(String browser)
{
	if(browser.equals("Chrome"))
	{
		driver=new ChromeDriver(); 
    }
	else if(browser.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	else if(browser.equals("Firefox"))
	{
		driver=new FirefoxDriver();
	}	
	else
	{
		throw new RuntimeException("Nivalid browser received");
	}
	driver.manage().window().maximize();
	driver.get("https://qalegend.com/billing/public/login");
}
@BeforeMethod
public void browserLaunch()
{
	intialise_browser("Chrome");
}
@AfterMethod
public void close_Browser()
{
	//driver.close();
}
}
