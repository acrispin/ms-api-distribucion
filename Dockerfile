FROM openjdk:8
# VOLUME /logs
ADD ms-api-distribucion/target/*.jar ms-api-distribucion.jar
ENTRYPOINT ["java", "-jar", "ms-api-distribucion.jar"]
