package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import helper.*;
import pages.GoogleMap;

public class GoogleMap_TestB extends BaseClass {

	GoogleMap gMap;

	@Test(priority = 8, description = "move the map pin B", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_B() throws InterruptedException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);

		driver.switchTo().frame(0);

		Thread.sleep(200);

		gMap.click_ZoomOut_Button();
		Thread.sleep(500);

		gMap.moveToElement_B1();
		Thread.sleep(200);

		gMap.clickAndHold_B1();
		Thread.sleep(300);

		gMap.dragAndDrop_B1(-310, -200);
		gMap.dragAndDrop_B1(20, -50);
		Thread.sleep(300);

	}

	@Test(priority = 9, description = "move the map pin B 2nd time", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_B_twice() throws InterruptedException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);
	

		Thread.sleep(200);

		gMap.moveToElement_B2();
		Thread.sleep(200);

		gMap.clickAndHold_B2();
		Thread.sleep(300);

		gMap.dragAndDrop_B2(-310, -200);
		gMap.dragAndDrop_B2(-30, -30);
		Thread.sleep(300);

		
	}

	@Test(priority = 10, description = "move the map pin C", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_C() throws InterruptedException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);
	

		Thread.sleep(200);

		gMap.moveToElement_C();
		Thread.sleep(200);

		gMap.clickAndHold_C();
		Thread.sleep(300);

		gMap.dragAndDrop_C(-510, -200);
		gMap.dragAndDrop_C(-40, -10);
		Thread.sleep(300);

	}

	@Test(priority = 11, description = "move the map pin B 3rd time", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_B_third() throws InterruptedException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);

		Thread.sleep(200);

		gMap.moveToElement_B2();
		Thread.sleep(200);

		gMap.clickAndHold_B2();
		Thread.sleep(300);

		gMap.dragAndDrop_B2(-310, -200);
		gMap.dragAndDrop_B2(-20, 30);
		Thread.sleep(300);

	}

	@Test(priority = 12, description = "move the map pin C", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_C2() throws InterruptedException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);

		Thread.sleep(200);

		gMap.moveToElement_C();
		Thread.sleep(200);

		gMap.clickAndHold_C();
		Thread.sleep(300);

		gMap.dragAndDrop_C(-310, -200);
		gMap.dragAndDrop_C(40, -10);
		Thread.sleep(300);

	}

	@Test(priority = 13, description = "move the map pin C", retryAnalyzer = helper.rerun.class)
	public void move_mapPin_C3() throws InterruptedException {

		gMap = PageFactory.initElements(driver, GoogleMap.class);
		Thread.sleep(200);

		gMap.moveToElement_C();
		Thread.sleep(200);

		gMap.clickAndHold_C();
		Thread.sleep(300);

		gMap.dragAndDrop_C(-810, -200);
		gMap.dragAndDrop_C(-30, -10);
		Thread.sleep(300);

	}

}
