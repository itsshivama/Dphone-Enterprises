# Service-Registry
FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY target/CustomerServiceRegistry-0.0.1-SNAPSHOT.jar CustomerServiceRegistry-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/CustomerServiceRegistry-0.0.1-SNAPSHOT.jar"]