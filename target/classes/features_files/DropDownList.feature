@ddl
Feature: ChoisirFiltre
  En tant que utilisateur je souhaite tester le filtre pour le choix des produits

  @dropDownList
  Scenario: Je souhaite tester le filtre du plus cher au moins cher
    Given J accede a l application SwagLabs
    When Je saisi le username "standard_user"
    And Je saisi le mot de passe "secret_sauce"
    And Je clique sur le bouton de connexion
    And Je clique la liste deroulante
    And Je choisie du plus cher au moins cher
    Then Les produits les plus chers s affichent en premier