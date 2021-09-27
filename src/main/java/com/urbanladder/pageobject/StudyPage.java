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
import com.urbanladder.uistore.StudyPageUI;
public class StudyPage {
	StudyPageUI st = new StudyPageUI();
	
	private WebDriver driver;
	
	public StudyPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//-----------------------------------------------------------------
	public WebElement getStorageResult() {
		return ReusableMethods.getElement(driver, st.storageresult);
	}
	
	//-----------------------------------------------------------------
	public WebElement getKidsDecor() {
		return ReusableMethods.getElement(driver, st.kidsdecor);
	}

}
