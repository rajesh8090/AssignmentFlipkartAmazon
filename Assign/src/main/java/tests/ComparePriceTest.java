package tests;

import org.testng.annotations.Test;

import generics.BaseTest;
import pages.AmazonHomePage;
import pages.AmznSearchListPage;
import pages.FlipkartHomePage;
import pages.FlpkrtSearchListPage;

public class ComparePriceTest extends BaseTest
{
	public int flpkrtprice;
	public int Amznprice;
	
   @Test
   public void AgetFlipkartPrice()
   {
	   openFlipkart();
	   FlipkartHomePage flpkrtHP= new FlipkartHomePage(driver);
	   flpkrtHP.closeLoginPopup();
	   flpkrtHP.setNameInSearchBoxAndClick("iPhone XR(64 GB)");
	   
	   FlpkrtSearchListPage spl= new FlpkrtSearchListPage(driver);
	   String mrp = spl.getresText();
	   System.out.println(mrp);
	   
	   String s=mrp.substring(1).replace(",", "");
	   flpkrtprice=Integer.parseInt(s);
	   System.out.println(flpkrtprice);
   }
   
   @Test
   public void BgetAmazonPrice()
   {
	   openAmazon();
	   AmazonHomePage amznHP= new AmazonHomePage(driver);
	   amznHP.setNameInSearchBox("iPhone XR(64 GB)");
	   
	   AmznSearchListPage sp= new AmznSearchListPage(driver);
	   String mrp = sp.getresText();
	   System.out.println(mrp);
	   
	   String s = mrp.replace(",","");
	   Amznprice=Integer.parseInt(s);
	   System.out.println(Amznprice);   
   }
   @Test
   public void CcomparePrice()
   {
	   if(Amznprice>flpkrtprice)
	   {
		   System.out.println("Amazon iphone price is more");
	   }
	   else if(Amznprice<flpkrtprice)
	   {
		   System.out.println("Flipkart iphone price is more");
	   }
	   else
		   System.out.println("price is equal");
   }
}
