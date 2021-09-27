FROM openjdk:16-jdk-alpine
EXPOSE 8082
RUN ./gradlew bootJar; mkdir -p /app/logs/
WORKDIR /app
COPY ../module-stomp/build/libs/module-stomp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=prod", "-jar", "app.jar"]
