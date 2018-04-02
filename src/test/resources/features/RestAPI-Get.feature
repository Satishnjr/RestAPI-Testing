Feature: Testing a REST API 
	Users should be able to submit GET request to a web service 

@get 
Scenario: Data retrieval from a web service 
	Given User send a GET request 
	When server processes the request 
	And User should verify the correct statusCode 
	Then User should vaidate data
	

	
@get-neg 
Scenario: Testing get request by giving invalid URI 
	Given User send a GET request with invalid url 
	Then User should not get any response from server 
	

