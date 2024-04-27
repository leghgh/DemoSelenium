package com.e2etests.automation.step_definitions;

import com.e2etests.automation.pages_objects.BouletCorpPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BouletCorpStepDefinition {

	private BouletCorpPageObject bouletCorpPageObject;

	public BouletCorpStepDefinition() {
		bouletCorpPageObject = new BouletCorpPageObject();
	}

	@Given("J accede a l application boulet corp")
	public void jAccedeALApplicationBouletCorp() {
		
	}

	@When("Je clique sur a propos")
	public void jeCliqueSurAPropos() {
		bouletCorpPageObject.clickBtn();
	}

	@When("Je clique sur le lien instagram")
	public void jeCliqueSurLeLienInstagram() {
		bouletCorpPageObject.clickBtn2();
	}

	@Then("Je redirige vers la page instagram de boulet corp")
	public void jeRedirigeVersLaPageInstagramDeBouletCorp() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
