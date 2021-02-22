package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPageTest
{
WebDriver driver;
	
	public LoginPageTest(WebDriver driver) {
		this.driver=driver;
		}
	By clicksetting = By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div/a[1]");
	By clicklogout = By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div/a[5]");
	
	public void setClickSetting() {
		driver.findElement(clicksetting).click();
	}
	
	public void setClickLogout() {
		driver.findElement(clicklogout).click();
		System.out.println("Logout Successfully");
	}
}
