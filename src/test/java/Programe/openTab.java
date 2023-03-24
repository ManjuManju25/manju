package Programe;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openTab {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Robot r= new Robot();
		for (int i = 0; i <=2; i++) 
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
		}
		Set<String> set1 = driver.getWindowHandles();
		ArrayList<String> list=new ArrayList<String>(set1);
        String index2 = list.get(0);
        driver.switchTo().window(index2);
        driver.get("http://www.gogle.com");
        String str="document.querySelector('body > ntp-app').shadowRoot.querySelector('#realbox').shadowRoot.querySelector('#input')";
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement ele1 = (WebElement)js.executeScript(str);
        ele1.sendKeys("manju");
        
        
        
		
		
		

	}

}
