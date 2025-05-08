# FlightFinder

This repository contains React application and a Spring Boot App which wraps the React app.

To view the word finder UI, follow the steps described as below:
1) Open the terminal and clone the repository :
   Terminal command : git clone https://github.com/praveshmahto/FlightFinder.git
2) cd FlightFinder/springboot/flightcentre
3) mvn clean install
      **This will package the jar inside the target folder.**
4) java -jar target/flightcentre-0.0.1-SNAPSHOT.jar **
      **This will run the Spring Boot Application which is bundled with the React code.** 
5) Open http://locahost:8080 in browser  ## Assuming 8080 port is not used anywhere else
6) The above runs both the Spring Boot and React in 8080 port.

Alternatively, if you want to view the React UI in a separate port compared to Spring Boot, do as follows:
1) Run all steps as above
2) From the root of the repository navigate to react folder.
3) Run the command : npm start
   **This will open in the default 3000 port for React.**
4) Open http://localhost:3000 
   
