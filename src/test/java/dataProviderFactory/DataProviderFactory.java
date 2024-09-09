package dataProviderFactory;
 
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class DataProviderFactory {
 
   public static configDataProvider getConfig() throws FileNotFoundException, IOException {
 
       // Creates an object of the configdataProvider class to access the methods
       configDataProvider config = new configDataProvider();
       return config;
   }
 
}
