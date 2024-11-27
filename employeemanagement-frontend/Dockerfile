# Use the Node.js 16 base image
FROM node:16

# Create a non-root user
RUN groupadd -r appgroup && useradd -r -g appgroup appuser

# Set the working directory
WORKDIR /usr/src/app

# Copy only the necessary files
COPY package*.json ./
RUN npm install
COPY . .

# Use a non-root user
USER appuser

# Expose the application port (optional)
EXPOSE 3000

# Start the application
CMD [ "npm", "start" ]
