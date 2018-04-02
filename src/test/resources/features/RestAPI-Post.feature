Feature: Testing a REST API 
	Users should be able to submit POST request to a web service 


Background:
     Given User wants to delete data in Json 
	 When User send a DELETE request 
	 

@post	
Scenario: Data Upload to a web service 
	Given User upload data to Json 
	When User send a POST request 
	And the server should handle it and return a success status 
	And User send a GET request
	Then User should check data has posted or not
	
@post-neg	
Scenario: Data Upload to a web service with duplicate id
	Given User upload duplicate data to Json 
	When User send a POST request 
	Then the server should return a invalid status code
	
