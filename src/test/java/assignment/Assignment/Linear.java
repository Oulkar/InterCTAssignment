package assignment.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Linear {
	public static void main(String[] args) throws InterruptedException, IOException {
	    //System.setProperty("webdriver.edge.driver", "C:\\Users\\ShubhamO\\Downloads\\edgedriver_win32 (2)\\msedgedriver.exe");
	    //WebDriverManager
		//ChromeDriver driver = new ChromeDriver();
	    WebDriver driver =new EdgeDriver();
		//System.setProperty("webdriver.http.factory", "jdk-http-client");

		driver.get("https://onlinect.sharepoint.com/sites/interct/Pages/Home.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement tool = driver.findElement(By.xpath("//a[@class='toggle-tools']"));
		tool.click();
		                                                                                                                       
		WebElement PGS = driver.findElement(By.xpath("(//img[@class='tool-icon'])[1]"));
		PGS.click();
		
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 =driver.getWindowHandles();
		
		
		Iterator<String> itr = s1.iterator();
		while(itr.hasNext()) {
			String ChildWindow =itr.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
			}
		}
		
		WebElement HRIS = driver.findElement(By.xpath("//a[@id='ctl00_mnuList_rmMenu_m0']"));
		HRIS.click();
		
		WebElement EDetails = driver.findElement(By.xpath("//span[text()='Employee Details']"));
		EDetails.click();
		
		WebElement travel =driver.findElement(By.xpath("//td[@id='tdTravel']"));
		travel.click();
		
		for(int i=1; i<5;i++) {
		Thread.sleep(4000);
		WebElement country = driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_cboTravelCountry']"));
		Select opcountry = new Select(country);
		opcountry.selectByIndex(i);
		Thread.sleep(2000);
		
		WebElement travelType = driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_cboTypeOfTravel']"));
		Select obtravelType = new Select(travelType);
		obtravelType.selectByIndex(i);
		
		WebElement noOfTrips = driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_cboTravelNoOfTrips']"));
		Select opnoOfTrips = new Select(noOfTrips);
		opnoOfTrips.selectByIndex(1);
		
		WebElement travelDuration = driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_cboTravelEstDuration']"));
		Select obtravelDuration = new Select(travelDuration);
		obtravelDuration.selectByIndex(3);
		
		WebElement remark=driver.findElement(By.xpath("//textarea[@id='txtTravelRemarks']"));
		remark.sendKeys("Remark"+i);
		
		WebElement add=driver.findElement(By.xpath("//input[@id='btnTravelAdd']"));
		add.click();
		}
		
		TakesScreenshot srcShot =((TakesScreenshot)driver);
		File SrcFile =srcShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File("C:\\Users\\ShubhamO\\eclipse-workspace\\Assignment\\target\\screenshot1.png"));
		
		Thread .sleep(4000);
	
		WebElement remove =driver.findElement(By.xpath("(//img[@alt='Remove'])[2]"));
		remove.click();
		
		driver.switchTo().alert().accept();
		
		TakesScreenshot srcShot2 =((TakesScreenshot)driver);
		File SrcFile2 =srcShot2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile2, new File("C:\\Users\\ShubhamO\\eclipse-workspace\\Assignment\\target\\screenshot2.png"));
		
		WebElement save =driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$cmdSave']"));
		save.click();
	}
}
