package TestCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import confiigration.configg;
import pom.ALoginPage;


public class ALoginTest extends BaseClass{  
	
	@Test
	public void loginMethod() {
		driver.get(configg.url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		ALoginPage ob =new ALoginPage(driver);
		Boolean ToolsEnable=ob.tool().isEnabled();
		System.out.println(ToolsEnable);
		Assert.assertTrue(ToolsEnable);
		
		ob.tool().click();
		ob.PGS().click();
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "interCT");
	}
}
