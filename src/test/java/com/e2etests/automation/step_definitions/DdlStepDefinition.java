package com.e2etests.automation.step_definitions;

import com.e2etests.automation.pages_objects.DdlPageObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DdlStepDefinition {
	private DdlPageObject ddlPageObject;

	public DdlStepDefinition() {
		ddlPageObject = new DdlPageObject();
	}

	@When("Je clique la liste deroulante")
	public void jeCliqueLaListeDeroulante() {
		ddlPageObject.select();
	}

	@When("Je choisie du plus cher au moins cher")
	public void jeChoisieDuPlusCherAuMoinsCher() {
		ddlPageObject.selectByValue("hilo");
	}

	@Then("Les produits les plus chers s affichent en premier")
	public void lesProduitsLesPlusChersSAffichentEnPremier() {

	}

}
