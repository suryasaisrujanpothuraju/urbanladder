package com.urbanladder.uistore;

import org.openqa.selenium.By;

public class HeaderUI {
	
	public By searchbox = By.id("search");
	
	public By searchboxclick = By.xpath("//*[@id=\"search_button\"]/span");
	
	public By sale = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[1]/span");  

	public By living = By.xpath("//*[@id=\"app-container\"]/div/header/div[2]/nav/ul/li[2]/h4");  //*[@id="app-container"]/div/header/div[2]/nav/ul/li[2]/h4
	//*[@id=\"topnav_wrapper\"]/ul/li[2]/span

	public By bedroom = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[3]/span");

	public By dining = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[4]/span");
	
	public By storage = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[5]/span"); 

	public By study = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[6]/span");

	public By kidsroom = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[7]/span"); 
	
	public By bulkorder = By.xpath("//*[@id=\"app-container\"]/div/header/section/div/ul[2]/li[2]/a"); 
	
	public By giftcard = By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[3]/a");
	
	public By loginb1=By.xpath("//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]");
	public By signupoption=By.xpath("//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span/ul/li[2]/a");
	public By loginoption=By.xpath("//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span/ul/li[1]/a");
	public By entermail=By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/input");
	public By enterpassword=By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/div/div/input");
	public By loginbutton=By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/input[3]");
	


}
