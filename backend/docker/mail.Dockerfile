FROM openjdk:16-jdk-alpine
EXPOSE 8081
RUN ./gradlew bootJar; mkdir -p /app/logs/
WORKDIR /app
COPY ../module-mail/build/libs/module-mail-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=prod", "-jar", "app.jar"]
