package Test_Layer;

import java.io.IOException;

import org.testng.annotations.Test;

import Framework_Layer.Framework_Methods;
import Framework_Layer.Properties_Reader;


public class Tests {

Framework_Layer.Properties_Reader reader1 = new Properties_Reader();
	
	@Test
	public void Access_Site() throws IOException 
	{
		// TODO Auto-generated method stub
		String URL = reader1.getPropValues("ApplicationURL");
		Framework_Methods.OpenSite(URL);
	
	}

}
