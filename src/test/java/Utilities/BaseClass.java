package Utilities;

//import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	//public Logger log=LogManager.getLogger(BaseClass.class);
      
	public static ExtentReports getReportObject() {		
		String path =System.getProperty("user.dir")+"//reports/index.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Assignment Report");
		reporter.config().setDocumentTitle("Test results");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester name", "Shubham");	
		return extent;
	}
	
    @BeforeSuite
	public void EdgeDriverInvoke() {
	   // System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//Drivers//msedgedriver.exe");
	   EdgeOptions option = new EdgeOptions();
       option.addArguments("--remote-allow-origins=*");
       WebDriverManager.edgedriver().setup();
       driver = new EdgeDriver(option);
	   
	   
    	//ChromeOptions option = new ChromeOptions();
       // option.addArguments("--remote-allow-origins=*");
       // WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver(option);
	   
    	//driver =new ChromeDriver();
	    // driver =new EdgeDriver(); 
	    System.out.println("browser is invokedd"); 
	}
	
	/*@AfterClass
	public void QuitMethod() {
		driver.quit();
	}*/
}
