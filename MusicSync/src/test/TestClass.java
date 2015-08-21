package test;

import java.io.IOException;
import common.util.ConfigReader;

public class TestClass {

	public static void main(String[] args) throws IOException
	{
		System.out.println("Hello world!!!");
		
		ConfigReader configReader = new ConfigReader("app.config.txt");
		System.out.println(configReader.getProperty("MusicFolder"));
	}
	
}
