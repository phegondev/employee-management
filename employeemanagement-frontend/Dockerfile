# Use the Node.js 16 base image
FROM node:16

# Create a non-root user and group
RUN groupadd -g 1001 appgroup && \
    useradd -u 1001 -g appgroup -m appuser

# Set the working directory for the application
WORKDIR /usr/src/app

# Copy the package files and install dependencies
COPY package*.json ./
RUN npm install

# Copy the rest of the application code
COPY . .

# Change ownership of the working directory to the non-root user
RUN chown -R appuser:appgroup /usr/src/app

# Switch to the non-root user
USER appuser

# Expose the application port (optional, depending on your app)
EXPOSE 3000

# Command to run the application
CMD [ "npm", "start" ]

