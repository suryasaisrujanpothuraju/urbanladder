package com.urbanladder.reusablecomponent;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.utility.PropertyFileReader;

public class ReusableMethods {
	
	public static void getURL(WebDriver driver) {
		try {
			driver.get(PropertyFileReader.loadFile().getProperty("url"));
		}
		catch(Exception e){
			System.out.println("URL not Found in config.properties");
		}
	}
	
	public static String getBrowser(WebDriver driver) {
		try {
			return PropertyFileReader.loadFile().getProperty("browser");
		}
		catch(Exception e){
			System.out.println("Browser not Found in config.properties");
			return null;
		}
	}
	
	public static void impWait(WebDriver driver) throws NumberFormatException, IOException {
		
		int time = Integer.parseInt(PropertyFileReader.loadFile().getProperty("wait1"));
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	public static WebElement getElement(WebDriver driver, By locator) {
		try {
			WebElement l =  driver.findElement(locator);
			return l;
		}
		catch(Exception e) {
			//throw new TestException("Could not locate element at"+locator);
			System.out.println("Element not Found at"+locator);
			return null;
		}
		
	}
	public static boolean click(By selector, WebDriver driver) {
		try {
			driver.findElement(selector).click();
			return true;
		}catch(Exception e ) {
			System.out.println(String.format("Element do not exist",selector));
		}
		return false;
		
	}
	public static boolean sendkeys(By selector , String value , WebDriver driver) {
		try {
			driver.findElement(selector).sendKeys(value);
			return true;
			
		}catch(Exception e) {
			System.out.println(String.format("Element do not exist", selector));
		}
		
		return false;
		
	}
	
	
	


}
