package Programe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkAadharStatusCheck 
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.incometax.gov.in/iec/foportal/");
		driver.findElement(By.xpath("//div[contains(@class,'homepage_left col-lg-4 col-md-4')]//div[contains(@class,'form-group')]//div[2]//a[1]")).click();
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("GFZPS9148D");
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("307883368219");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    WebElement check = driver.findElement(By.xpath("//span[.=' Link aadhaar']"));
	    System.out.println(check.getText());
	    if(check.getText()=="Link aadhaar")  {
	    	System.out.println("aadhar is not linked with the pan (for link the pan click on the link aadhar)");
	    	check.click();
	    }
	   else{
	    	System.out.println("aadhar is already linked with the pan");
	    	driver.findElement(By.xpath("//button[.=' Ok ']")).click();
	    }
		
	
		// id = driver.findElement(By.xpath("//span[.=' Your PAN CUXXXXXX3Q is already linked to given Aadhaar 75XXXXXXXX32 ']"));





	}
}
