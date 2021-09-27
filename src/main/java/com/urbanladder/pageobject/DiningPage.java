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
public class DiningPage {
	DiningPageUI dp = new DiningPageUI();
	
	private WebDriver driver;
	
	public DiningPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getDiningResult() {
		return ReusableMethods.getElement(driver, dp.diningresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getShopByRange() {
		return ReusableMethods.getElement(driver, dp.shopbyrange);
	}

}
