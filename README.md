## Challenge-01

### Scenario
* This simulates the scenario of a developer who is given a task of enhancing an existing service that was created by another developer
* The pain of understanding what extensions are required should be resolved by the developer that is assigned this enhancement task


### Set Up + verification
* Open a terminal. Run the quarkus application in dev mode with the command : "./mvnw quarkus:dev"
* Say "y" to the question (if required) : Do you agree to contribute anonymous build time data to the Quarkus community? 
* On the prompt press [r] to resume testing. This will result in an error
* Open the "src/main/java/org/acme/DateResource.java". You will observe the method "getCurrentDate" needs to be fixed.
* When you select all the code, right click and choose format, the code does not format

### Success Criteria
* Required extensions are installed for formatting and java intellisense
* Code is formatted with the extensions
* Method getCurrentDate code is completed. The code should show java intellisense in action


### Resources
* 
* 

