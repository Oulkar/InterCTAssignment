package TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Utility1;
import pom.CTravelClasss;

public class CTravelTest extends BaseClass{  
	@Test
	public void TravelMethod() throws InterruptedException, IOException {
		System.out.println("Travel class start");
		CTravelClasss ob = new CTravelClasss(driver);
		//String wid=ob.WindowId().getText();
	    //Assert.assertEquals(wid, "CentriCT");
		//System.out.println(wid);
		Thread.sleep(20);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)", "");
		
		//Boolean travelCheck= ob.travel().isEnabled();
		//Assert.assertTrue(travelCheck);  
		ob.travel().click();		
		System.out.println("clicked on Travel");
		Thread.sleep(10);
	
		ob.travel().click();
		Thread.sleep(10);

		ob.allocations();
		
		Utility1 ob2 =new Utility1();
		ob2.screenshotMethod(driver,"1");
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,350)", "");
		
		ob.remove().click();
		
		driver.switchTo().alert().accept();
		ob2.screenshotMethod(driver,"2");
				
		//ob.save().click();
		//driver.quit();
	}
}
