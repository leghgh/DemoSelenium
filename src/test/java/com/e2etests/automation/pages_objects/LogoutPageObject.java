package com.e2etests.automation.pages_objects;


//import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.Setup;


public class LogoutPageObject {
	// Recherche des elements
	

	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement btnClick;

	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement btnLogout;
	//WebDriverWait wait=new WebDriverWait(Setup.getDriver(), Duration.ofMillis(200000));
	//wait.until(ExpectedConditions.elementToBeClickable(btnLogout));
	
	@FindBy(how = How.XPATH, using = "//div[@class='login_logo']")
	public static WebElement msgCred;
	
	public LogoutPageObject() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	// Methode
	public void clickBtttn() {
		btnClick.click();
	}

	public void clickBttn() {
		btnLogout.click();
	}

}
