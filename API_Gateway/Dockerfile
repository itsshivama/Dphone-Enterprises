# API-Gateway
FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY target/DphoneAPIGateway-0.0.1-SNAPSHOT.jar DphoneAPIGateway-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/DphoneAPIGateway-0.0.1-SNAPSHOT.jar"]