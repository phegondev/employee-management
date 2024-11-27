FROM openjdk:17-jdk-alpine

# Create a non-root user and group
RUN addgroup -S appgroup && adduser -S appuser -G appgroup

# Set working directory
WORKDIR /app

# Copy JAR file
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Set permissions for the non-root user
RUN chown -R appuser:appgroup /app

# Switch to the non-root user
USER appuser

# Define an environment variable for the port (optional, can be overridden)
ENV SERVER_PORT=8081

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar", "--server.port=${SERVER_PORT}"]

# Expose the application port
EXPOSE 8081
