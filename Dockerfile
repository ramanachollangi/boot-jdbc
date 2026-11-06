# Use Java 17 as the foundation
# Stage 1: Build the application using Gradle
FROM eclipse-temurin:17-jdk-alpine AS build
WORKDIR /app

# Copy gradle wrapper and build files first for dependency caching
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

# Build the executable jar file
RUN chmod +x gradlew && ./gradlew bootJar --no-daemon

# Stage 2: Create the final lightweight runtime image
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /app/build/libs/*.jar boot-jdbc.jar

#Automatically copy your built jar into the image during the build process
#COPY build/libs/boot-jdbc-0.0.1-SNAPSHOT.jar boot-jdbc.jar

# Tell the container what command to run when it starts
ENTRYPOINT ["java", "-jar", "boot-jdbc.jar"]