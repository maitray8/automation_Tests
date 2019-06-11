package Framework_Layer;

import java.io.IOException;

public class Framework_Methods extends Driver_Setup{

	public static void OpenSite(String URL) throws IOException
	{
		Framework_Methods.Set_Driver_Configurations();
		driver.get(URL);
	}
	
}
