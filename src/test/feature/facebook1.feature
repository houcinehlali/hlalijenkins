@tag
Feature: compte facebook
 	@tag2
	Scenario Outline: compte facebbok passat et nn passat
    Given Ouvrir le  navigateurs
    And ouvrir urls
    When Creer un nouveau comptes
    And Saisir Prenoms "<prenom>"
    And nom de la familles "<nom>"
    And saisir emails "<email>"
    And Confirmer adresse emails "<email1>"
    And saisir mot de passes "<mdp>"
    And Selectionner le jour de naissances "<jour>"
    And Selectionner le mois de naissances "<mois>"
    And Selectionner annee de naissances "<annee>"
    And Choisir le genres "<genre>"
    And cliquer sur le bouton inscrires
    Then fermer le sites

    Examples: 
      | prenom  | nom   | email                 | email1                | mdp       | jour | mois | annee | genre |
      | houcine | hlali | houcinehlali@yahoo.fr | houcinehlali@yahoo.fr |  05889524 |   18 |    1 |  1983 | homme |
      | houcine | hlali | houcinehlali@yahoo.fr | houcinehlali@yahoo.fr | 123456789 |   17 |   12 |  1985 | homme |
