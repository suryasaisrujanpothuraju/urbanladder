package com.urbanladder.reusablecomponent;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ReusableComponents {
	//Declare Driver Variable
	public static WebDriver driver;
	public Properties prop;
	public static WebDriver initializeDriver() throws IOException {
		//to get directory for relative path
		//System.out.println(new java.io.File(".").getCanonicalPath());
		
		//Getting Property value from Properties File
		//ReusableComponents.driver = driver;
		
		//getting Browser Property
		String browser = ReusableMethods.getBrowser(driver);
				//.getProperty("browser");
		
		//Seecting the correct browser
		if(browser.equals("chrome")) {
			
			//Google Chrome
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("edge")) {
			
			//Microsoft Edge
			System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(browser.equals("firefox")) {
			
			//Mozilla Firefox
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		//Set an Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	public void getScreenShot(String result) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Surya Sai Srujan\\Desktop\\urbanladder"+result+"Screenshot1.png"));

	}
	
//	public void getScreenshot(String result) throws IOException {
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("./Screenshots//"+result+"screenshot.png"));
//	}

}
