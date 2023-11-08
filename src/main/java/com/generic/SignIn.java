package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.BaseConfig;
import com.util.HighlightWebElement;
import com.util.ScreenShot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn {
	
	public void getSignIn() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// headless browser/ Ghost browser
		//ChromeOptions ghostbrowser =new ChromeOptions();
		//ghostbrowser.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver();
		
		// implicit wait
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.navigate().to(BaseConfig.getConfigValue("QA_URL"));
		driver.manage().window().maximize();
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		//Explicit wait(to wait until the login button in home page is loaded)
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getLogInBtn1()));
		
		// Highlight Login/SignUp Button
		HighlightWebElement.addColor(driver, mpf.getLogInBtn1());
		Thread.sleep(5000);
		mpf.getLogInBtn1().click();
		
		// ScreenShot
		ScreenShot.getScreenShot(driver, "login/signup_page");
		
		// Highlight EmailField
		HighlightWebElement.addColor(driver,mpf.getEmailField());
		mpf.getEmailField().sendKeys(BaseConfig.getConfigValue("email"));
		
		//Highlight Password Button
		HighlightWebElement.addColor(driver, mpf.getPassword());
		mpf.getPassword().sendKeys(BaseConfig.getConfigValue("password"));
		
		// Highlight LoginBtn2
		HighlightWebElement.addColor(driver, mpf.getLogIn2());
		mpf.getLogIn2().click();
		
		
		
		if(mpf.getLogoutBtn().isDisplayed()) {
			System.out.println("Login successful");	
		}
		else {
			System.out.println("Login Failed!");
		}
		
	}

}
