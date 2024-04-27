package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.pages_objects.LoginPageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {
	private LoginPageObjects loginPageObject;
	public LoginStepDefinition() {
		loginPageObject=new LoginPageObjects();	
	}
	
	/*

	@Then("un message d erreur s affiche {string}")
	public void unMessageDErreurSAffiche(String m) {
		String msg=LoginPageObjects.msgErreur.getText();
		Assert.assertEquals(m, msg);
	}*/


	@Given("J accede a l application SwagLabs")
	public void jAccedeALApplicationSwagLabs() {
		loginPageObject.connectToApp();
	}
	@When("Je saisi le username {string}")
	public void jeSaisiLeUsername(String string) {
		loginPageObject.fillUsername(string);
	}
	@When("Je saisi le mot de passe {string}")
	public void jeSaisiLeMotDePasse(String string) {
		loginPageObject.fillPassword(string);
	}
	@When("Je clique sur le bouton de connexion")
	public void jeCliqueSurLeBoutonDeConnexion() {
		
		    loginPageObject.clickBtn();
	}
	@Then("Je me redirige vers la page d acceuil {string}")
	public void jeMeRedirigeVersLaPageDAcceuil(String msg) {
		   String titlePage=LoginPageObjects.title.getText();
		   Assert.assertEquals(msg, titlePage);
	}


	@Then("un message d erreur s affiche {string}")
	public void unMessageDErreurSAffiche(String m) {
		String msg=LoginPageObjects.msgErreur.getText();
		Assert.assertEquals(m, msg);
	}





}
