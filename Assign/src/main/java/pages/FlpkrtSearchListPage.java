package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlpkrtSearchListPage 
{
   @FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div")
   private WebElement res;
   
   public FlpkrtSearchListPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public String getresText()
   {
	   return res.getText();
   }
}
