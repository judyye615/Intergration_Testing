package helper;
 
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
 
public class browserFactory {
 
   static WebDriver driver;
 
   public static WebDriver StartBrowser(String browserName, String url) {
 
	   
	   Dimension d = new Dimension(1920,1080);
	   
       // Windows User should add .exe after geckodriver
       if (browserName.equalsIgnoreCase("Firefox")) {
           System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
           FirefoxOptions firefoxOptions = new FirefoxOptions();
           firefoxOptions.addArguments("--headless");
           firefoxOptions.addArguments("--no-sandbox");
           driver.manage().window().setSize(d);
           driver = new FirefoxDriver();
           driver.manage().window().maximize();
           
       } // Windows User should add .exe after chromedriver
       else if (browserName.equalsIgnoreCase("Chrome")) {
    	   
    	   try {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	           ChromeOptions chromeOptions = new ChromeOptions();
	           chromeOptions.addArguments("--headless");
	           chromeOptions.addArguments("--no-sandbox");
	           driver = new ChromeDriver();
	           driver.manage().window().setSize(d);
	           
	           //driver.manage().window().maximize();
	           //driver.manage().window().fullscreen();
	           
		} catch (Exception e) {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/128/chromedriver");
	           ChromeOptions chromeOptions = new ChromeOptions();
	           chromeOptions.addArguments("--headless");
	           chromeOptions.addArguments("--no-sandbox");
	           driver = new ChromeDriver();
	           driver.manage().window().setSize(d);
		}
          
 
       }
       driver.get(url);
       return driver;
   }
 
}
