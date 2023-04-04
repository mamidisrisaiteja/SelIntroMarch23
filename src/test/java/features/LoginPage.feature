Feature: Test a web site

Scenario Outline:  To verify login functionality
Given To navigate to website
Then verify LoginPage title
When enter the 'mamidisrisaiteja@gmail.com' and 'Srisai@90'  and click submit button
#Then user able to navigate to home page from loginpage

#Hi this is my first commit
#hi this is jasmi this is my first commit
 Examples:
     | username | password |
     | mamidisrisaiteja@gmail.com | Srisai@90 |