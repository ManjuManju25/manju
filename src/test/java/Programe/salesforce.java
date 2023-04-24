package Programe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesforce {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://trailhead.salesforce.com/content/learn/modules/cc-digital-for-developers/cc-business-manager");
	    driver.findElement(By.xpath("//strong[.='Merchandisers']")).click();
	    String result = driver.findElement(By.xpath("(//*[name()='svg' and starts-with(@class,'slds-icon slds-icon_x-small')])[1]")).getText();
	    
	}

}
