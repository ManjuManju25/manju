package Programe;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOption {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("safebrowsing.enabled", "true"); 
        options.setExperimentalOption("prefs", prefs); 
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("disable-infobars");
       WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
	}

}
