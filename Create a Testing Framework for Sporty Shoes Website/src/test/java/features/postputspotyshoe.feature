Feature: Post Put and Delete Shoe

Scenario: Add new shoe
Given User enters BaseURI and BasePath
When User executes HTTP post method
Then Print all the details on the console

Scenario: Update the shoe
Given User enter BaseUri and Basepath
When User executes HTTP put method
Then Prints all the details on the console

Scenario: Delete the shoe
Given User enter BaseUri Basepath
When User executes HTTP delete method
Then Prints all the detail on the console
