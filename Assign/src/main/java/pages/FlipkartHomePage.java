package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage 
{
	
	@FindBy(name="q")private WebElement searchBox;
	@FindBy(xpath="/html/body/div[2]/div/div/button")private WebElement closebtn;
	
	
	
   public FlipkartHomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void setNameInSearchBoxAndClick(String name)
   {
	   searchBox.sendKeys(name,Keys.ENTER);
   }
   public void closeLoginPopup()
   {
	   closebtn.click();
   }
}
