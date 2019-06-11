package Framework_Layer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 

public class Properties_Reader {

		String Fpath = "";
		InputStream inputStream;
	 
		public String getPropValues(String propertyToRead) throws IOException {
	 
			try {
				Properties prop = new Properties();
				String propFileName = "Configuration.properties";
	 
				inputStream = new FileInputStream("resources\\Configuration.properties");
	 
				if (inputStream != null) {
					prop.load(inputStream);
				} else {
					throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
				}
	 
				// get the property value and print it out
				Fpath = prop.getProperty(propertyToRead);
	 
			} catch (Exception e) {
				System.out.println("Exception: " + e);
			} finally {
				inputStream.close();
			}
			return Fpath;
		}
	}
	
