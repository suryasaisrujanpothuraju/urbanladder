package com.urbanladder.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.reusablecomponent.ReusableMethods;
import com.urbanladder.uistore.BedroomPageUI;
import com.urbanladder.uistore.DiningPageUI;
import com.urbanladder.uistore.HeaderUI;
import com.urbanladder.uistore.LivingPageUI;
import com.urbanladder.uistore.SalePageUI;
import com.urbanladder.uistore.SearchPageUI;
import com.urbanladder.uistore.StoragePageUI;
public class StoragePage {
	StoragePageUI sp = new StoragePageUI();
	
	private WebDriver driver;
	
	public StoragePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getStorageResult() {
		return ReusableMethods.getElement(driver, sp.storageresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getStudyLamp() {
		return ReusableMethods.getElement(driver, sp.studylamps);
	}

}
