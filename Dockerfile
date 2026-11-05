# Use Java 17 as the foundation
FROM mosipdev/openjdk-17-jre:latest

# Automatically copy your built jar into the image during the build process
COPY build/libs/boot-jdbc-0.0.1-SNAPSHOT.jar create-store-1.jar

# Tell the container what command to run when it starts
ENTRYPOINT ["java", "-jar", "create-store-1.jar"]