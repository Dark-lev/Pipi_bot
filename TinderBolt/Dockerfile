#FROM maven:3.9-amazoncorretto-21 AS build
#
#COPY pom.xml .
#COPY src ./src
#
#RUN mvn clean package -DskipTests
#
#FROM openjdk:22-ea-21-jdk-slim
#
#COPY --from=build /target/*.jar app.jar
#
#EXPOSE 8080
#
#ENTRYPOINT ["java", "-jar", "/app.jar"]

# Этап 1 — сборка
FROM maven:3.9.11-eclipse-temurin-17 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

RUN ls -l /app/target


# Этап 2 — запуск
FROM eclipse-temurin:17-jdk

WORKDIR /app

#COPY --from=build /app/target/*-SNAPSHOT.jar app.jar
#COPY --from=build /app/target/*-shaded.jar app.jar
#COPY --from=build /app/target/TinderBolt-1.0-SNAPSHOT-shaded.jar app.jar
COPY --from=build /app/target/*-SNAPSHOT.jar app.jar




EXPOSE 8080

#ENTRYPOINT ["java", "-jar", "app.jar"]
ENTRYPOINT ["java", "-Dfile.encoding=UTF-8", "-jar", "app.jar"]