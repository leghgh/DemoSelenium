@boulet
Feature: VerifiSite
En tant que utilisateur je souhaite tester les liens du site boulet Corp

@boulet-corp
Scenario: Je souhaite tester les liens du site boulet corp
Given J accede a l application boulet corp
When Je clique sur a propos
And Je clique sur le lien instagram
Then Je redirige vers la page instagram de boulet corp

