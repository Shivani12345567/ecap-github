package pom_practice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;


public class SauceDemo {
	
	public WebDriver driver;
	public  SauceDemo (WebDriver driver) {
		this.driver=driver;
	}
	//repository for element present on login
	By UsernameTxtBox=By.id("user-name");
	By passTextBox=By.id("password");
	By loginBtn=By.id("login-button");
	
	public void enterURL() throws InterruptedException {
		driver.get("https://www.saucedemo.com/v1/index.html");
		Thread.sleep(3000);
	}
	public void enterUsername(String un) {
		driver.findElement(UsernameTxtBox).sendKeys(un);
	}
	public void enterPassword(String pass) {
		driver.findElement(passTextBox).sendKeys(pass);
	}
	public void clickonLogin(){
		driver.findElement(loginBtn).click();
	}

}