package com.generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(),'Login')]")
	private WebElement logInBtn1;
	
	@FindBy(xpath="(//*[@name='email'])[1]")
	private  WebElement emailField;
	
	@FindBy(xpath="//*[@name='password']")
	private  WebElement password;
	
	
	@FindBy(xpath="//button[contains(text(), 'Login')]")
	private WebElement logIn2;
	
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	private WebElement logoutBtn;
	
	//Costco
	@FindBy(xpath="(//a[contains(text(),'Services')])[1]")
	private WebElement services;
	
	//Drag & Drop
	@FindBy(xpath="//div[contains(text(),'Oslo')and @id='box1']")
	private WebElement dragOslo;
	
	@FindBy(xpath="//div[contains(text(),'Norway')]")
	private WebElement dropNorway;
	
	
	
	
	@FindBy(xpath="//div[contains(text(), 'Washington') and @id='box3']")
	private WebElement washington;
	
	@FindBy(xpath="//div[contains(text(), 'United States')]")
	private WebElement unitedStates; 
	
	//zoopla
	@FindBy(xpath="//span[contains(text(), 'Accept all cookies')]")
	private List<WebElement> acceptCookiesBtn;
	
	@FindBy(xpath="(//span[contains(text(), 'Sign in')])[2]")
	private WebElement zooplaLoginBtn;
	
    @FindBy(xpath="//input[@id='email']")
	private WebElement zooplaEmail;
    
    @FindBy(xpath="//input[@id='current-password']")
	private WebElement zooplaPassword;
    
    @FindBy(xpath="//button[@class='_1erwn750 1erwn751 1erwn752 1erwn75a 1dgm2fc8']")
	private WebElement zooplaLoginBtn2;



	public WebElement getZooplaEmail() {
		return zooplaEmail;
	}

	public WebElement getZooplaPassword() {
		return zooplaPassword;
	}

	public WebElement getZooplaLoginBtn2() {
		return zooplaLoginBtn2;
	}

	public WebElement getZooplaLoginBtn() {
		return zooplaLoginBtn;
	}

	public List<WebElement> getAcceptCookiesBtn() {
		return acceptCookiesBtn;
	}

	public WebElement getWashington() {
		return washington;
	}

	public WebElement getUnitedStates() {
		return unitedStates;
	}


	public WebElement getDragOslo() {
		return dragOslo;
	}

	public WebElement getDropNorway() {
		return dropNorway;
	}

	public WebElement getServices() {
		return services;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getLogIn2() {
		return logIn2;
	}

	public WebElement getLogInBtn1() {
		return logInBtn1;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPassword() {
		return password;
	}
	
	

	
	

}
