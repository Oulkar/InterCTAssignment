package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CTravelClasss {
	public WebDriver driver ;
	
	public CTravelClasss(WebDriver driver) {
		this.driver=driver;
	}
	
	//private By WindowId =By.xpath("//span[@id='ctl00_ContentPlaceHolder1_lblWindowID1']");
	private By travel =By.xpath("//td[@id='tdTravel']");      ////td[@id='tdTravel']
	private By country =By.xpath("//select[@id='ctl00_ContentPlaceHolder1_cboTravelCountry']");
	private By travelType =By.xpath("//select[@id='ctl00_ContentPlaceHolder1_cboTypeOfTravel']");
	private By noOfTrips =By.xpath("//select[@id='ctl00_ContentPlaceHolder1_cboTravelNoOfTrips']");
	private By travelDuration =By.xpath("//select[@id='ctl00_ContentPlaceHolder1_cboTravelEstDuration']");
	private By remark =By.xpath("//textarea[@id='txtTravelRemarks']");
	private By add =By.xpath("//input[@id='btnTravelAdd']");
	private By remove =By.xpath("(//img[@alt='Remove'])[2]");
	private By save =By.xpath("//input[@name='ctl00$ContentPlaceHolder1$cmdSave']");
	
	/*public WebElement WindowId() {
		return driver.findElement(WindowId);
	}*/
	
	public WebElement travel() {
		return driver.findElement(travel);
	}
	
	public WebElement country() {
		return driver.findElement(country);
	}
	
	public WebElement travelType() {
		return driver.findElement(travelType);
	}
	
	public WebElement noOfTrips() {
		return driver.findElement(noOfTrips);
	}
	
	public WebElement travelDuration() {
		return driver.findElement(travelDuration);
	}
	
	public WebElement remark() {
		return driver.findElement(remark);
	}
	
	public WebElement add() {
		return driver.findElement(add);
	}
	
	public WebElement remove() {
		return driver.findElement(remove);
	}
	
	public WebElement save() {
		return driver.findElement(save);
	}
	
	public void allocations() throws InterruptedException {
		for(int i=1; i<5;i++) {	
			Select opcountry = new Select(country());
			opcountry.selectByIndex(i);
			String a =opcountry.getFirstSelectedOption().getText();
			
			Select obtravelType = new Select(travelType());
			obtravelType.selectByIndex(i);
			
			Select opnoOfTrips = new Select(noOfTrips());
			if(i%2==1) {
			    opnoOfTrips.selectByIndex(1);
			}
			else{
			    opnoOfTrips.selectByIndex(2);
			};
			
			Select obtravelDuration = new Select(travelDuration());
			if(i%3==1) {
				obtravelDuration.selectByIndex(1);
			}			
			if(i%3==2){
				obtravelDuration.selectByIndex(2);
			}	
			if(i%3==0){
				obtravelDuration.selectByIndex(3);
			};
			
			remark().sendKeys(a);
			add().click();
			Thread.sleep(8000);
			}	
	}
}
