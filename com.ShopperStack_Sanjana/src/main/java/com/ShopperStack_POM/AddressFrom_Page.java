package com.ShopperStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFrom_Page {
	public AddressFrom_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Office")
	private WebElement officeRadioBtn;
	
	@FindBy(id="Name")
	private WebElement nameTextField;
	
	@FindBy(id="House/Office Info")
	private WebElement houseTextFiled;
	
	@FindBy(id="Street Info")
	private WebElement streetTextField;
	
	@FindBy(id="Landmark")
	private WebElement landmarkTextField;
	
	@FindBy(id="Country")
	private WebElement countryDropDown;
	
	@FindBy(id="State")
	private WebElement stateDropDown;
	
	@FindBy(id="City")
	private WebElement cityDropDown;
	
	@FindBy(id="Pincode")
	private WebElement pincodeTextField;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNoTextField;
	
	@FindBy(id="addAddress")
	private WebElement addAddressBtn;

	public WebElement getOfficeRadioBtn() {
		return officeRadioBtn;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseTextFiled() {
		return houseTextFiled;
	}

	public WebElement getStreetTextField() {
		return streetTextField;
	}

	public WebElement getLandmarkTextField() {
		return landmarkTextField;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getPhoneNoTextField() {
		return phoneNoTextField;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}
	
}
