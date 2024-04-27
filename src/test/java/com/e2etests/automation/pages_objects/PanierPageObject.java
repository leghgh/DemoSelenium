package com.e2etests.automation.pages_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class PanierPageObject {

	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	public static WebElement btnAdd;

	
	@FindBy(how = How.XPATH, using = "//*[@id='shopping_cart_container']/a/span")
	public static WebElement msgOne;
	
	
	public PanierPageObject() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	//Methode
	public void clickBttn() {
		btnAdd.click();
	}

}
