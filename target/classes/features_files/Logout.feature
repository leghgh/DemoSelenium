@logout
Feature: Deconnexion
  En tant que utilisateur je souhaite tester la deconnexion de l application Swag Labs 

 @deconnexion
  Scenario: Je souhaite tester la deconnexion
    Given J accede a l application SwagLabs
    When Je saisi le username "standard_user"
    And Je saisi le mot de passe "secret_sauce"
    And Je clique sur le bouton de connexion
    And Je clique sur menu
    And je clique sur logout
    Then je me redirige vers la page d authentification 'Swag Labs'