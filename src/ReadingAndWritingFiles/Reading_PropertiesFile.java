package ReadingAndWritingFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Reading_PropertiesFile {

	
	public static void main(String[] args) throws IOException {
	
	FileInputStream fs = new FileInputStream("D:\\Application\\Aishwarya_Selenium\\General\\Employee.Properties");
	Properties prop = new Properties();
	prop.load(fs);
	
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("age"));
	System.out.println(prop.getProperty("city"));
	
	//Current project directory path
	System.out.println(System.getProperty("user.dir"));
	
	
	}

}

