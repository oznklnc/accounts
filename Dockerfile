# Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# Add Maintainer Info
MAINTAINER ozn.klnc

# Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Run the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]