FROM openjdk:17
WORKDIR /patient
COPY target/*.jar patient.jar
ENTRYPOINT ["java","-jar","patient.jar"]