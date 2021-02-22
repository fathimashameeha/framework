package testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

	WebDriver driver;
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		}
	By mainSetting = By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div");
	By clicksetting = By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div/a[1]");
	By clicklogout = By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div/a[5]");
	
	public void setMainSettings() {
		driver.findElement(mainSetting).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void setClickSetting() {
		driver.findElement(clicksetting).click();
	}
	
	public void setClickLogout() {
		driver.findElement(clicklogout).click();
		System.out.println("Logout Successfully");
	}
}









