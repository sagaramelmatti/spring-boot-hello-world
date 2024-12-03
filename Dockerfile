# Use a base image with Java 11
FROM openjdk:17
# Copy the JAR file to the container
COPY target/Spring-Boot-Demo-Project-1.0.jar app.jar
EXPOSE 8082
CMD ["java", "-jar", "app.jar"]