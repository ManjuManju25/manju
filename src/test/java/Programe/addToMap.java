package Programe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addToMap {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://stage.ceicdata.com/login");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("mkrishnamurthy@shravas.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Manju1234@");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//div[@title='Close']")).click();
		 WebElement ele1 = driver.findElement(By.xpath("//a[@title='View 1']"));
		 Actions act= new Actions(driver);
		act.moveToElement(ele1).contextClick().build().perform();
		driver.findElement(By.xpath("//div[@class='items-wrapper']//span[@title='Delete view']")).click();
		driver.findElement(By.xpath("//button[.='Ok']")).click();
		driver.findElement(By.xpath("//span[@class='searches-manager--reset-button button button__sm button__warning']")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@class='search-input-text']"));
		Thread.sleep(2000);
		ele.sendKeys("1692001");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@value='LIST']")).click();
		act.moveToElement(driver.findElement(By.xpath("//div[@data-view-item-id='view1005']/descendant::div[@class='series-item--name']"))).contextClick().build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Add chart']")).click();
		driver.findElement(By.xpath("//div[@class='icon--chart-area_large v6Emt8Bm0sLK7mrRgQtN']")).click();
		act.moveToElement(driver.findElement(By.xpath("//span[@class='visual-title--text text-dots']"))).contextClick().build().perform();
		
	}

}
