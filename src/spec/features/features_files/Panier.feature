@panier
Feature: Panier
  En tant que utilisateur je souhaite verifier que j ai un produit dans le panier 

@verifPanier
  Scenario: Je souhaite verifier que j ai un produit dans le panier
    Given J accede a l application SwagLabs
    When Je saisi le username "standard_user"
    And Je saisi le mot de passe "secret_sauce"
    And Je clique sur le bouton de connexion
    And Je rajoute dans le panier le backpack
    Then j ai un seul poroduit dans le panier "1"
    