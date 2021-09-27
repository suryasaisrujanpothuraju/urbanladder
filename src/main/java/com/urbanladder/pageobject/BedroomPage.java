package com.urbanladder.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.reusablecomponent.ReusableMethods;
import com.urbanladder.uistore.BedroomPageUI;
import com.urbanladder.uistore.HeaderUI;
import com.urbanladder.uistore.LivingPageUI;
import com.urbanladder.uistore.SalePageUI;
import com.urbanladder.uistore.SearchPageUI;
public class BedroomPage {
	BedroomPageUI bp = new BedroomPageUI();
	
	private WebDriver driver;
	
	public BedroomPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getBedroomResult() {
		return ReusableMethods.getElement(driver, bp.bedroomresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getDiningStorage() {
		return ReusableMethods.getElement(driver, bp.diningstorage);
	}

}
