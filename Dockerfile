FROM eclipse-temurin:25-jdk-alpine
EXPOSE 8080
VOLUME /tmp
ADD /target/*.jar docker-spring-boot-app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/docker-spring-boot-app-0.0.1-SNAPSHOT.jar"]
