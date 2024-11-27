# Use the Node.js 16 base image
FROM node:16

# Create a non-root user
RUN groupadd -r appgroup && useradd -r -g appgroup appuser

# Set the working directory
WORKDIR /app

# Copy package.json and package-lock.json to the working directory
COPY package.json package-lock.json /app/

# Install dependencies
RUN npm install

# Copy the entire codebase to the working directory
COPY . /app/

# Use a non-root user
USER appuser

# Expose the application port (optional)
EXPOSE 3000

# Start the application
CMD [ "npm", "start" ]
