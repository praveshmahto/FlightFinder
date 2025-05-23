# Flight Finder 
<br> **Simple application named “Flight Finder” with the goal of determining how many
instances of the word “flight” are possible in a supplied string.**

This repository contains React application and a Spring Boot App which wraps the React app.

To view the word finder UI, follow the steps described as below:
1) Open the terminal and clone the repository :
   Terminal command : git clone https://github.com/praveshmahto/FlightFinder.git
2) cd FlightFinder/springboot/flightcentre
3) mvn clean install
      <br>**This will package the jar inside the target folder.**
4) java -jar target/flightcentre-0.0.1-SNAPSHOT.jar 
      <br>**This will run the Spring Boot Application which is bundled with the React code.** 
5) Open http://locahost:8080 in browser  ## Assuming 8080 port is not used anywhere else
6) The above runs both the Spring Boot and React in 8080 port.

Alternatively, if you want to view the React UI in a separate port compared to Spring Boot, do as follows:
1) Run all steps as above
2) From the root of the repository navigate to react folder.
3) Run the command : npm start
   <br>**This will open in the default 3000 port for React.**
4) Open http://localhost:3000

## Development Notes ##
Specifications

• The logic to fetch word count is written in Java and utilise the Spring Boot framework. <br>
•  A frontend interface(React) accepts a string(jumbled/straight) and return the number of instances of the word
   ("flight" is default) that can be formed.<br>
• The frontend communicates with a backend REST API.<br>
• Only lower-case characters will be given as an input.Even if the user enters Uppercase, the UI converts into lowercase. <br>
• The string input textarea limits the user to enter maximum of 100 characters.<br>
   
   
