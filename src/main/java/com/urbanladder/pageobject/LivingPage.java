package com.urbanladder.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.reusablecomponent.ReusableMethods;
import com.urbanladder.uistore.HeaderUI;
import com.urbanladder.uistore.LivingPageUI;
import com.urbanladder.uistore.SalePageUI;
import com.urbanladder.uistore.SearchPageUI;
public class LivingPage {
	LivingPageUI li = new LivingPageUI();
	
	private WebDriver driver;
	
	public LivingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getLivingResult() {
		return ReusableMethods.getElement(driver, li.livingresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getMattress() {
		return ReusableMethods.getElement(driver, li.mattress);
	}

}
