# Use the official OpenJDK 21 image
FROM openjdk:21-jdk


# Set the working directory
WORKDIR /app



# Copy the Maven Wrapper files
COPY mvnw mvnw
COPY .mvn .mvn

RUN icacls mvnw /grant Everyone:F


# Make the Maven Wrapper script executable
#RUN chmod +x mvnw

# Copy the entire project directory into the container
COPY . .

# Package the application
RUN ./mvnw clean package

# Set the entry point to run the packaged JAR file
ENTRYPOINT ["java", "-jar", "target/HR_Pulse.jar"]
