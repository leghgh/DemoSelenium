package com.e2etests.automation.pages_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class BouletCorpPageObject {

	// Recherche des elements
	@FindBy(how = How.XPATH, using = "//*[@id='container']/nav/ul/li[4]/a")
	public static WebElement btnApropos;
	
	@FindBy(how = How.XPATH, using = "//*[@id='container']/footer/ul/li[3]/div/a/img")
	public static WebElement btnInstagramLink;
	
	public BouletCorpPageObject() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	// Methode
	public void connectToApp() {
		Setup.getDriver().get("https://www.bouletcorp.com/");
	}
	
	  public String getCurrentBouletCorpURL() {
	        return Setup.getDriver().getCurrentUrl();
	    }
	  
	    public String getCurrentInstagramURL() {
	        btnInstagramLink.click(); 
	        String instagramURL = Setup.getDriver().getCurrentUrl();
	    }
	public void clickBtn()
	{
		btnApropos.click();
	}
	public void clickBtn2()
	{
		btnInstagramLink.click();
	}
}
