package other;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkWorkingFineOrNot {
	public static void main(String[] args) {
	 System.setProperty("webdriver.edge.driver", "C:\\Users\\ShubhamO\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		//WebDriverManager
		WebDriver driver =new EdgeDriver();
		driver.get("https://onlinect.sharepoint.com/sites/interct/Pages/Home.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> link=driver.findElements(By.partialLinkText("a")); //a
		System.out.println(link);
		
//		WebElement LogTicket = driver.findElement(By.xpath("(//a[@class='cursor-pointer'])[23]"));
//		LogTicket.click();
		
		//String url;
		//assert.assertEquals("https://servicedesk.citiustech.com/MDLIncidentMgmt/EndUser_Dashboard.aspx", url);
	}
}
