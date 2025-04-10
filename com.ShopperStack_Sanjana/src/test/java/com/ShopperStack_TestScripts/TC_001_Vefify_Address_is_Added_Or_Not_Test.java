package com.ShopperStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStack_GenericUtility.Base_Test;
import com.ShopperStack_POM.AddressFrom_Page;
import com.ShopperStack_POM.MyAddresses_Page;
import com.ShopperStack_POM.MyProfile_Page;


public class TC_001_Vefify_Address_is_Added_Or_Not_Test extends Base_Test {

	@Test
	public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.out.println("Add a Address ");
		homePage.getAcoountSettingBtn().click();
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myProfilePage=new MyProfile_Page(driver);
		myProfilePage.getMyAddressesBtn().click();
		Thread.sleep(1000);
		MyAddresses_Page myAddressesPage=new MyAddresses_Page(driver);
		myAddressesPage.getAddAddressBtn().click();
		
		AddressFrom_Page addressFormPage=new AddressFrom_Page(driver);
		addressFormPage.getOfficeRadioBtn().click();
		addressFormPage.getNameTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 0));
		addressFormPage.getHouseTextFiled().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 1));
		addressFormPage.getStreetTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 2));
		addressFormPage.getLandmarkTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 3));
		
		webDriverUtility.selectByvalue(addressFormPage.getCountryDropDown(), 
				fileUtility.readDataFromPropertyFile("country"));
		webDriverUtility.selectByvalue(addressFormPage.getStateDropDown(), 
				fileUtility.readDataFromPropertyFile("state"));
		webDriverUtility.selectByvalue(addressFormPage.getCityDropDown(), 
				fileUtility.readDataFromPropertyFile("city"));
		
		addressFormPage.getPincodeTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 4));
		addressFormPage.getPhoneNoTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 5));
		addressFormPage.getAddAddressBtn().click();
		
		myAddressesPage.getCloseBtn().click();
		webDriverUtility.getWebPageScreenShot(driver);
	
	}
}
