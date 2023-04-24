package Programe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check {

	public static void main(String[] args) {

           WebDriverManager.chromedriver().setup();
           ChromeDriver driver= new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.get("https://main.d3cepj7i9hoehy.amplifyapp.com/#/home");
           if(driver.findElement(By.xpath("//a[normalize-space()='Software Sales']")).isEnabled())
           {
        	   System.out.println("is enabled");
           }
           else
           {
        	   System.out.println("is nor enabled");
           }
	}

}
