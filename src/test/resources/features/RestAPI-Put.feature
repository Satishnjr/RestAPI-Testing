Feature: Testing a REST API 
	Users should be able to submit PUT request to a web service 


@put 
Scenario: Data Modify in a web service 
	Given User wants to modify data in Json 
	When User send a PUT request 
	And the server should return a success status 
	And User send a GET request
	Then User should check data has modified or not
	
	

@put-neg 
Scenario: Testing put request by giving invalid URI 
	Given User wants to modify data in Json 
	When User send a PUT request by giving invalid id 
	Then the server should return a invalid status 

