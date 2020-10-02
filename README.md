# webservice-handson
Hands-On Exercise for Java Fullstack Bootcamp - in TCS

This project was done using javax.ws.rs

Exercise description:

 - /math-api/operations/<operation-name>? number=15
 - Return html with JSON list of operations (endpoints):
 ["squared-root","power","euler","fibonacci","randomnumbers","prime","division","binary"]
 
Operations:
 - squared-root: Read a number n as query parameter and returns a JSON response with the
square-root of the number.
 - power: Read a number n as query parameter and return an XML response with the power of
the number.
 - euler: Read a number n as query parameter and return a JSON response with the Euler's
number e raised to the power of the parameter (e^n).
 - fibonacci: Read a number n as query parameter and return an HTML response n fibonacci
numbers starting from 1.
 - random-numbers: Read three numbers n, min and max as query parameters and return a
JSON list with n random numbers from min and max.
 - prime: Read a number n as query parameter and return a plain text response with true/false
depending if the number n is a prime number or not.
 - division: Read two numbers divisor and dividend, calculate the result and return a JSON
response with the quotient and remainder.
 - binary: Read a decimal number as query parameter and returns an XML response with binary
representation of the number.


