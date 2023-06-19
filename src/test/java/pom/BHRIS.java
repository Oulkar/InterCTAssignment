package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BHRIS {
	public WebDriver driver ;
	
	private By HRIS =By.xpath("//a[@id='ctl00_mnuList_rmMenu_m0']");
	private By EDetails =By.xpath("//span[text()='Employee Details']");
	
	public BHRIS(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement HRIS() {
		return driver.findElement(HRIS);
	}
	
	public WebElement EDetails() {
		return driver.findElement(EDetails);
	}
}
