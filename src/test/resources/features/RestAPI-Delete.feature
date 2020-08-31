Feature: Testing a REST API, Users should be able to submit DELETE request to a web service 
	
@delete 
Scenario: Data delete in a web service 
	Given User wants to delete data in Json 
	When User send a DELETE request 
	Then the server should remove api and return a success status 
	
	
	
@del-neg 
Scenario: Trying to delete entire data in json 
	Given User send a DELETE request by giving base url
	Then the server should return a invalid code
