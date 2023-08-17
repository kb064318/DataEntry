# Data Entry Application

This is a simple data entry web application created using Java 20, Maven, and Spring. JPA and H2 are utilized to allow for local persistent storage.

## Installation

### Requirements
This application is designed to run on Windows 10 or above.

The web browsers officially supported by this application are Edge, Chrome, and Firefox.

This project utilizes Java 20 and Maven. You can download Java here:
https://www.java.com/download/ie_manual.jsp

Once you have Java installed, Maven can be downloaded here:
https://maven.apache.org/download.cgi

It is strongly recommended to follow the Maven installation guide, including the recommended edits to the PATH it lists. This guide will assume you have followed these instructions. Maven installation instructions can be found here:
https://maven.apache.org/install.html

### Compilation
To compile the code, navigate to the source directory of the project and run:
```
mvn package
```
This will generate a .jar file in the directory "{project directory}/target". The name of the generated .jar file should be "dataentry-0.0.1-SNAPSHOT.jar".

## Execution
To run the generated .jar file, navigate to the source directory of the project and run the command:
```
java -jar target/dataentry-0.0.1-SNAPSHOT.jar
```
The default port for this application is 8080. To access the website, open a browser and go to http://localhost:8080/entry.