package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pages.AmazonHomePage;

public class BaseTest implements IAutoConstant 
{
      public WebDriver driver;
      public AmazonHomePage amzn;
      
       static
       {
	     System.setProperty(CHROME_KEY, CHROME_VALUE);
	     System.setProperty(GECKO_KEY, GECKO_VALUE);	
       }
@BeforeTest
public void launchBrowser()
{
	String browser=FileLib.getDataFromPropertiesfile("browser");
	if(browser.equals("chrome"))
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();	
	}
	else if(browser.equals("firefox"))
	{
		driver= new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(PLTO, TimeUnit.SECONDS);
}
@BeforeMethod
public void openFlipkart()
{
	String url=FileLib.getDataFromPropertiesfile("Flipkart_URL");
	driver.get(url);
}
public void openAmazon()
{
	String url=FileLib.getDataFromPropertiesfile("Amazon_URL");
	driver.get(url);
}

@AfterTest
public void closeBrowser()
{
	driver.close();
}

}
