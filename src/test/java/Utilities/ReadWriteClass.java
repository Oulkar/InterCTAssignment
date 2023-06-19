package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteClass {
	public static void main(String[] args) throws IOException {
		Properties prop =new Properties();
		FileInputStream instrm =new FileInputStream("C:\\Users\\ShubhamO\\eclipse-workspace\\Assignment\\Configurations\\configg.properties");
		prop.load(instrm);
		System.out.println(prop.getProperty("baseURL"));
		System.out.println(prop.getProperty("edgepath"));

		//FileOutputStream outputstrm =new FileOutputStream("C:\\Users\\ShubhamO\\eclipse-workspace\\Assignment\\Configurations\\config.properties");
		//prop.setProperty("edgepath", "C:\\Users\\ShubhamO\\eclipse-workspace\\Assignment\\Drivers\\msedgedriver.exe");
		//prop.store(outputstrm, null);
	}
}
