package Programe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dupicateString {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://trailhead.salesforce.com/content/learn/modules/cc-digital-merchandising/digital-product-data");
//		WebElement element = driver.findElement(By.xpath("//a[.='Technology']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		Point p = element.getLocation();
//		int x=p.getX();
//		int y=p.getY();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy("+x+","+y+")");
//		Thread.sleep(2000);
//		element.click();
//		WebElement value = driver.findElement(By.xpath("//h2[.='Trending in technology']"));
//		String text = value.getText();
//		driver.close();
		
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(2000);
//		element.click();
//		System.out.println(element.getText());
		
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
//		Thread.sleep(2000);
//		element.click();
//		Actions act= new Actions(driver);
//		WebElement ele=driver.findElement(By.xpath("//a[.='Knowledge']"));
//		act.moveToElement(ele).perform();
//		ele.click();
//		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='#Career-Advice']"))).contextClick().build().perform();
//		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='#Career-Advice']"))).doubleClick().build().perform();
//		
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'After completing this unit, you’ll be able to:')]"));
		String value = text.getText();
		System.out.println(value);
		
		
		
		
		

	}
}