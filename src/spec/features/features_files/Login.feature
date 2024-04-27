@login
Feature: Authentification
  En tant que utilisateur je souhaite tester la page de la connexion de l application Swag Labs 

  @connexion-casPassant
  Scenario: Je souhaite tester la page de la connexion avec un cas passant
    Given J accede a l application SwagLabs
    When Je saisi le username "standard_user"
    And Je saisi le mot de passe "secret_sauce"
    And Je clique sur le bouton de connexion
    Then Je me redirige vers la page d acceuil "Products"
    @connexion-casNonPassant
    Scenario: Je souhaite tester la page de la connexion avec un cas passant
    Given J accede a l application SwagLabs
    When Je saisi le username "Leila"
    And Je saisi le mot de passe "secret_sauce"
    And Je clique sur le bouton de connexion
    Then un message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"