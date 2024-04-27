package com.e2etests.automation.pages_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.Setup;

public class DdlPageObject {

	// Recherche des elements
	
	@FindBy(how = How.XPATH, using = "//select[@class='product_sort_container']")
	public static WebElement titleList;
	private Select dropDownList;
	
	public DdlPageObject() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	// Methode
	public void select()
	{
		dropDownList = new Select(titleList);
	}
	
    public void selectByValue(String value) {
        dropDownList.selectByValue(value);
	}
	
}
