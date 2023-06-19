package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ALoginPage {
	public WebDriver driver ;
	
	private By tool =By.xpath("//a[@class='toggle-tools']");
	private By PGS =By.xpath("(//img[@class='tool-icon'])[1]");
	
	public ALoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement tool() {
		return driver.findElement(tool);
	}
	
	public WebElement PGS() {
		return driver.findElement(PGS);
	}
}
