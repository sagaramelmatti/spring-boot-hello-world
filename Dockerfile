# Use a lightweight base image with Java 17
FROM openjdk:17-slim

# Set a working directory
WORKDIR /app

# Copy the JAR file to the container
COPY target/spring-boot-hello-world-1.0.jar app.jar

# Expose the application port
EXPOSE 8082

# Add a health check (optional, ensures container health)
HEALTHCHECK --interval=30s --timeout=5s --start-period=10s --retries=3 \
CMD curl -f http://localhost:8082/actuator/health || exit 1

# Run the application
CMD ["java", "-jar", "app.jar"]
