package Framework_Layer;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Setup {
	
	public static WebDriver driver;
	public static String Fpath;
	public static Properties_Reader R;
	public Driver_Setup()
	{}
	
	
	public static void Set_Driver_Configurations() throws IOException
	{
		R = new Properties_Reader();
		Fpath = R.getPropValues("FirefoxDriverPath");
		System.setProperty("webdriver.gecko.driver",Fpath);
		driver = new FirefoxDriver();
	}

}
