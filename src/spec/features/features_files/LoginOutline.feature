@loginOutline
Feature: AuthentificationOutline
  je souhaite me connecter a l application avec plusieurs comptes

  Scenario Outline: je souhaite me connecter a l application avec plusieurs comptes
    Given J accede a l application SwagLabs
    When Je saisi le username "<username>"
    When Je saisi le mot de passe "<password>"
    When Je clique sur le bouton de connexion

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
