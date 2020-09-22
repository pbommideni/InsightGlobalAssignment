# String Operations - Store Palindrome

This project helps in maintaining the longest palindromes possible for any string and allows user to fetch and add palindromes to the database.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

JDk 1.8 or higher, Eclipse or any IDE, Postman to test APIs

### Running

Run the main application file and the application is deployed on default port 8080

You can change the port number by configuring the value for server.port in application.properties file.

Once started , you can see that the 3 APIs are created with  mappings /getAllPalindromes,
 /getPalindromeById and /storePalindrome 
that are used to fetch all, fetch by id and store respectively.
 
Store Palindrome  Example
 http://localhost:8080/storePalindrome?value=abbbbbbbbbbbacdadda
 
 Response {"id":1,"value":"abbbbbbbbbbba"}
 
 Fetch Palindrome Example
 http://localhost:8080/getPalindrome?id=1  
 
 Response  is abbbbbbbbbbba ( as 'abbbbbbbbbbba' is the longest possible palindrome in the string abbbbbbbbbbbacdadda)

Fetch all palindromes Example

http://localhost:8080/getAllPalindromes

Response: [{"id":1,"value":"abbbbbbbbbbba"},{"id":2,"value":"abbbbbbbbbbba"},{"id":3,"value":"sas"}]
 
 



