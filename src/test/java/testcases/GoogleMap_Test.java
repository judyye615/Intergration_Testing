package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dataProviderFactory.DataProviderFactory;
import helper.BaseClass;
import helper.browserFactory;
import pages.GoogleMap;

public class GoogleMap_Test extends BaseClass {

	GoogleMap gMap;

	@Test(priority = 1, description = "move the map pin A", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_A() throws InterruptedException, FileNotFoundException, IOException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);
	
		driver.switchTo().frame(0);
		Thread.sleep(200);

		try {
			
			gMap.click_ZoomOut_Button();
			Thread.sleep(500);
			
		} catch (Exception e) {
			
			driver.quit();
		    driver = browserFactory.StartBrowser(DataProviderFactory.getConfig().getBrowser(),
		               DataProviderFactory.getConfig().getStagingURL());
			
		}


		gMap.moveToElement_A();
		Thread.sleep(200);

		gMap.clickAndHold_A();
		Thread.sleep(300);

		gMap.dragAndDrop_A(-310, -200);
		gMap.dragAndDrop_A(120, -50);

		Thread.sleep(200);

	}

	@Test(priority = 2, description = "move the map pin A 2nd time", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_A_twice() throws InterruptedException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);
	
		Thread.sleep(500);

		gMap.moveToElement_A();
		Thread.sleep(200);

		gMap.clickAndHold_A();
		Thread.sleep(300);

		gMap.dragAndDrop_A(-310, -200);
		gMap.dragAndDrop_A(10, 50);
		Thread.sleep(200);

	}

	@Test(priority = 3, description = "move the map pin A multiple times", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_A_multi() throws InterruptedException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);
		
		//System.out.println("==== 3rd and Other ====");
		Integer[] xOffset = { -10, 10, -30 };
		Integer[] yOffset = { 10, -50, 30 };

		for (int i = 2; i <= xOffset.length + 1; i++) {

			WebElement map_Pin_A2 = driver
					.findElement(By.xpath("//*[contains(@aria-label,'change')]/../div[" + i + "]/img"));

			int x = xOffset[i - 2];
			int y = yOffset[i - 2];

			Thread.sleep(200);

			gMap.moveToElement_A2();
			Thread.sleep(200);

			gMap.clickAndHold_A2();
			Thread.sleep(200);

			gMap.dragAndDrop_A2(-310, -200);
			gMap.dragAndDrop_A2(x, y);
			Thread.sleep(500);

			//System.out.println("Path: " + map_Pin_A2);
			Thread.sleep(300);


		}

	}

	@Test(priority = 4, description = "move the map pin B", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_B() throws InterruptedException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);
		
		Thread.sleep(200);

		gMap.moveToElement_B();
		Thread.sleep(200);

		gMap.clickAndHold_B();
		Thread.sleep(300);

		gMap.dragAndDrop_B(-310, -200);
		gMap.dragAndDrop_B(-30, -50);
		Thread.sleep(200);


	}

	@Test(priority = 5, description = "move the map pin B", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_B_twice() throws InterruptedException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);

		//System.out.println("==== 2nd ===");
		gMap.moveToElement_B2();
		Thread.sleep(200);

		gMap.clickAndHold_B2();
		Thread.sleep(300);

		gMap.dragAndDrop_B2(-310, -200);
		gMap.dragAndDrop_B2(-30, -40);
		Thread.sleep(1000);


	}

	@Test(priority = 6, description = "move the map pin C", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_C() throws InterruptedException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);

		Thread.sleep(200);

		gMap.moveToElement_C();
		Thread.sleep(200);

		gMap.clickAndHold_C();
		Thread.sleep(300);

		gMap.dragAndDrop_C(-510, -200);
		gMap.dragAndDrop_C(-130, -30);
		Thread.sleep(100);


	}

	@Test(priority = 7, description = "move the map pin D", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_D() throws InterruptedException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);

		Thread.sleep(200);

		gMap.moveToElement_D();
		Thread.sleep(200);

		gMap.clickAndHold_D();
		Thread.sleep(300);

		gMap.dragAndDrop_D(-510, -200);
		Thread.sleep(500);
		gMap.dragAndDrop_D(-50, -30);
		Thread.sleep(300);


	}

}