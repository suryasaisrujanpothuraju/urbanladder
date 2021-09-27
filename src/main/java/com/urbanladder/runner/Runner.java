package com.urbanladder.runner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.urbanladder.pageobject.BedroomPage;
import com.urbanladder.pageobject.DiningPage;
import com.urbanladder.pageobject.Header;
import com.urbanladder.pageobject.LivingPage;
import com.urbanladder.pageobject.SalePage;
import com.urbanladder.pageobject.SearchPage;
import com.urbanladder.pageobject.StoragePage;
import com.urbanladder.pageobject.StudyPage;
import com.urbanladder.reusablecomponent.ReusableComponents;
import com.urbanladder.reusablecomponent.ReusableMethods;
import com.urbanladder.utility.PropertyFileReader;
import com.urbanladder.utility.dataDriven;


public class Runner extends ReusableComponents{
	private dataDriven dd;
	public static Logger log =  (Logger) LogManager.getLogger(Runner.class.getName());
	private Header h;
	private SearchPage s;
	private SalePage sa;
	private LivingPage li;
	private BedroomPage bp;
	private DiningPage dp;
	private StoragePage sp;
	private StudyPage st;
	
	WebDriver driver; 

	public Runner() throws IOException {
		super();
		dd = new dataDriven();
		driver = ReusableComponents.initializeDriver();
		h = new Header(driver);
		s = new SearchPage(driver);
		sa = new SalePage(driver);
		li = new LivingPage(driver);
		bp = new BedroomPage(driver);
		dp = new DiningPage(driver);
		sp = new StoragePage(driver);
		st = new StudyPage(driver);
		
	}

		@BeforeTest
		public void homePage() throws IOException {
			
			driver.manage().window().maximize();
			ReusableMethods.getURL(driver);
			

		}
	//Header Test
		
		
		@Test (priority = 0)
		public void Login() {
			Actions a = new Actions(driver);
			WebElement move=h.loginstep1();//drop down without clicking
			a.moveToElement(move).build().perform(); //context click means right click
			h.login().click();
			System.out.println("hovered --------------------------------------------");
			System.out.println("clicked-------------------------------");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			h.entermail().sendKeys("suryasaisrujanpothuraju@gmail.com");
			h.enterpassword().sendKeys("mindtree2021");
			h.loginbutton().click();
			log.info("logged in srujan");
		}
		
		
	
	@Test (priority = 1,dataProvider="getSearchData")
	public void DiningTable(String name) throws IOException {
		h.getSearchBox().sendKeys(name);
		h.getSearchBoxClick().click();
		System.out.println(s.getSearchResult().getText());
		log.info("searched for dining table and verified it");

	}
	
	
	
	@Test (priority = 2)
	public void Sale() throws InterruptedException {
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebElement move=h.getSale();//drop down without clicking
		a.moveToElement(move).build().perform();//context click means right click
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        s.getSale().click();
		System.out.println(sa.getSaleResult().getText());
		log.info("clicked on sale and verfied it");
	}
	
	
	@Test (priority = 3)
	public void Living() throws InterruptedException {
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebElement move=h.getLiving();//drop down without clicking
		a.moveToElement(move).build().perform(); //context click means right click
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        sa.getSofaSet().click();
		System.out.println(li.getLivingResult().getText());
		log.info("clicked on living and verfied it");
	}
	
	@Test (priority = 4)
	public void Bedroom() throws InterruptedException {
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebElement move=h.getBedroom();//drop down without clicking
		a.moveToElement(move).build().perform(); //context click means right click
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        li.getMattress().click();
		System.out.println(bp.getBedroomResult().getText());
		log.info("clicked on bedroom and verfied it");

	}
		
	
	@Test (priority = 5)
	public void Storage() throws InterruptedException {
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebElement move=h.getStorage();//drop down without clicking
		a.moveToElement(move).build().perform(); //context click means right click
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		dp.getShopByRange().click();
		System.out.println(sp.getStorageResult().getText());
		log.info("clicked on storage and verfied it");

	}
	
	@Test (priority = 6)
	public void Study() throws InterruptedException {
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebElement move=h.getStudy();//drop down without clicking
		a.moveToElement(move).build().perform(); //context click means right click
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        sp.getStudyLamp().click();
		System.out.println(st.getStorageResult().getText());
		log.info("clicked on study and verfied it");

	}
	
	@Test (priority = 7)
	public void Kids() throws InterruptedException {
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebElement move=h.getKidsRoom();//drop down without clicking
		a.moveToElement(move).build().perform(); //context click means right click
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		st.getKidsDecor().click();
		System.out.println(driver.getTitle());
		log.info("clicked on kids and verfied it");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
	
	
	
	@Test (priority = 8)
	public void GiftCard() throws InterruptedException {
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		h.getGiftCard().click();
		System.out.println(driver.getTitle());
		log.info("clicked on giftcard and verified it");
		
	}
	
	
	@Test (priority = 9)
	public void BulkOrder() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		h.getBulkOder().click();
		System.out.println(driver.getTitle());
		log.info("clicked on bulkorder and verified it");

	}
	
	
	
	@DataProvider
	public Object[][] getSearchData() throws IOException {
		ArrayList<String> h = dd.getData("TestData","Search");
		int ct = h.size();
		Object[][] data = new Object[ct-1][1];
		
		for(int i = 1; i < ct ; i++) {
			
			data[i-1][0] = h.get(i);
		}
		return data;
		
	}
	
	
}
