package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility1 extends BaseClass {

	public void screenshotMethod(WebDriver driver, String ScreenshotName) throws IOException {
		TakesScreenshot srcShot =((TakesScreenshot)driver);
		File SrcFile =srcShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File(System.getProperty("user.dir")+ "//target//Screenshot//screenshot"+ScreenshotName+".png"));	
	}
	
	public String ScreenshotMethod2(String testCasename, WebDriver driver) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	File file = new File(System.getProperty("user.dir")+"//reports//"+testCasename+".png");
	FileUtils.copyFile(source, file);
	return System.getProperty("user.dir")+"//reports//"+testCasename+".png";
	}
	
	public void WindowHandleMethod(){
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> itr = s1.iterator();
		while (itr.hasNext()) {
			String ChildWindow = itr.next();
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
			}
		}
	}
}
