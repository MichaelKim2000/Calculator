# Dockerfile
FROM adoptopenjdk:11.0.10_9-jre-hotspot
RUN useradd app
USER app
CMD ["java", "-jar", "/Calculator-1.0.2.jar"]
COPY target/*.jar /Calculator-1.0.2.jar