package Programe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleShadowDomElement {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
//		static WebDriver driver;
//	    public static void main(String[] args) throws InterruptedException 
//	    {   
//	    	WebDriverManager.chromedriver().setup();
////	        System.setProperty("webdriver.chrome.driver", "C:\\Utility\\BrowserDrivers\\chromedriver.exe");
//	        ChromeOptions options = new ChromeOptions();
//	        options.addArguments("start-maximized");
//	        //options.addArguments("disable-infobars");
//	        options.addArguments("--disable-extensions"); 
//	        driver = new ChromeDriver(options);
//	        driver.get("chrome://downloads/");
//	        WebElement root1 = driver.findElement(By.tagName("downloads-manager"));
//	        WebElement shadow_root1 = expand_shadow_element(root1);
//
//	        WebElement root2 = shadow_root1.findElement(By.cssSelector("downloads-toolbar#toolbar"));
//	        WebElement shadow_root2 = expand_shadow_element(root2);
//
//	        WebElement root3 = shadow_root2.findElement(By.cssSelector("cr-toolbar#toolbar"));
//	        WebElement shadow_root3 = expand_shadow_element(root3);
//
//	        WebElement root4 = shadow_root3.findElement(By.cssSelector("cr-toolbar-search-field#search"));
//	        WebElement shadow_root4 = expand_shadow_element(root4);
//
//	        WebElement search_term = shadow_root4.findElement(By.cssSelector("div#searchTerm input#searchInput"));
//	        String js = "arguments[0].setAttribute('value','pdf')";
//	        ((JavascriptExecutor) driver).executeScript(js, search_term);
//
//	        WebElement search_button = shadow_root4.findElement(By.cssSelector("paper-icon-button#icon"));
//	        search_button.click();
//
//	        System.out.println("Search Button Clicked");
//	    }
//
//	    public static WebElement expand_shadow_element(WebElement element)
//	    {
//	        WebElement shadow_root = (WebElement)((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot", element);
//	        return shadow_root;
//	    }
		  
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver = new ChromeDriver();
			 JavascriptExecutor js=(JavascriptExecutor)driver;
	    	driver.get("chrome://settings/clearBrowserData");
	    	driver.manage().window().maximize();
	    	Thread.sleep(3000);
	    	WebElement clearData = (WebElement) js.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\").shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#basicPage > settings-section:nth-child(9) > settings-privacy-page\").shadowRoot.querySelector(\"settings-clear-browsing-data-dialog\").shadowRoot.querySelector(\"#clearBrowsingDataConfirm\")");
	    	//WebElement clearData = (WebElement) js.executeScript("return document.querySelector('settings-ui').shadowRoot.querySelector('settings-main').shadowRoot.querySelector('settings-basic-page').shadowRoot.querySelector('settings-section > settings-privacy-page').shadowRoot.querySelector('settings-clear-browsing-data-dialog').shadowRoot.querySelector('#clearBrowsingDataDialog').querySelector('#clearBrowsingDataConfirm')");
	    	// now you can click on clear data button
	    	clearData.click();
	    	Robot r= new Robot();
	    	r.keyPress(KeyEvent.VK_CONTROL);
	    	r.keyPress(KeyEvent.VK_T);
	    	r.keyRelease(KeyEvent.VK_CONTROL);
	    	r.keyRelease(KeyEvent.VK_T);
	    	Thread.sleep(2000);
	    	Set<String> drive = driver.getWindowHandles();
	    	ArrayList<String> s= new ArrayList<String>(drive);
	    	String id = s.get(0);
	    	driver.switchTo().window(id);
//	    	JavascriptExecutor js1 = (JavascriptExecutor) driver; 
//	    	WebElement clearData1 = (WebElement) js1.executeScript("return document.querySelector(\"body > ntp-app\").shadowRoot.querySelector(\"#realbox\").shadowRoot.querySelector(\"#input\")");
//	    	clearData1.sendKeys("manjunath");
	    	driver.navigate().to("https://trailhead.salesforce.com/?tb_cmp=growth_paid_search&gclid=EAIaIQobChMIksTKtIX8_QIVvsmUCR2_yQQxEAAYASAAEgI4HvD_BwE&gclsrc=aw.ds"); 
	        WebElement clearData1 = (WebElement) js.executeScript("return document.querySelector(\"#contextnav\").shadowRoot.querySelector(\"div.contextnav > div > div.contextnav__wrapper > nav.contextnav__ctas > div.contextnav__ctas-button-container.cta-primary > hgf-button\")");
	    	clearData1.click();
	    	String id2 = s.get(1);
	    	driver.switchTo().window(id2);
	    	WebElement ele3 = (WebElement)js.executeScript("return document.querySelector(\"body > ntp-app\").shadowRoot.querySelector(\"#realbox\").shadowRoot.querySelector(\"#input\")");
	    	ele3.sendKeys("manju");
	    	Thread.sleep(2000);
			driver.navigate().to("https://www.google.com/");
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("manju");
			   String text = driver.findElement(By.xpath("//div[@class='mkHrUc']")).getText();
			   System.out.println(text);
	  
			
			
			
				
//	    	

	    }

}
