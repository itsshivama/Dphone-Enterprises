# Config-Server
FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY target/ConfigServer-0.0.1-SNAPSHOT.jar ConfigServer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ConfigServer-0.0.1-SNAPSHOT.jar"]
EXPOSE 8100