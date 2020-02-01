package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage
{
	@FindBy(id="twotabsearchtextbox") private WebElement searchBox;
	
	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setNameInSearchBox(String name)
	{
		searchBox.sendKeys(name,Keys.ENTER);
	}

}
