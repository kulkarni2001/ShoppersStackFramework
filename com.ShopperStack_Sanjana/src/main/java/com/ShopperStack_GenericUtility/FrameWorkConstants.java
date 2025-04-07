package com.ShopperStack_GenericUtility;

public interface FrameWorkConstants {
	
		Java_Utility javaUtility=new Java_Utility();
	
		final static String propertyFilePath="./src/test/resources/testData/shoppersstackProperty.properties";
		
		final static String excelFilePath="./src/test/resources/testData/shopperStack.xlsx";
		
		final static String screenshotPath="./screenshot/"+ javaUtility.getLocaleDateandTime() +".png";
		
		final static String reportsPath="./reports/"+javaUtility.getLocaleDateandTime()+".html";
		
		final static String chromekey="webdriver.chrome.driver";
		
		final static String chromeValue="./src/main/resources/driver/chromedriver.exe";
		
}
