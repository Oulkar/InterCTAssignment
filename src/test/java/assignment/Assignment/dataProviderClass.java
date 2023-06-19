package assignment.Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderClass {
	@Test(dataProvider="passdata")
	public void logIn(String nam, String pwd) {
		System.out.println("name: "+nam);
		System.out.println("password: "+pwd);
	}
	
	@DataProvider(name="passdata")
	public Object[][] getData(){
		return new Object[][]{{"shubham","shubham123"},{"pawan","pawan123"},{"raj","raj123"}};
	}
}
