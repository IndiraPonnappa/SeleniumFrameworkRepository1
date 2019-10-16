package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNGDemo_AmazonSearch;

public class PropertiesFile {
	static Properties prop= new Properties();
	static String Projectpath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();


	}
	public static void getProperties(){

		try{


			InputStream input = new FileInputStream(Projectpath+"/src/test/java/config/config.properties");
			prop.load(input);
			String Browser=prop.getProperty("browser");
			System.out.println(Browser);
			TestNGDemo_AmazonSearch.Browsername=Browser;
		}
		catch(Exception exp){

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();


		}
	}
	public static void setProperties(){
		try {
			OutputStream output = new FileOutputStream(Projectpath+"/src/test/java/config/config.properties");
			prop.setProperty("browser", "Firefox");
			prop.store(output, "Browser is set to new value");
			

		} 
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

			exp.printStackTrace();
		}

	}


}
