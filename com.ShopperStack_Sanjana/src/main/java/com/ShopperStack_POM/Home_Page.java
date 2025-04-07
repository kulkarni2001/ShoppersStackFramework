package com.ShopperStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'BaseBadge-badge MuiBadge-badge MuiBadge-standard MuiBadge-anchorOriginBottomRight')]")
	private WebElement acoountSettingBtn;
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfileBtn;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logOutBtn;

	public WebElement getAcoountSettingBtn() {
		return acoountSettingBtn;
	}

	public WebElement getMyProfileBtn() {
		return myProfileBtn;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
	
}
