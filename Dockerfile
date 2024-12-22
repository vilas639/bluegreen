# Use an OpenJDK image as the base
FROM openjdk:17-jdk-slim


# Set the working directory inside the container
ADD target/bluegreen-0.0.1-SNAPSHOT.jar  bluegreen-0.0.1-SNAPSHOT.jar


# Expose the port the application runs on
EXPOSE 8083

# Run the application
ENTRYPOINT ["java", "-jar", "bluegreen-0.0.1-SNAPSHOT.jar"]