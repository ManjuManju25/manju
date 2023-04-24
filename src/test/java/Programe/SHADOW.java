package Programe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SHADOW {
	
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://google.com");	
	      JavascriptExecutor js= (JavascriptExecutor)driver;
	     
		WebElement ele = (WebElement) js.executeScript("return document.querySelector(\"body > ntp-app\").shadowRoot.querySelector(\"#realbox\").shadowRoot.querySelector(\"#input\")");
	      ele.sendKeys("manju");
	}

}
