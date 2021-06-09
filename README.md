# Switch Statements and Poor Naming

## Trainee Guide

For this exercise, you are looking to refactor TWO code smells:
* Switch Statements
* Poor Naming

Research the code smell and fix it in the code.
Present it back to the team by explaining: 
* What are the code smells?
* What is the effect? Why is it bad to leave them?
* How did you fix it? Show us the before and after.

## Starting Refactoring Techniques Exercise

##### Clone the project
```shell
git clone <link to repo>
```

##### Checkout and update the master
```shell
git pull -r
```

##### Create a new branch with TWU Number, Team Number and Pair Name:
```shell
git checkout -b refactoring-techniques-<TWU_TERM>-<TEAM>-<PAIR_NAME>
```

##### After finishing the exercise, submit your changes
```shell
git fetch origin master && \
git add . && \
git commit -m "WIP - Refactoring Techniques Session" && \
git push origin refactoring-techniques-<TWU_TERM>-<TEAM>-<PAIR_NAME> --no-verify
```

## About this Application

This application contains code snippets to calculate invoice statements for Customers who are renting Movies. 
Based on the type of Movie that is rented out and how long it's been rented out for, the prices and frequent renter points earnt are calculated and displayed on the customer statement. 

Scenarios can be reviewed and executed from the tests, expected outputs are in the test resources folder.

Example output: 

```
Rental Record for Dinsdale Pirhana
	Monty Python and the Holy Grail	3.5
	Ran	2.0
	LA Confidential	6.0
	Star Trek 13.2	3.0
	Wallace and Gromit	6.0
Amount owed is 20.5
You earned 6 frequent renter points
```

