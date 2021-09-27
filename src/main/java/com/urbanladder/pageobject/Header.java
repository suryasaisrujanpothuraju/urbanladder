package com.urbanladder.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.reusablecomponent.ReusableMethods;
import com.urbanladder.uistore.HeaderUI;

public class Header{
	
	HeaderUI h = new HeaderUI();
	
	private WebDriver driver;
	
	public Header(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getSearchBox() {
		return ReusableMethods.getElement(driver, h.searchbox);
	}
	
	//-----------------------------------------------------------------
	public WebElement getSearchBoxClick() {
		return ReusableMethods.getElement(driver, h.searchboxclick);
	}
	
	//-----------------------------------------------------------------
	public WebElement getSale() {
		return ReusableMethods.getElement(driver, h.sale);
	}
	
	//-----------------------------------------------------------------
	public WebElement getLiving() {
		return ReusableMethods.getElement(driver, h.living);
	}
	
	//-----------------------------------------------------------------
	public WebElement getBedroom() {
		return ReusableMethods.getElement(driver, h.bedroom);
	}
	
	//-----------------------------------------------------------------
	public WebElement getdining() {
		return ReusableMethods.getElement(driver, h.dining);
	}
	
	//-----------------------------------------------------------------
	public WebElement getStorage() {
		return ReusableMethods.getElement(driver, h.storage);
	}
	
	//-----------------------------------------------------------------
	public WebElement getStudy() {
		return ReusableMethods.getElement(driver, h.study);
	}
	
	//-----------------------------------------------------------------
	public WebElement getKidsRoom() {
		return ReusableMethods.getElement(driver, h.kidsroom);
	}
	
	//-----------------------------------------------------------------
	public WebElement getBulkOder() {
		return ReusableMethods.getElement(driver, h.bulkorder);
	}
	
	//-----------------------------------------------------------------
	public WebElement getGiftCard() {
		return ReusableMethods.getElement(driver, h.giftcard);
	}
	
	
	//-----------------------------------------------------------------
	
	
	
	public WebElement loginstep1() {
		return ReusableMethods.getElement(driver, h.loginb1);

	}public WebElement signin() {
		return ReusableMethods.getElement(driver, h.signupoption);

	}public WebElement login() {
		return ReusableMethods.getElement(driver, h.loginoption);

	}public WebElement entermail() {
		return ReusableMethods.getElement(driver, h.entermail);

	}public WebElement enterpassword() {
		return ReusableMethods.getElement(driver, h.enterpassword);

	}public WebElement  loginbutton() {
		return ReusableMethods.getElement(driver, h.loginbutton);

	}
}
