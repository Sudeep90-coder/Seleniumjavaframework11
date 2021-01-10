package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Propertiesfile {

	public static void main(String[] args) {
		getproperties();
		setproperties();
		getproperties();
	}

	
	public static void getproperties() {
		try {
			
			Properties prop = new Properties();
			
			InputStream input = new FileInputStream("C:\\Users\\sudee\\Documents\\Java workspace\\Seleniumjavaframework\\src\\main\\java\\Config\\Config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");	
			System.out.println(browser);
		
			//Testgooglesearch_TestNGdemo.browsername= prop.getProperty("Browser")
			
			
			
			
		}catch(Exception exp) {
			
	System.out.println(exp.getMessage());
	System.out.println(exp.getCause());
	exp.fillInStackTrace();
				
		}
	
	}
	
	public static void setproperties() {
		
		try {
			
			Properties prop = new Properties();
			OutputStream output = new FileOutputStream("C:\\Users\\sudee\\Documents\\Java workspace\\Seleniumjavaframework\\src\\main\\java\\Config\\Config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
		} catch (Exception exp) {
			
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	
}
