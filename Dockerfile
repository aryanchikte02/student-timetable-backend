# 1️⃣ Use Java 17 (recommended for Spring Boot)
FROM eclipse-temurin:17-jdk-alpine

# 2️⃣ Set working directory
WORKDIR /app

# 3️⃣ Copy Maven wrapper & pom
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

# 4️⃣ Download dependencies (faster builds)
RUN ./mvnw dependency:go-offline

# 5️⃣ Copy source code
COPY src src

# 6️⃣ Build the Spring Boot application
RUN ./mvnw clean package -DskipTests

# 7️⃣ Run the app
CMD ["java", "-jar", "target/Student-list-0.0.1-SNAPSHOT.jar"]
