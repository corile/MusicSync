package common.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader extends Properties {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3963222626709149031L;
	
	public ConfigReader(String configFile) throws IOException
	{
		super();
		FileInputStream in = new FileInputStream(configFile);
		this.load(in);
	}

}
