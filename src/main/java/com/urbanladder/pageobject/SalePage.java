package com.urbanladder.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.reusablecomponent.ReusableMethods;
import com.urbanladder.uistore.HeaderUI;
import com.urbanladder.uistore.SalePageUI;
import com.urbanladder.uistore.SearchPageUI;
public class SalePage {
	SalePageUI sa = new SalePageUI();
	
	private WebDriver driver;
	
	public SalePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getSaleResult() {
		return ReusableMethods.getElement(driver, sa.saleresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getSofaSet() {
		return ReusableMethods.getElement(driver, sa.sofaset);
	}

}
