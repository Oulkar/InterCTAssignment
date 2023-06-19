package TestCases;

import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Utility1;
import pom.BHRIS;

public class BHRISTest extends BaseClass {
	@Test
	public void BHRISmethod() throws InterruptedException {
		Utility1 obj1 =new Utility1();
		obj1.WindowHandleMethod();

		BHRIS obj2 = new BHRIS(driver);
		obj2.HRIS().click();
		obj2.EDetails().click();
        Thread.sleep(10);
	}
}
