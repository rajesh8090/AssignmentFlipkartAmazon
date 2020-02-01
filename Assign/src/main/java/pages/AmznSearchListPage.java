package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmznSearchListPage 
{
   @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span[1]/span[2]/span[2]")
   private WebElement res;
   
   public AmznSearchListPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public String getresText()
   {
	   return res.getText();
   }
}
