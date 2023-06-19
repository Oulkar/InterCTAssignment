package assignment.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExcelSheet {
	
	@Test(dataProvider="testdata")
	public void DemoProject(String username, String password) {
		System.out.println("Username is: "+username+" and Password is: "+ password);	
	}
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
		ReadExcelFile config =new ReadExcelFile("C:\\Users\\ShubhamO\\eclipse-workspace\\Assignment\\source\\Book1.xlsx");
		int rows = config.getRowCount(0);
		
		Object[][] credentials =new Object[rows][2];
		for(int i=0;i<rows;i++) {
			credentials[i][0]=config.getData(0,i,0);
			credentials[i][1]=config.getData(0,i,1);
		}
		return credentials;	
	}
}
