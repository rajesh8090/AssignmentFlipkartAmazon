package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileLib 
{

	public static String getDataFromPropertiesfile(String key) 
	{
		Properties prop= new Properties();
		try 
		{
	    prop.load(new FileInputStream("./properties/CommonData.properties"));
	    }
		catch(FileNotFoundException fnf)
		{
			fnf.getStackTrace();
		}
		catch(IOException ioe)
		{
			ioe.getStackTrace();
		}
		
		String value = prop.getProperty(key);
		return value;
	}
	
	
	
}
