package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
			Properties prop;

				public ReadConfig() {
					
					String FilePath = "Config.properties";
					try {
						FileInputStream fis = new FileInputStream(FilePath);
						prop = new Properties();
						prop.load(fis);
					} catch (Exception e) {
						System.out.println("Error message " + e.getMessage());
					} 
					
					
				}

				// Get Application baseURl
				public String getApplicationURL() {
					System.out.println(prop.getProperty("BaseUrl"));
					return prop.getProperty("BaseUrl");
					
				}

				// Get browser Name
				public String getBrowserName() {
					return prop.getProperty("Browser");
				}
}