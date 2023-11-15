Feature: Get All Shoes and Users

Scenario: Get All Shoes

Given User enters the BaseUri and BasePath
When User executes HTTP get method
Then Validate the response status code and print all the details on the console
