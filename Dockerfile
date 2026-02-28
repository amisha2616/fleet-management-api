FROM eclipse-temurin:17-jdk
WORKDIR /app

COPY . .

# Give execute permission to Maven wrapper
RUN chmod +x mvnw

# Build the project
RUN ./mvnw clean install -DskipTests

EXPOSE 8080

CMD ["java","-jar","target/fleetapi-0.0.1-SNAPSHOT.jar"]