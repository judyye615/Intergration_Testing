package helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


 
public class utility {
 
   public static WebElement waitForElement(WebDriver driver, WebElement element) {
 
       // Created a wait object for 10 seconds wait
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

 
       // waiting for webelement to be visible
       wait.until(ExpectedConditions.visibilityOf(element));
       // waiting for webelement to be clickable
       wait.until(ExpectedConditions.elementToBeClickable(element));
 
       return element;
       
   }
 
   public static void validateMessage(WebElement element, String msg) {
       Assert.assertEquals(element.getText(), msg);
   }
 

 
   public static String getTime() {
       DateFormat dateformat = new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");
       return dateformat.format(new Date());
   }
 
}
