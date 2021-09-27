package com.urbanladder.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	public static Properties loadFile() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\config.properties");
		prop.load(fis);
		return prop;
	}

}
