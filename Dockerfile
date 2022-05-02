# Dockerfile
FROM adoptopenjdk:11.0.10_9-jre-hotspot
RUN useradd app
USER app
COPY target/*.jar /Calculator-1.0.3.jar
CMD ["java", "-jar", "/Calculator-1.0.3.jar"]


