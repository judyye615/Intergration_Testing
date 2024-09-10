package helper;

import dataProviderFactory.DataProviderFactory;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
 
import java.io.FileNotFoundException;
import java.io.IOException;
 
import org.openqa.selenium.WebDriver;

 
public class BaseClass {
 
	public WebDriver driver;

	 
	 
	   @BeforeClass
	   public void setupBrowser() throws FileNotFoundException, IOException {
	 
	       System.out.println("LOG INFO: Before suite running...setting up report");
	 
	       System.out.println("LOG INFO: After suite running...reports are ready to use");
	 
	       System.out.println("LOG INFO: Creating browser session");
	       
	       driver = browserFactory.StartBrowser(DataProviderFactory.getConfig().getBrowser(),
	               DataProviderFactory.getConfig().getStagingURL());
	 
	       System.out.println("LOG INFO: Browser session created");
	 
	   }

	 
		@AfterSuite
		public void closeSession() {
	 
			System.out.println("\nLOG INFO: Closing browser session");
			driver.quit();
			System.out.println("LOG INFO: Browser session closed");
		}
 
}
