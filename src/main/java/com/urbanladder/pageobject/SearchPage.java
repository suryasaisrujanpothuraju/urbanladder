package com.urbanladder.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.reusablecomponent.ReusableMethods;
import com.urbanladder.uistore.HeaderUI;
import com.urbanladder.uistore.SearchPageUI;
public class SearchPage {
	SearchPageUI s = new SearchPageUI();
	
	private WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getSearchResult() {
		return ReusableMethods.getElement(driver, s.searchresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getSale() {
		return ReusableMethods.getElement(driver, s.sale);
	}

}
