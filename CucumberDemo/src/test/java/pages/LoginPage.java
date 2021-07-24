package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static testBase.SetUpTest.driver;

public class LoginPage {

	By txt_username = By.id("name");
	By txt_password = By.id("password");
	By btn_login = By.id("login");
	By txt_logout = By.id("logout");

	private WebElement userName; 
	private WebElement password; 
	private WebElement loginButton; 
	private WebElement logoutTxt;

	public WebElement getUserName() { 
		
			userName =driver.findElement(txt_username); 
			return userName;  
		}

	public WebElement getPassword() {

		password = driver.findElement(txt_password); 
		return password; 
		}

	public WebElement getLoginButton() {

		loginButton = driver.findElement(btn_login); 
		return loginButton; 
		}

	public WebElement getLogoutTxt() {

		logoutTxt = driver.findElement(txt_logout); 
		return logoutTxt; 
		}
}
