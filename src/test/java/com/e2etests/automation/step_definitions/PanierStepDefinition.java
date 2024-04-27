package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.pages_objects.PanierPageObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PanierStepDefinition {
	private PanierPageObject panierPageObject;
	public PanierStepDefinition() {
		panierPageObject=new PanierPageObject();	
	}



	@When("Je rajoute dans le panier le backpack")
	
		public void jeRajouteDansLeBasketLeBackpack() {
			panierPageObject.clickBttn();

	}
	@Then("j ai un seul poroduit dans le panier {string}")
		public void jAiUnSeulPoroduitDansLeBasket(String m1) {
			String msg1=PanierPageObject.msgOne.getText();
			Assert.assertEquals(m1, msg1);

	}



}
