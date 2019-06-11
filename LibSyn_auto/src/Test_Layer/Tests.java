package Test_Layer;

import java.io.IOException;

import org.testng.annotations.Test;

import Framework_Layer.Framework_Methods;


public class Tests {

	
	@Test
	public void Access_Site() throws IOException 
	{
		// TODO Auto-generated method stub
		Framework_Methods.OpenSite("http://www.google.com");
	
	}

}
