package com.e2etests.automation.step_definitions;

import org.junit.Assert;


import com.e2etests.automation.pages_objects.LogoutPageObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {
	private LogoutPageObject logoutPageObject;

	public LogoutStepDefinition() {
		logoutPageObject = new LogoutPageObject();
	}

	@When("Je clique sur menu")
	public void jeCliqueSurMenu() {
		logoutPageObject.clickBtttn();
	}

	@When("je clique sur logout")
	public void jeCliqueSurLogout() {
		logoutPageObject.clickBttn();
	}

	@Then("je me redirige vers la page d authentification {string}")
	public void jeMeRedirigeVersLaPageDAuthentification(String msgL) {
		   String msgtitleP=LogoutPageObject.msgCred.getText();
		   Assert.assertEquals(msgL, msgtitleP);
	}

}
