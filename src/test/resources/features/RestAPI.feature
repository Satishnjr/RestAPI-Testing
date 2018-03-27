Feature: Testing a REST API 
	Users should be able to submit GET, POST, PUT and DELETE requests to a web service 

@get 
Scenario: Data retrieval from a web service 
	Given User send a GET request 
	When server processes the request 
	And User should verify the correct statusCode 
	Then User should vaidate data
	
@post 
Scenario: Data Upload to a web service 
	Given User upload data to Json 
	When User send a POST request 
	And the server should handle it and return a success status 
	And User send a GET request
	Then User should check data has posted or not
	
@put 
Scenario: Data Modify in a web service 
	Given User wants to modify data in Json 
	When User send a PUT request 
	And the server should return a success status 
	And User send a GET request
	Then User should check data has modified or not
	
	
@delete 
Scenario: Data delete in a web service 
	Given User wants to delete data in Json 
	When User send a DELETE request 
	Then the server should remove api and return a success status 
	
	
@get_neg 
Scenario: Testing get request by giving invalid URI 
	Given User send a GET request with invalid url 
	Then User should not get any response from server 
	
@post_neg 
Scenario: Data Upload to a web service with duplicate id
	Given User upload duplicate data to Json 
	When User send a POST request 
	Then the server should return a invalid status code
	
@put_neg 
Scenario: Testing put request by giving invalid URI 
	Given User wants to modify data in Json 
	When User send a PUT request by giving invalid id 
	Then the server should return a invalid status 
	
@del_neg 
Scenario: Trying to delete entire data in json 
	Given User send a DELETE request
	Then the server should return a invalid code
