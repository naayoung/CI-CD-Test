# Build
FROM eclipse-temurin:17-jdk AS build

WORKDIR /src
COPY . /src
RUN chmod +x ./gradlew
RUN ./gradlew build -x test

# Run
FROM eclipse-temurin:17-jre
EXPOSE 8080
COPY  --from=build /src/build/libs/*SNAPSHOT.jar spring-jenkins-test.jar

ENTRYPOINT ["java", "-jar", "spring-jenkins-test.jar"]
