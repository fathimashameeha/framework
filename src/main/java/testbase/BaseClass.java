package testbase;
//package com.ip.crm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import testcases.LogoutPage;



public class BaseClass 
{
public static WebDriver driver = null;
	
	@BeforeTest
	public void basicsSetup()  throws IOException{
		System.setProperty("webdriver.chrome.driver","C:\\selnium\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://freecrm.co.in/");

	}
	@Test(priority = 0)
	public void home() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginData("shameeha778@gmail.com", "Cogmento55");
		LogoutPage logout = new LogoutPage(driver);
		logout.setMainSettings();
		logout.setClickSetting();
		logout.setClickLogout();
	}
	
	@Test(priority = 1)
	public void logout() {
		LogoutPage logout = new LogoutPage(driver);
		logout.setClickSetting();
		logout.setClickLogout();
		
	}
	@AfterTest
	public void tearDown() {
		 BaseClass.driver.quit();
	}
	
}
